//package com.example.myprojectapp;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.ImageView;
//import android.widget.Toast;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//public class Frames extends AppCompatActivity {
//
//    ImageView frame1,frame2,frame3,frame4;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_frames);
//
//        frame1.findViewById(R.id.frame1);
//        frame2.findViewById(R.id.frame2);
//        frame3.findViewById(R.id.frame3);
//        frame4.findViewById(R.id.frame4);
//
//        frame1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intentframe1 = new Intent(getApplicationContext(), SetPhotoFrame.class);
//                startActivity(intentframe1);
//                Toast.makeText(Frames.this,"frame 1 BUTTON TAPPED",Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        frame2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intentframe2 = new Intent(getApplicationContext(), SetPhotoFrame.class);
//                startActivity(intentframe2);
//                Toast.makeText(Frames.this,"frame 2 BUTTON TAPPED",Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        frame3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intentframe3 = new Intent(getApplicationContext(), SetPhotoFrame.class);
//                startActivity(intentframe3);
//                Toast.makeText(Frames.this,"frame 3 BUTTON TAPPED",Toast.LENGTH_SHORT).show();
//            }
//        });
//        frame4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intentframe4 = new Intent(getApplicationContext(), SetPhotoFrame.class);
//                startActivity(intentframe4);
//                Toast.makeText(Frames.this,"frame 4 BUTTON TAPPED",Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//}