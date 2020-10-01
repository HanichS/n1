package com.sabrinahanich.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        String aprovado = ((Aluno.nota1) + (Aluno.nota2) / 2) >= 7 ? "aprovado" : "reprovado";
        String resultado = "O(A) aluno(a) " + Aluno.nome + " está " + aprovado;
        texto = (TextView)findViewById(R.id.resultado);
        texto.setText(resultado);
    }
}