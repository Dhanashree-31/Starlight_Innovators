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
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setTitle("Trending Clothes");
        }

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        BannerAdapter adapter = new BannerAdapter(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(int position, String name, int image, String price, String discount, String description) {
        Intent intent = new Intent(this, TShirtDetailActivity.class);
        intent.putExtra("tshirtName", name);
        intent.putExtra("tshirtImage", image);
        intent.putExtra("tshirtPrice", price);
        intent.putExtra("tshirtDiscount", discount);
        intent.putExtra("tshirtDescription", description);
        startActivity(intent);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
