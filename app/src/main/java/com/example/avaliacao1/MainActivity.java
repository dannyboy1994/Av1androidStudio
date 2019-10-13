package com.example.avaliacao1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void acessarSetor (View v) {

    }

    public void cadastrarItem (View v) {
        AlertDialog Alertdialog;
        Alertdialog = new AlertDialog.Builder(this).create();
        Alertdialog.setTitle("Teste");
        Alertdialog.setMessage("Funfou");
        Alertdialog.show();
    }
}
