package com.example.canaleija.controlesi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.ToggleButton;
import android.widget.ImageButton;

import com.example.canaleija.controlesi.listeners.ButtonListeners;


public class MainActivity extends Activity {

    private Button botonNormal,botonNormal2;
    private Switch botonSwitch;
    private ToggleButton botonToggle;
    private ImageButton botonImagen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        referenciamos();
    }

    private void referenciamos() {
        this.botonNormal = (Button)findViewById(R.id.button);
        this.botonImagen = (ImageButton) findViewById(R.id.imageButton);
        this.botonSwitch = (Switch) findViewById(R.id.switch1);
        this.botonToggle = (ToggleButton) findViewById(R.id.toggleButton);
        this.botonNormal2 = (Button)findViewById(R.id.button2);
        // agregamos listeners

        ButtonListeners listenerBotones;

        this.botonImagen.setOnClickListener(listenerBotones = new ButtonListeners
                (this, ButtonListeners.Tipos.BOTON_IMAGEN));
        this.botonSwitch.setOnClickListener(listenerBotones = new ButtonListeners
                (this, ButtonListeners.Tipos.BOTON_SWITCH));

        this.botonNormal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generaActividad();

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
     }

    private void generaActividad (){

      Intent intento = new Intent(this,ListActivity.class);
        //intento.putExtra("numero","4");
       startActivity(intento);
    }
}
