package com.example.canaleija.controlesi.listeners;

import android.content.Context;
import android.net.wifi.p2p.WifiP2pManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by CANALEIJA on 17/07/2015.
 */
public class ButtonListeners  implements View.OnClickListener {

    // MENSAJE
    private Toast mensaje;
    private Tipos tipo;
    private Context contexto;

    public ButtonListeners (Context contexto,Tipos tipo){

      this.tipo = tipo;
      this.contexto = contexto;

    }

    public enum Tipos {
        BOTON_NORMAL,BOTON_TOGGLE,BOTON_SWITCH,BOTON_IMAGEN;
    }

    @Override
    public void onClick(View v) {

        if (this.tipo == Tipos.BOTON_NORMAL){
            this.mensaje = Toast.makeText(this.contexto,"SE OPRMIMIÓ BOTON NORMAL",Toast.LENGTH_LONG);
        }
        if (this.tipo == Tipos.BOTON_IMAGEN){
            this.mensaje = Toast.makeText(this.contexto,"SE OPRMIMIÓ BOTON IMAGEN",Toast.LENGTH_LONG);
        }
        if (this.tipo == Tipos.BOTON_TOGGLE){
            this.mensaje = Toast.makeText(this.contexto,"SE OPRMIMIÓ BOTON TOGGLE",Toast.LENGTH_LONG);
        }
        if (this.tipo == Tipos.BOTON_SWITCH){
            this.mensaje = Toast.makeText(this.contexto,"SE OPRMIMIÓ BOTON SWITCH",Toast.LENGTH_LONG);
        }
        this.mensaje.show();

    }
}
