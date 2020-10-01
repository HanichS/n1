package com.sabrinahanich.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NotasActivity extends AppCompatActivity {
    private EditText nota1;
    private EditText nota2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas);
        nota1 = findViewById(R.id.nota1);
        nota2 = findViewById(R.id.nota2);
        Button proximo = findViewById(R.id.button2);
        proximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Aluno.nota1 = Double.parseDouble(nota1.getText().toString());
                Aluno.nota2 = Double.parseDouble(nota2.getText().toString());
                Intent intentResultado = new Intent (NotasActivity.this, ResultadoActivity.class);
                startActivityForResult(intentResultado, 0);

            }
        });
    }
}