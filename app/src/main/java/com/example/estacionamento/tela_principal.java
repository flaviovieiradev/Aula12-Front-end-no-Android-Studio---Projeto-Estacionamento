package com.example.estacionamento;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class tela_principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela_principal);
        //ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
        //            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        //            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
        //            return insets;

        // Encontra o botão sair no layout
        Button btn_sair = findViewById(R.id.btn_sair);

        // Adiciona um listener de clique no botão sair
        btn_sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Exibe um alerta de confirmação antes de fechar o aplicativo
                AlertDialog.Builder builder = new AlertDialog.Builder(tela_principal.this);
                builder.setTitle("Fechar Aplicativo");
                builder.setMessage("Você tem certeza que deseja fechar o aplicativo?");
                builder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Fecha a activity atual
                        finish();
                    }
                });
                builder.setNegativeButton("Não", null);
                builder.show();
            }
        });


        // Encontra o botão no layout
        Button btn_proprietario = findViewById(R.id.btn_proprietario);

        // Adiciona um listener de clique no botão
        btn_proprietario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cria um novo Intent para abrir a SecondActivity
                Intent intent = new Intent(tela_principal.this, Lista_Proprietario.class);

                // Inicia a nova Activity
                startActivity(intent);
            }
        });

    }
}


