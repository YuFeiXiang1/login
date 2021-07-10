package com.example.sprint1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class reset_Activity extends AppCompatActivity {
    TextView username;
    EditText pass;
    EditText repass;
    Button confirm;
    DBhelper DB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset);

        username =(TextView) findViewById(R.id.username_reset_text);
        pass =(EditText)findViewById(R.id.password_reset);
        repass=(EditText) findViewById(R.id.repassword_reset);
        confirm=(Button) findViewById(R.id.btconfirm);
        DB= new DBhelper(this);

        Intent intent=getIntent();
        username.setText(intent.getStringExtra("username"));

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=username.getText().toString();
                String password = pass.getText().toString();
                String repassword=repass.getText().toString();
                if(password.equals(repassword)) {

                    Boolean checkpasswordupdate = DB.updatepassword(user, password);
                    if (checkpasswordupdate == true) {
                        Intent intent = new Intent(getApplicationContext(), LoginInterface.class);
                        startActivity(intent);
                        Toast.makeText(reset_Activity.this, "password is updated successfuly", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(reset_Activity.this, "password is not updated successfuly", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(reset_Activity.this, "password is not matched", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}