package com.example.myprojectapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.pm.PackageInfoCompat;

public class MainActivity2 extends AppCompatActivity {
    Button editButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editButton=findViewById(R.id.editbtn);
        editButton.setOnClickListener(view -> {
//            Intent intent = new Intent();
//            intent.setAction(Intent.ACTION_GET_CONTENT);
//            intent.setType("image/*");
            Intent pickImageIntent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);

            startActivityForResult(pickImageIntent, 100);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100 && resultCode == RESULT_OK && data != null) {

            Uri imageUri = data.getData();
            Intent editImageIntent = new Intent(this, EditImage.class);
            editImageIntent.putExtra("imageUri", imageUri.toString());
            startActivity(editImageIntent);
        }
    }
}