package com.example.turisteandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    //atributos
    EditText cajaUsuario;
    EditText cajaContrasena;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        cajaUsuario=findViewById(R.id.usuario);
        cajaContrasena=findViewById((R.id.contrasena));

        //capturando datos de los etittext
        String nombreUsuario=cajaUsuario.getText().toString();
        String contrasena=cajaContrasena.getText().toString();
    }
}