package com.example.starlight_innovators;


import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class NextPageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nextpage_layout);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Enable the Up button
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        initView();
    }

    private void initView() {
        findViewById(R.id.fabTryLens).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo launch camera screen


            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed(); // Handle the Up button action
        return true;
    }
}

