package com.example.shuryasnack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SigninActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        // Inisialisasi elemen-elemen dengan ID
        LinearLayout signupButton = findViewById(R.id.signinButton);
        TextView toSignupTextView = findViewById(R.id.toSignup);
        ImageView backtoLandingPage = findViewById(R.id.backtoLandingPage);

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Memindahkan pengguna ke halaman Login
                Intent intent = new Intent(SigninActivity.this, NavActivity.class);
                startActivity(intent);
            }
        });

        toSignupTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman Login
                Intent intent = new Intent(SigninActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });
        backtoLandingPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman Login
                Intent intent = new Intent(SigninActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
