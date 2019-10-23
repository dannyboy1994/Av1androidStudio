package com.example.avaliacao1;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class ItemDAO {
    private Conexao conexao;
    private SQLiteDatabase banco;

    public ItemDAO(Context context) {
        conexao = new Conexao(context);
        banco = conexao.getWritableDatabase();
    }

    public long inserirItem(Item item) {
        ContentValues values = new ContentValues();
        values.put("item", item.getItem());
        values.put("setor", item.getSetor());
        values.put("codigo", item.getCodigo());
        return banco.insert("item", null, values);
    }
}
