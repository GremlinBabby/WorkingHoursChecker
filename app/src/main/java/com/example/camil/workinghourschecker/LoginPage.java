package com.example.camil.workinghourschecker;


import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;


public class LoginPage extends AppCompatActivity {
    Button login;
    AutoCompleteTextView email;
    EditText password;

    //References to database
    DatabaseReference databaseTimeStamp;
    DatabaseReference databaseCheckIn;
    DatabaseReference databaseCheckOut;
    DatabaseReference databaseWorker;
    DatabaseReference databaseAdmin;


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        login = findViewById(R.id.loginButton);
        email = findViewById(R.id.emailInput);
        password = findViewById(R.id.passwordInput);


        //Initiating database



        //Make to check whether the email is in the database
        //THEN check if the password matches the associated password in the database. Or?
        //If no match, go to register page
        login.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {


            }

        } );



    }
}