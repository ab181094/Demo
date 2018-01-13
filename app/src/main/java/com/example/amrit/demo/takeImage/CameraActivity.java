package com.example.amrit.demo.takeImage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.example.amrit.demo.R;

import uk.co.senab.photoview.PhotoViewAttacher;

public class CameraActivity extends AppCompatActivity {
    // add imageView in xml
    // add code here

    ImageView cameraImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        cameraImage = findViewById(R.id.camera_image);
    }

    public void openCamera(View view) {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap bitmap = (Bitmap) data.getExtras().get("data");
        cameraImage.setImageBitmap(bitmap);

        PhotoViewAttacher attacher = new PhotoViewAttacher(cameraImage);
        attacher.update();
    }
}
