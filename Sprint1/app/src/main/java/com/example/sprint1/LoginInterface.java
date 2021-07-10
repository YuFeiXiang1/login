package com.example.sprint1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginInterface extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button Login;
    private Button NewUser;
    private TextView Reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText)findViewById(R.id.UserName);
        password=(EditText)findViewById(R.id.editTextTextPassword);
        Login=(Button)findViewById(R.id.Login);
        NewUser=(Button)findViewById(R.id.NewUser);
        Reset=(TextView)findViewById(R.id.Reset);

            Login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
            NewUser.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

            Reset.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
            Intent intent= new Intent(getApplicationContext(),reset_password.class);
            startActivity(intent);
                }
            });

    }
}