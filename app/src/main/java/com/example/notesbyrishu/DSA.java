package com.example.notesbyrishu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class DSA extends AppCompatActivity {
    TabLayout tab;
    ViewPager viewPager;
    Button backToLibraryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_java);

        tab = findViewById(R.id.tab);
        viewPager = findViewById(R.id.viewPager);
        backToLibraryButton = findViewById(R.id.backToLibraryButton);

        ViewPagerDSAAdapter adapter = new ViewPagerDSAAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        tab.setupWithViewPager(viewPager);

        backToLibraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DSA.this, "Opening Library", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(DSA.this, HomePage.class);
                startActivity(intent);
            }
        });

    }
}