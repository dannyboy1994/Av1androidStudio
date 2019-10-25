package com.example.avaliacao1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class lerCodigos extends AppCompatActivity {

    Button listar;
    Button lerCodigo;
    Button voltar;

    private ListView listView;
    private ItemDAO dao;
    private List<Item> itens;
    private List<Item> itensFiltrados = new ArrayList<>();
    private ZXingScannerView scanear;

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

        listView = findViewById(R.id.listarItens);
        dao = new ItemDAO(this);
        itens = dao.obterItens();
        itensFiltrados.addAll(itens);
        ArrayAdapter<Item> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, itens);
        listView.setAdapter(adaptador);
    }

    public void voltarInicio() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }




}
