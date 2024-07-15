package com.example.starlight_innovators;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class TShirtDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tshirt_detail_layout);


        FloatingActionButton fabTryLens = findViewById(R.id.fabTryLens);

        fabTryLens.setOnClickListener(v -> {
            // Create an Intent to start CameraActivity
            Intent intent = new Intent(TShirtDetailActivity.this, CameraActivity.class);
            startActivity(intent);
        });


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("TShirt Details");

        ImageView productImage = findViewById(R.id.product_image);
        TextView productName = findViewById(R.id.product_name);
        TextView productPrice = findViewById(R.id.product_price);
        TextView productDiscount = findViewById(R.id.tshirt_discount);
        TextView productDescription = findViewById(R.id.product_description);

        Intent intent = getIntent();
        String name = intent.getStringExtra("tshirtName");
        int image = intent.getIntExtra("tshirtImage", 0);
        String price = intent.getStringExtra("tshirtPrice");
        String discount = intent.getStringExtra("tshirtDiscount");
        String description = intent.getStringExtra("tshirtDescription");

        productName.setText(name);
        productImage.setImageResource(image);
        productPrice.setText(price);
        productDiscount.setText(discount);
        productDescription.setText(description);

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    };
};
