package com.example.starlight_innovators;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class CameraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create an Intent to open the URL
        String url = "https://www.snapchat.com/unlock/?type=SNAPCODE&uuid=e6663fbb13944586ada982f98021fba3&metadata=01";
        String url_old = "https://www.snapchat.com/unlock/?type=SNAPCODE&uuid=e6663fbb13944586ada982f98021fba3&metadata=01";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

        // Start the Intent
        startActivity(intent);

        // Optionally, close this activity so the user cannot navigate back to it
        finish();
    }
}
