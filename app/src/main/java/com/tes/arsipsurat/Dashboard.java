package com.tes.arsipsurat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

//        TextView text = findViewById()
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        CardView cardview = findViewById(R.id.disposisi);
        CardView skeluar = findViewById(R.id.skeluar);
        CardView smasuk = findViewById(R.id.smasuk);

        skeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, SuratMasuk.class);
                startActivity(intent);
            }
        });

        cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this,SuratKeluar.class);
                startActivity(intent);
            }
        });
        smasuk.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void  onClick(View v){
                Intent intent = new Intent(Dashboard.this,SuratMasuk.class);

            }
        });

    }
}