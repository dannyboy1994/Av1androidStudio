package com.example.avaliacao1;

import java.io.Serializable;

public class Item implements Serializable {
    public String item;
    public String setor;
    public String codigo;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String toString() {
        return item;
    }
}
