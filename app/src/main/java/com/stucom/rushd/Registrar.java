package com.stucom.rushd;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Registrar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
        Button btn_Registrar = findViewById(R.id.btn_registrar);
        Button btn_IniciarS = findViewById(R.id.btn_init_sesion);
        btn_Registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                switch(v.getId()) {
                    case R.id.btn_registrar:
                    intent = new Intent(Registrar.this, Registrarse.class);
                    break;
                    case R.id.btn_init_sesion:
                    intent = new Intent();
                }
                if (intent == null) return;
                startActivity(intent);
            }



        });



    }



}
