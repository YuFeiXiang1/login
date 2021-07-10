package com.example.sprint1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button Login;
    private Button NewUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText)findViewById(R.id.UserName);
        password=(EditText)findViewById(R.id.editTextTextPassword);
        Login=(Button)findViewById(R.id.Login);
        NewUser=(Button)findViewById(R.id.NewUser);

    }
}