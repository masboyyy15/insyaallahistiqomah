package com.boymanggalaputra.insyaallahistiqomah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private CardView c_jadwalsholat,c_produkhalal, c_doa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c_jadwalsholat = (CardView)findViewById(R.id.main_jadwal_sholat);
        c_produkhalal =(CardView) findViewById(R.id.main_produk_halal);
        c_doa=(CardView) findViewById(R.id.main_doa);
        c_jadwalsholat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i_jadwalsholat = new Intent(MainActivity.this ,sholatactivity.class);
                startActivity(i_jadwalsholat);
            }
        });
        c_produkhalal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i_produkhalal = new Intent(MainActivity.this, halalapp.class);
                startActivity(i_produkhalal);
            }
        });
        c_doa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i_doa = new Intent(MainActivity.this , doaactivity.class);
                startActivity(i_doa);
            }
        });

    }
}
