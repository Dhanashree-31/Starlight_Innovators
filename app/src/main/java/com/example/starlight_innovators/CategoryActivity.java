package com.example.starlight_innovators;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class CategoryActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CategoryAdapter categoryAdapter;
    private String[] categories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        Intent intent = getIntent();
        String category = intent.getStringExtra("CATEGORY");
        if (category != null) {
            switch (category) {
                case "T-Shirts":
                    categories = new String[]{"T-Shirts", "Shirts", "Sneaker", "Headphone"};
                    break;
                case "Shirts":
                    categories = new String[]{"Shirts", "Pants", "Jackets", "Shoes"};
                    break;
                case "Sneaker":
                    categories = new String[]{"Sneakers", "Sandals", "Boots", "Slippers"};
                    break;
                case "Headphone":
                    categories = new String[]{"Headphones", "Earbuds", "Speakers", "Accessories"};
                    break;
                default:
                    categories = new String[]{};
            }
        }

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        categoryAdapter = new CategoryAdapter(categories);
        recyclerView.setAdapter(categoryAdapter);

        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(view -> finish());
    }
}
