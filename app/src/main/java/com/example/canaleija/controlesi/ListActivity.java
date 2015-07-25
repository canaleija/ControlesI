package com.example.canaleija.controlesi;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.LinkedHashSet;


public class ListActivity extends Activity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        //numeroBotones = Integer.parseInt(savedInstanceState.getString("numero"));

        this.listView = (ListView)findViewById(R.id.listView);

       generarBotones();

    }

    private void generarBotones() {

        final Elemento[] datos =
                new Elemento[]{new Elemento("Elemento1"),new Elemento("Elemento2")};

       ArrayAdapter<Elemento> adaptador =
                new ArrayAdapter<Elemento>(this,
                        android.R.layout.simple_list_item_1, datos);

        this.listView.setAdapter(adaptador);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String opcion = ((Elemento) parent.getItemAtPosition(position)).getTitulo();
                mensaje(opcion);
            }
        });


    }
    public void mensaje(String msj){

      Toast men = Toast.makeText(this,"Opcion: "+msj,Toast.LENGTH_SHORT);
        men.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_list, menu);
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


}
