package com.example.practicau21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private  TextView txtresultado;
    private Button BTNmostrar;
    private EditText etNombre,etCelular;

    private int celular;
    private String nombre;
    private Button BTNinvertir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        inicializarVistas();
        BTNmostrar.setOnClickListener(this);
        BTNinvertir.setOnClickListener(this);
    }

    private void inicializarVistas() {
        //inicializar vistas
        /*
        tener refenrencia visual que hemos diseñado en una variable
         */
        txtresultado = findViewById(R.id.txtresultado);

        etNombre = findViewById(R.id.etNombre);
        etCelular = findViewById(R.id.etCelular);
        BTNmostrar = findViewById(R.id.BTNMostrar);
        BTNinvertir = findViewById(R.id.BTNinvertir);
    }
    private  void  monstrarTexto(){
       nombre = etNombre.getText().toString();
       String celularText =etCelular.getText().toString();
       txtresultado.setText("Nombre: "+ nombre+", Celular: " + celularText);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.BTNMostrar:
                monstrarTexto();
                break;
            case R.id.BTNinvertir:
                invertirNumero();
                break;
        }



    }

    private void invertirNumero() {
        String celularTexto=etCelular.getText().toString();
        celular= Integer.parseInt(celularTexto);
        int resto=0; int invertir=0;
        while(this.celular>0)
        {
            resto= this.celular%10;
            invertir=invertir*10+resto;
            this.celular=this.celular/10;

        }
        txtresultado.setText("Numero invertido: "+invertir);
    }
}