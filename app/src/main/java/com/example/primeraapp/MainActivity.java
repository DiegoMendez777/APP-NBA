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

        Button btnSignIn = findViewById(R.id.btnSingIn);
        EditText txtUserName = findViewById(R.id.txtUsername);
        EditText txtPassword = findViewById(R.id.txtPassword);
        TextView lblLoginResult = findViewById(R.id.lblLoginResult);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (txtUserName.getText().toString().equals("admin") && txtPassword.getText().toString().equals("admin")) {
                    lblLoginResult.setText("Loggued in");
                    Log.i("Test", "Login ok");
                } else {
                    Log.i("Test", "Login ko");
                }
            }
        });
    }
}

