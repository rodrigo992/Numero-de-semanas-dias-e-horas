package com.example.numerodasemana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et_numero;
    Button bt_converter;
    TextView tv_semanas, tv_dias, tv_horas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_numero = findViewById(R.id.et_nhoras);
        bt_converter = findViewById(R.id.bt_calcular);
        tv_dias =findViewById(R.id.tv_dias);
        tv_horas = findViewById(R.id.tv_horas);
        tv_semanas = findViewById(R.id.tv_semanas);

        bt_converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int hTotal = Integer.parseInt(et_numero.getText().toString());

                int nSemanas = hTotal / 24 / 7;
                tv_semanas.setText(nSemanas + " semanas");


                int nDias = (hTotal % (24 * 7)) / 7;
                int nHoras = (hTotal % (24 * 7)) % 24;

                tv_dias.setText(nDias + " dias");
                tv_horas.setText(nHoras + " horas");




            }
        });
    }
}