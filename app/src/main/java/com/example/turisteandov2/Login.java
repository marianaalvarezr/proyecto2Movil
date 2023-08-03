package com.example.turisteandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    //atributos
    EditText cajaUsuario;
    EditText cajaContrasena;
    Button botoningresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        cajaUsuario=findViewById(R.id.usuario);
        cajaContrasena=findViewById((R.id.contrasena));

        //capturando datos de los etittext
        cajaUsuario=findViewById(R.id.usuario);
        cajaContrasena=findViewById(R.id.contrasena);
        botoningresar=findViewById(R.id.botoningresar);

        botoningresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombreUsuario=cajaUsuario.getText().toString();
                String contrasena = cajaContrasena.getText().toString();

                Intent intent=new Intent(Login.this,Home.class);

                //pasando datos ala nueva actividad

                intent.putExtra("nombre",nombreUsuario);
                intent.putExtra("password",contrasena);

                startActivity(intent);
            }
        });


    }
}