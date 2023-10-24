package com.example.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public int jogadaPC(){
        int n = new Random().nextInt(3)+1;
        ImageView imagePadrao = findViewById(R.id.imagePadrao);
        switch (n){
            case 1:
                imagePadrao.setImageResource(R.drawable.pedra);
                break;
            case 2:
                imagePadrao.setImageResource(R.drawable.papel);
                break;
            case 3:
                imagePadrao.setImageResource(R.drawable.tesoura);
                break;
        }
        return n;
    }
    public void verificar(int jogadaUser, int jogadaPC){
        TextView resultado = findViewById(R.id.textResultado);
        resultado.setText("Você ganhou!");
    }
    public void jogar(View view){
        String jogada = getResources().getResourceEntryName(view.getId());
        int jogadaUser = 0;
        int jogadaPC = jogadaPC();
        verificar(jogadaUser,jogadaPC);
        switch (jogada){
            case "imagePedra":
                jogadaUser = 1;
                Toast.makeText(this, "Você jogou pedra", Toast.LENGTH_SHORT).show();
                break;
        }
        switch (jogada){
            case "imagePapel":
                jogadaUser = 2;
                Toast.makeText(this, "Você jogou papel", Toast.LENGTH_SHORT).show();
                break;
        }
        switch (jogada){
            case "imageTesoura":
                jogadaUser = 3;
                Toast.makeText(this, "Você jogou tesoura", Toast.LENGTH_SHORT).show();
                break;
        }
        Toast.makeText(this, "Você jogou "+jogada, Toast.LENGTH_SHORT).show();
    }

}