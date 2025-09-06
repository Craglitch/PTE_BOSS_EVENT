package com.lumepath.app;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);

        // Full screen mode
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        );
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        // Interactive task cards
        LinearLayout task1 = findViewById(R.id.task1);
        LinearLayout task2 = findViewById(R.id.task2);

        task1.setOnClickListener(v ->
                Toast.makeText(this, "Morning Routine clicked", Toast.LENGTH_SHORT).show()
        );

        task2.setOnClickListener(v ->
                Toast.makeText(this, "Work Focus clicked", Toast.LENGTH_SHORT).show()
        );

        // Interactive bottom nav
        findViewById(R.id.navHome).setOnClickListener(v ->
                Toast.makeText(this, "Home clicked", Toast.LENGTH_SHORT).show()
        );
        findViewById(R.id.navSearch).setOnClickListener(v ->
                Toast.makeText(this, "Search clicked", Toast.LENGTH_SHORT).show()
        );
        findViewById(R.id.navAdd).setOnClickListener(v ->
                Toast.makeText(this, "Add clicked", Toast.LENGTH_SHORT).show()
        );
        findViewById(R.id.navSettings).setOnClickListener(v ->
                Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show()
        );

        // Optional: Animate day tracker progress
        ProgressBar dayProgress = findViewById(R.id.dayProgress);
        dayProgress.setProgress(60); // Just for demo, change progress visually
    }
}