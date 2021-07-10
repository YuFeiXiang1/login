package com.example.sprint1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class reset_password extends AppCompatActivity {
    EditText username;
    Button reset;
    DBhelper DB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        username=(EditText)findViewById(R.id.username_reset);
        reset =(Button) findViewById(R.id.btreset);
        DB = new DBhelper(this);


        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=username.getText().toString();

            Boolean checkuser=DB.checkusername(user);

            if(checkuser==true){
                Intent intent=new  Intent(getApplicationContext(),reset_password.class);
                intent.putExtra("username",user);
                startActivity(intent);
            }
            else{
                Toast.makeText(reset_password.this,"User does not exist",Toast.LENGTH_SHORT).show();
            }

            }
        });

    }
}