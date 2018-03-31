package com.example.camil.workinghourschecker;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;




public class LoginPage extends Activity {
    Button login;
    AutoCompleteTextView email;
    EditText password;



    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        login = findViewById(R.id.loginButton);
        email = findViewById(R.id.emailInput);
        password = findViewById(R.id.passwordInput);


        //Make to check whether the email is in the database
        //THEN check if the password matches the associated password in the database. Or?
        login.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {


            }

        } );
    }
}