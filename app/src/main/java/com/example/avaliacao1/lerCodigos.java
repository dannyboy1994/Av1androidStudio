package com.example.avaliacao1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lerCodigos extends AppCompatActivity {

    Button listar;
    Button lerCodigo;
    Button voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ler_codigos);

        voltar = (Button) findViewById(R.id.voltar);
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voltarInicio();
            }
        });
    }

    public void voltarInicio() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}
