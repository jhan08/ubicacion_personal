package com.example.ubicacion_personal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     et1= (EditText) findViewById(R.id.txt_nom);
     tv1 = (TextView) findViewById(R.id.txt_1);

    }
    public void mostarUbicacion(View view){
        String nombre = et1.getText().toString();
        String mensaje = "hola  " + nombre; tv1.setText(mensaje);
    }
}