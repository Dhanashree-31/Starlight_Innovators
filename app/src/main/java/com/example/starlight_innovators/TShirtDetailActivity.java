package com.example.starlight_innovators;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class TShirtDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tshirt_detail_layout);

        ImageView productImage = findViewById(R.id.product_image);
        TextView productName = findViewById(R.id.product_name);
        TextView productPrice = findViewById(R.id.product_price);
        TextView productDiscount = findViewById(R.id.tshirt_discount);
        TextView productDescription = findViewById(R.id.product_description);

        // Get data from intent
        String name = getIntent().getStringExtra("tshirtName");
        String price = getIntent().getStringExtra("tshirtPrice");
        String discount = getIntent().getStringExtra("tshirtDiscount");
        int imageResource = getIntent().getIntExtra("tshirtImageResource", 0);

        productImage.setImageResource(imageResource);
        productName.setText(name);
        productPrice.setText(price);
        productDiscount.setText(discount);
        productDescription.setText("Product description goes here."); // Add your description
    }
}
