package com.example.primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*declaration id Button*/
        Button btnSignIn = findViewById(R.id.btnSingIn);
        /*declaration id EditText*/
        EditText txtUserName = findViewById(R.id.txtUsername);
        EditText txtPassword = findViewById(R.id.txtPassword);
        /*declaration id Label*/
        TextView lblLoginResult = findViewById(R.id.lblLoginResult);

        /*declaration when button is clicked*/
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            /*This checks if you log in with the user "admin" and password "admin", the label will tell you if you have logged in correctly*/
            public void onClick(View v) {
                if (txtUserName.getText().toString().equals("admin") && txtPassword.getText().toString().equals("admin")) {
                    lblLoginResult.setText("Loggued in");/*Text on Label*/
                    Log.i("Test", "Login ok");/*If the interaction with the click works, you will see an ok in the log*/
                } else {
                    Log.i("Test", "Login ko");/*if the interaction with the click does not work you will see a ko in the log*/
                }
            }
        });
    }
}

