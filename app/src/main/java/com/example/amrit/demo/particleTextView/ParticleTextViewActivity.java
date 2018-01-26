package com.example.amrit.demo.particleTextView;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.amrit.demo.R;
import com.yasic.library.particletextview.MovingStrategy.RandomMovingStrategy;
import com.yasic.library.particletextview.Object.ParticleTextViewConfig;
import com.yasic.library.particletextview.View.ParticleTextView;

public class ParticleTextViewActivity extends AppCompatActivity {
    ParticleTextView particleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_particle_text_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        particleTextView = (ParticleTextView) findViewById(R.id.particleTextView);
        RandomMovingStrategy randomMovingStrategy = new RandomMovingStrategy();
        ParticleTextViewConfig config = new ParticleTextViewConfig.Builder()
                .setRowStep(8)
                .setColumnStep(8)
                .setTargetText("Random")
                .setReleasing(0.2)
                .setParticleRadius(4)
                .setMiniDistance(0.1)
                .setTextSize(150)
                .setMovingStrategy(randomMovingStrategy)
                .instance();
        particleTextView.setConfig(config);

        particleTextView.startAnimation();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                particleTextView.stopAnimation();
            }
        });
    }

}
