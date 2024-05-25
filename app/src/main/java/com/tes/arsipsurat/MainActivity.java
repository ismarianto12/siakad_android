package com.tes.arsipsurat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        TextView profilTextView = findViewById(R.id.profil);
        Button loginButton = findViewById(R.id.login);

        TextView username = findViewById(R.id.username);
        TextView password = findViewById(R.id.password);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("123")) {
                    Intent intent = new Intent(MainActivity.this, Dashboard.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Username atau password salah"+username.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });


        profilTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }



}