package com.example.starlight_innovators;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class BannerPageActivity extends AppCompatActivity implements BannerAdapter.OnItemClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bannernext_page);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Trending Clothes");

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(new BannerAdapter(this));
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(this, TShirtDetailActivity.class);
        intent.putExtra("tshirtName", getResources().getStringArray(R.array.tshirt_names)[position]);
        intent.putExtra("tshirtPrice", getResources().getStringArray(R.array.tshirt_prices)[position]);
        intent.putExtra("tshirtDiscount", getResources().getStringArray(R.array.tshirt_discounts)[position]);
        intent.putExtra("tshirtImageResource", getResources().getIntArray(R.array.tshirt_images)[position]);
        startActivity(intent);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
