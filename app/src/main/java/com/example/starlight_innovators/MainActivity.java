package com.example.starlight_innovators;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.google.ar.core.ArCoreApk;
import com.google.ar.core.Session;

public class MainActivity extends AppCompatActivity {

    private Session arCoreSession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage_layout);

        initArCore();

        ImageView bannerImageView = findViewById(R.id.banner);
        bannerImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BannerPageActivity.class);
                startActivity(intent);
            }
        });

        LinearLayout item1Layout = findViewById(R.id.item1_layout);
        item1Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NextPageActivity.class);
                startActivity(intent);
            }
        });

    }

    private void initArCore() {

        // Check if ARCore is installed and available
        ArCoreApk.Availability availability = ArCoreApk.getInstance().checkAvailability(this);
        if (availability.isSupported()) {
            // Create a new ARCore session
            try {
                arCoreSession = new Session(this);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (availability.isTransient()) {
            // Request ARCore installation
            try {
                ArCoreApk.getInstance().requestInstall(this, true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            // Device does not support ARCore
        }

    }
}
