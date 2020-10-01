package com.sabrinahanich.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nome = findViewById(R.id.formulario_nome);
        Button proximo = findViewById(R.id.button);
        proximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Aluno.nome = nome.getText().toString();
                Intent intentNotas = new Intent (MainActivity.this, NotasActivity.class);
                startActivityForResult(intentNotas, 0);

            }
        });
    }
}