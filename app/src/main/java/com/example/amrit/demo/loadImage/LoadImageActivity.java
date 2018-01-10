package com.example.amrit.demo.loadImage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.example.amrit.demo.R;
import com.squareup.picasso.Picasso;

public class LoadImageActivity extends AppCompatActivity {
    // add the library
    // add imageView in xml
    // add code here

    String image_url = "http://www.hdwallpapersfreedownload.com/uploads/large/super-heroes/" +
            "hd-free-download-hero-of-superman.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_image);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView imageView = findViewById(R.id.loadImage_imageView);
        Picasso.with(this).load(image_url).placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(imageView, new com.squareup.picasso.Callback() {
                    @Override
                    public void onSuccess() {

                    }

                    @Override
                    public void onError() {

                    }
                });
    }
}
