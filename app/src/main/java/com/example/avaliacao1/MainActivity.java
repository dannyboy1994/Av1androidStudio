package com.example.avaliacao1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button cadastro;
    Button acessoSetor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        acessoSetor = (Button) findViewById(R.id.acessarSetor);
        acessoSetor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                acessarSetor();
            }
        });
        cadastro = (Button) findViewById(R.id.cadastrarItens);
        cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cadastrarItens();
            }
        });
    }

    public void cadastrarItens() {
        Intent intent = new Intent(this, cadastroItens.class);
        startActivity(intent);
    }

    public void acessarSetor() {
        Intent intent = new Intent(this, lerCodigos.class);
        startActivity(intent);
    }
}
