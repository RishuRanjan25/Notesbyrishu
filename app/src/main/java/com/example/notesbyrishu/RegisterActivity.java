package com.example.notesbyrishu;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText usernameEditText = findViewById(R.id.editTextText2);
        EditText passwordEditText = findViewById(R.id.editTextTextPassword2);
        EditText emailEditText = findViewById(R.id.editTextTextEmailAddress);

        Button okButton = findViewById(R.id.button4);
        okButton.setOnClickListener(view -> {
            String username = usernameEditText.getText().toString();
            String password = passwordEditText.getText().toString();
            String email = emailEditText.getText().toString();

            // Perform validation here
            if (isValidInput(username, password, email)) {
                Toast.makeText(RegisterActivity.this, "Registration successful", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(RegisterActivity.this, HomePage.class);
                startActivity(intent);
            } else {
                Toast.makeText(RegisterActivity.this, "Invalid user", Toast.LENGTH_SHORT).show();
            }
        });

        Button goBackButton = findViewById(R.id.button5);
        goBackButton.setOnClickListener(view -> {
            Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
            startActivity(intent);
        });
    }

    private boolean isValidInput(String username, String password, String email) {
        // Add your validation logic here
        // For example:
        if (username.isEmpty() || password.isEmpty() || email.isEmpty()) {
            return false; // One or more fields are empty
        }
        if (!email.contains("@") || !email.contains(".")) {
            return false; // Invalid email format
        }
        if (password.length() < 8) {
            return false; // Password is too short
        }
        // Add more validation rules as needed
        return true; // Input is valid
    }
}