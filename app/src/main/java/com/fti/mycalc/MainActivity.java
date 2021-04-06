package com.fti.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Deklarasi
    Button btnvolbalok, btnluasbalok, btnvoltabung, btnluastabung, btnvolkerucut, btnluaskerucut;
    EditText etpanjang, etlebar, ettinggi;
    TextView tvHasil;
    double panjang, lebar, tinggi; double hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find view id pada komponen2 yang ada di layout activity_main.xml
        etpanjang = findViewById(R.id.et_panjang);
        etlebar = findViewById(R.id.et_lebar);
        ettinggi = findViewById(R.id.et_tinggi);
        tvHasil = findViewById(R.id.hasil);
        btnvolbalok = findViewById(R.id.btn_volbalok);
        btnluasbalok = findViewById(R.id.btn_luasbalok);
        btnvoltabung = findViewById(R.id.btn_voltabung);
        btnluastabung= findViewById(R.id.btn_luastabung);
        btnvolkerucut= findViewById(R.id.btn_volkerucut);
        btnluaskerucut= findViewById(R.id.btn_luaskerucut);

        //OnClick Listener tombol volume balok
        btnvolbalok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                panjang = Double.parseDouble(etpanjang.getText().toString());
                lebar = Double.parseDouble(etlebar.getText().toString());
                tinggi = Double.parseDouble(ettinggi.getText().toString());
                hasil =  panjang*lebar*tinggi;
                tvHasil.setText(Double.toString(hasil));
            }
        });

        //OnClick Listener tombol luas permukaan balok
        btnluasbalok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                panjang = Double.parseDouble(etpanjang.getText().toString());
                lebar = Double.parseDouble(etlebar.getText().toString());
                tinggi = Double.parseDouble(ettinggi.getText().toString());
                hasil = (Integer) 2*(panjang*lebar+panjang*tinggi+lebar*tinggi);
                tvHasil.setText(Double.toString(hasil));
            }
        });


        //OnClick Listener tombol luas permukaan balok
        btnvoltabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                panjang = Double.parseDouble(etpanjang.getText().toString());
                tinggi = Double.parseDouble(ettinggi.getText().toString());
                hasil = (Double) Math.PI*panjang*panjang*tinggi;
                tvHasil.setText(Double.toString(hasil));
            }
        });

        //OnClick Listener tombol luas permukaan balok
        btnluastabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                panjang = Double.parseDouble(etpanjang.getText().toString());
                tinggi = Double.parseDouble(ettinggi.getText().toString());
                hasil = (Integer) 2*Math.PI*panjang*( panjang + tinggi );
                tvHasil.setText(Double.toString(hasil));
            }
        });

        //OnClick Listener tombol luas permukaan balok
        btnvolkerucut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                panjang = Double.parseDouble(etpanjang.getText().toString());
                tinggi = Double.parseDouble(ettinggi.getText().toString());
                hasil = (Double) Math.PI*panjang*panjang*tinggi*1/3;
                tvHasil.setText(Double.toString(hasil));
            }
        });

        //OnClick Listener tombol luas permukaan balok
        btnluaskerucut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                panjang = Double.parseDouble(etpanjang.getText().toString());
                tinggi = Double.parseDouble(ettinggi.getText().toString());
                hasil = (Double) Math.PI*panjang*(panjang+tinggi);
                tvHasil.setText(Double.toString(hasil));
            }
        });
    }
}