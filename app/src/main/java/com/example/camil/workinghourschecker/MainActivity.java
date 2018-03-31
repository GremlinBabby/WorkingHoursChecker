package com.example.camil.workinghourschecker;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;


public class MainActivity extends AppCompatActivity {
    Button login;
    AutoCompleteTextView email;
    EditText password;

    //References to database
    DatabaseReference databaseTimeStamp;
    DatabaseReference databaseCheckIn;
    DatabaseReference databaseCheckOut;
    DatabaseReference databaseWorker;
    DatabaseReference databaseAdmin;
    DatabaseReference databaseStatus;


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        login = findViewById(R.id.loginButton);
        email = findViewById(R.id.emailInput);
        password = findViewById(R.id.passwordInput);


        //Initiating database



        login.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {

                /**Make if statement for checking for existing email
                If match = check email in database for pass, then check with input

                 If no match, redirect to RegisterPage.class:

                else {
                Intent intent = new Intent (view.getContext(), RegisterPage.class);
                startActivityForResult(intent; 0);
                 }

                 **/
            }

        } );



    }
}