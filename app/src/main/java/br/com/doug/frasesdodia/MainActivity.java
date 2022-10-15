package br.com.doug.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void gerarNovaFrase(View view){
        String[] frases={
                "frase1",
                "frase2",
                "frase3",
                "frase4",
                "frase5",
                "frase6",
                "frase7"
        };
        int numero = new Random().nextInt(7);
        TextView texto = findViewById(R.id.tv_frase);
        texto.setText(frases[numero]);

    }
}