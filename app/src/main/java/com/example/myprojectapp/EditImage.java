package com.example.myprojectapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import ja.burhanrashid52.photoeditor.PhotoEditor;
import ja.burhanrashid52.photoeditor.PhotoEditorView;

public class EditImage extends AppCompatActivity {

    PhotoEditorView photoEditorView;
    PhotoEditor photoEditor;
    LinearLayout linearLayout;
    Button addFrame,saveImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_image);
        photoEditorView = findViewById(R.id.potoeditorView);
        photoEditorView.getSource().setImageURI(getIntent().getData());
        photoEditor = new PhotoEditor.Builder(this,photoEditorView)
                .setPinchTextScalable(true)
                .build();
        addFrame=findViewById(R.id.Addframes);
        saveImage=findViewById(R.id.SaveImage);

        addFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FrameFragment  fragment =  FrameFragment.getInstance();
                fragment.setListener((AddFrameListener) EditImage.this);
                fragment.show(getSupportFragmentManager(),fragment.getTag());
//                FrameFragment frameFragment = FrameFragment.getInstance();
//                frameFragment.setListener(EditImage.this);
//                frameFragment.show(getSupportFragmentManager(),frameFragment.getTag());
            }
        });

        saveImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveImage();
            }
        });

    }

    private void saveImage() {

    }

    public void onAddFram(int frame){
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),frame);
        photoEditor.addImage(bitmap);
    }
}