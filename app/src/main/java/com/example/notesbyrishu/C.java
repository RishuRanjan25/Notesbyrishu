package com.example.notesbyrishu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class C extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_c);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ListView chapter1ListView = findViewById(R.id.chapter1);
        ListView chapter2ListView = findViewById(R.id.chapter2);
        ListView chapter3ListView = findViewById(R.id.chapter3);
        ListView chapter4ListView = findViewById(R.id.chapter4);

        String[] chapter1Items = {"Chapter 1\n DATA TYPES"};
        String[] chapter2Items = {"Chapter 2\n LOOPS",};
        String[] chapter3Items = {"Chapter 3\n FUNCTIONS"};
        String[] chapter4Items = {"Chapter 4\n ARRAYS"};

        ChapterAdapter chapter1Adapter = new ChapterAdapter(this, chapter1Items);
        ChapterAdapter chapter2Adapter = new ChapterAdapter(this, chapter2Items);
        ChapterAdapter chapter3Adapter = new ChapterAdapter(this, chapter3Items);
        ChapterAdapter chapter4Adapter = new ChapterAdapter(this, chapter4Items);

        chapter1ListView.setAdapter(chapter1Adapter);
        chapter2ListView.setAdapter(chapter2Adapter);
        chapter3ListView.setAdapter(chapter3Adapter);
        chapter4ListView.setAdapter(chapter4Adapter);

        chapter1ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(C.this, DataTypes.class);
                startActivity(intent);
            }
        });

        chapter2ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(C.this, Loops.class);
                startActivity(intent);
            }
        });

        chapter3ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(C.this, Functions.class);
                startActivity(intent);
            }
        });

        chapter4ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(C.this, Arrays.class);
                startActivity(intent);
            }
        });

        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C.this, HomePage.class);
                startActivity(intent);
            }
        });
    }
}