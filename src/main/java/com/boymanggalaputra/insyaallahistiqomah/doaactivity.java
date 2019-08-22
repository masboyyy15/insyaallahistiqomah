package com.boymanggalaputra.insyaallahistiqomah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class doaactivity extends AppCompatActivity {

    private Button btndoamasukrumah, btndoaagaristiqomah, btndoamohonkeadilan, btnmohonkelapanganhati, btndoasedihdukacita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doaactivity);
        btndoamasukrumah=(Button) findViewById(R.id.btn_doa_masukrumah);
        btndoaagaristiqomah=(Button) findViewById(R.id.btn_doa_agaristiqomah);
        btndoamohonkeadilan=(Button) findViewById(R.id.btn_doa_mohonkeadilan);
        btnmohonkelapanganhati=(Button) findViewById(R.id.btn_doa_kelapanganhati);
        btndoasedihdukacita=(Button) findViewById(R.id.btn_doa_sukadukacita);

        btndoamasukrumah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(doaactivity.this, doamasukrumah.class);
                startActivity(intent);
            }
        });
        btndoaagaristiqomah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(doaactivity.this, doaagaristiqomah.class);
                startActivity(intent);
            }
        });
        btndoamohonkeadilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(doaactivity.this, doamohonkeadilan.class);
                startActivity(intent);
            }
        });
        btnmohonkelapanganhati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(doaactivity.this, doamohonkelapanganhati.class);
                startActivity(intent);
            }
        });
        btndoasedihdukacita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(doaactivity.this, doasedihdukacita.class);
                startActivity(intent);
            }
        });
    }
}
