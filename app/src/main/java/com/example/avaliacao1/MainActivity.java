package com.example.avaliacao1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.icu.util.ULocale;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    Button cadastro;
    Button acessoSetor;
  /*  Spinner spinnerSetor = findViewById(R.id.spinner);

    public List<Locale.Category> listaSetor;

    private BaseAdapter listaAdapter = new BaseAdapter() {
        @Override
        public int getCount() {
            return listaSetor.size();
        }

        @Override
        public Object getItem(int i) {
            return listaSetor.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View convertView, ViewGroup parent) {
            CategoryHolder holder;
            View categoryView = convertView;

            if (categoryView == null) {
                categoryView = getLayoutInflater().inflate(R.layout.spinner_layout, parent,false);

                holder = new CategoryHolder();
                holder.nomeSetor = categoryView.findViewById(R.id.setorNome);
                categoryView.setTag(holder);
            } else {
                holder = (CategoryHolder) categoryView.getTag()
            }

            Locale.Category category = listaSetor.get(i);
            holder.nomeSetor.setText(category.getCategoryName());
           return null;
        }

        class CategoryHolder {
            private TextView setorID;
            private TextView nomeSetor;
        }

    };*/

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

        /*populateListaSetor();*/

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
/*
    private void populateListaSetor() {
        spinnerSetor = findViewById(R.id.spinner);
        spinnerSetor.setAdapter(listaAdapter);
        spinnerSetor.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                /*Toast.makeText(MainActivity.this,
                                listaSetor.get(i).getCategoryName()),
                                Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }*/

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