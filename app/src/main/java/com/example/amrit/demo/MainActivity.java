package com.example.amrit.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.amrit.demo.loadImage.LoadImageActivity;
import com.example.amrit.demo.notificationBadge.NotificationBadgeActivity;
import com.example.amrit.demo.takeImage.CameraActivity;
import com.example.amrit.demo.youtube.YoutubeActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void notificationBadge(View view) {
        Intent intent = new Intent(MainActivity.this, NotificationBadgeActivity.class);
        startActivity(intent);
    }

    public void loadImage(View view) {
        Intent intent = new Intent(MainActivity.this, LoadImageActivity.class);
        startActivity(intent);
    }

    public void youtube(View view) {
        Intent intent = new Intent(MainActivity.this, YoutubeActivity.class);
        startActivity(intent);
    }

    public void captureImage(View view) {
        Intent intent = new Intent(MainActivity.this, CameraActivity.class);
        startActivity(intent);
    }
}
