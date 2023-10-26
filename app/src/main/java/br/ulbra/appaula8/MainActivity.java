package br.ulbra.appaula8;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btEntrar, btRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btEntrar = (Button) findViewById(R.id.btnEntrar);
        btRegistrar = (Button) findViewById(R.id.btnRegistrar);
        btEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               CarregarTelaLogin();

            }
        });
        btRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTelaRegistrar();
            }
        });
    }

        /*public void CarregarTelaPrincipal() {
            setContentView(R.layout.activity_main);
            btEntrar = (Button) findViewById(R.id.btnEntrar);
            btRegistrar = (Button) findViewById(R.id.btnRegistrar);
            btEntrar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CarregarTelaLogin();
                }
            });
        }*/
        public void CarregarTelaRegistrar () {
            setContentView(R.layout.activity_registrar);
            btRegistrar = (Button) findViewById(R.id.btnSalvar);

            btRegistrar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //CarregarTela1();
                }
            });}
    public void CarregarTelaLogin() {
            setContentView(R.layout.activity_login);
            btEntrar = (Button) findViewById(R.id.btnLogin);

            btEntrar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //CarregarTela1();
                }
            });


    }
}