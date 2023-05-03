package com.example.myprojectapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText useremail = (EditText) findViewById(R.id.myemail);
        EditText uerpassword = (EditText) findViewById(R.id.mypassword);
        TextView forgotpass = (TextView) findViewById(R.id.forgotpass);
        Button signup = (Button) findViewById(R.id.registerbtn);
        Button logintbn = (Button) findViewById(R.id.loginbtn);
         logintbn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 String stremail = useremail.getText().toString();
                 String strtpass = uerpassword.getText().toString();
                 DBHelper dbHelper = new DBHelper(MainActivity.this);
                 if (stremail.equals("") || strtpass.equals(""))
                     Toast.makeText(MainActivity.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                 else {
//                     Boolean checkuserpass = DB.checkemailpassword(stremail, strtpass);
                     Boolean checkUser = dbHelper.checkemailpassword(stremail,strtpass);
                     if (checkUser) {
                         Toast.makeText(MainActivity.this, "Sign in successfull", Toast.LENGTH_SHORT).show();
                        Intent intent  = new Intent(getApplicationContext(), HomeActivity.class);
                        startActivity(intent);
                     } else {
                         Toast.makeText(MainActivity.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                     }
                 }
             }
         });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SignUpActivity.class);
                startActivity(intent);
            }
        });

        forgotpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}