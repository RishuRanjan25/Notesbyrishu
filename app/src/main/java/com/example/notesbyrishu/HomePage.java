package com.example.notesbyrishu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        findViewById(R.id.card_java).setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, java.class);
            startActivity(intent);
        });

        findViewById(R.id.card_dsa).setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, DSA.class);
            startActivity(intent);
        });

        findViewById(R.id.card_cpp).setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, C.class);
            startActivity(intent);
        });

        findViewById(R.id.card_dbms).setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, DBMS.class);
            startActivity(intent);
        });

        findViewById(R.id.card_php).setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, php.class);
            startActivity(intent);
        });

        findViewById(R.id.button).setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, LastScreen.class);
            startActivity(intent);
            Toast.makeText(HomePage.this, "Logged out successfully!", Toast.LENGTH_SHORT).show();
        });
    }
}