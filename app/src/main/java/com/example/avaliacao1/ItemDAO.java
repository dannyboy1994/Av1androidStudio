package com.example.avaliacao1;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

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

    public List<Item> obterItens() {
        List<Item> itens = new ArrayList<>();
        Cursor cursor = banco.query("item", new String[]{"item", "setor", "codigo"},
        null, null, null, null, null);

        while (cursor.moveToNext()) {
            Item next = new Item();
            next.setItem(cursor.getString(0));
            next.setSetor(cursor.getString(1));
            next.setCodigo(cursor.getString(2));
            itens.add(next);
        }
        return itens;
    }
}
