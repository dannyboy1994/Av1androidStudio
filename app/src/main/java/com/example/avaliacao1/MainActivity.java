package com.example.avaliacao1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button cadastro;
    Button acessoSetor;

    //private SQLiteDatabase codigos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Criação da tabela para armazenar os dados dos itens
        //Banco criado na classe conexão
        //codigos = this.openOrCreateDatabase("codigos", Context.MODE_PRIVATE, null);
        //codigos.execSQL("CREATE TABLE if not exists objetos (id_item integer primary key autoincrement, item varchar(50), code INTEGER, setor varchar(30))");
        //--------------------------------------------------------------------------------------
        //
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
/*  Função anterior para carregar tabela (provavelmente será descontinuada)
    public void carregarTabela() {
        Cursor c = codigos.rawQuery("SELECT id_item, item, code, setor FROM objetos;", new String[]{});

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.resultado);
        linearLayout.removeAllViews();
        while (c.moveToNext()) {
            TextView textView = new TextView(this);
            textView.setText(c.getString(1) + ", " + c.getString(2) + "," + c.getString(3));
            linearLayout.addView(textView);
        }*/
}