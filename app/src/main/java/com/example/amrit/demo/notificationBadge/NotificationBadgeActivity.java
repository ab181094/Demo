package com.example.amrit.demo.notificationBadge;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.amrit.demo.R;
import com.nex3z.notificationbadge.NotificationBadge;

public class NotificationBadgeActivity extends AppCompatActivity {
    NotificationBadge badge;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_badge);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        badge = findViewById(R.id.notificationBadge);
    }

    public void increaseCounter(View view) {
        badge.setNumber(++count);
    }

    public void clearCounter(View view) {
        badge.setNumber(0);
    }
}
