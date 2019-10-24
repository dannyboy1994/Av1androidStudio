package com.example.avaliacao1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class cadastroItens extends AppCompatActivity {

    private EditText item;
    private EditText setor;
    private EditText codigo;
    private ItemDAO dao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_itens);

        item = findViewById(R.id.editItem);
        setor = findViewById(R.id.editSetor);
        codigo = findViewById(R.id.editCodigo);
        dao = new ItemDAO(this);
    }

    public void cadastrar(View view) {
        Item novoItem = new Item();
        novoItem.setItem(item.getText().toString());
        novoItem.setSetor(setor.getText().toString());
        novoItem.setCodigo(codigo.getText().toString());
        long id = dao.inserirItem(novoItem);
        Toast.makeText(this, "Item inserido : " + id, Toast.LENGTH_SHORT).show();
    }

    public void limparDados() {
    }
}
