package com.example.avaliacao1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class cadastroItens extends AppCompatActivity {

    private EditText item;
    private EditText setor;
    private EditText codigo;
    private ItemDAO dao;
    private ZXingScannerView scanear;

    Button voltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_itens);

        voltar = (Button) findViewById(R.id.voltar2);
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voltarInicio1();
            }
        });

        item = findViewById(R.id.editItem);
        setor = findViewById(R.id.editSetor);
        codigo = findViewById(R.id.editCodigo);
        dao = new ItemDAO(this);
    }

    public void escaner(View view) {
        scanear = new ZXingScannerView(this);
        scanear.setResultHandler(new escaner());
        setContentView(scanear);
        scanear.startCamera();
    }

    public void cadastrar(View view) {
        Item novoItem = new Item();
        novoItem.setItem(item.getText().toString());
        novoItem.setSetor(setor.getText().toString());
        novoItem.setCodigo(codigo.getText().toString());
        long id = dao.inserirItem(novoItem);
        Toast.makeText(this, "Item inserido : " + id, Toast.LENGTH_SHORT).show();

        item.setText("");
        setor.setText("");
        codigo.setText("");
    }

    public void voltarInicio1() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void limparDados(View view) {
        item.setText("");
        setor.setText("");
        codigo.setText("");
    }

    class escaner implements ZXingScannerView.ResultHandler {
        @Override
        public void handleResult(Result result) {
            String leitura = result.getText();
            setContentView(R.layout.activity_cadastro_itens);
            scanear.stopCamera();
            codigo = (EditText) findViewById(R.id.editCodigo);
            codigo.setText(leitura);
        }
    }
}