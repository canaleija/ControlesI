package com.example.canaleija.controlesi;

import android.view.View;

/**
 * Created by CANALEIJA on 17/07/2015.
 */
public class Elemento {


    private String Titulo;


    public Elemento (String titulo){
        this.setTitulo(titulo);
  }

    @Override
    public String toString(){

       return getTitulo();
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
}
