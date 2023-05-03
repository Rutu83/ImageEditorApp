package com.example.myprojectapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton Button1 = (ImageButton) findViewById(R.id.btnGallary);
        ImageButton Button2 = (ImageButton) findViewById(R.id.framebtn);
        ImageButton Button3 = (ImageButton) findViewById(R.id.folderbtn);
        ImageButton Button4 = (ImageButton) findViewById(R.id.collagebtn);

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
            }
        });

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                startActivityForResult(intent,100);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100){
            if(data.getData() != null){
                Uri filepath = data.getData();
                Intent intent = new Intent(HomeActivity.this,EditImage.class);
                intent.setData(filepath);
                startActivity(intent);
            }
        }
    }


}