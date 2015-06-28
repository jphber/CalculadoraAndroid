/*Desarrollado por: Jean Bernuy
* by applikdos 2015*/

package com.applikdos.main;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.math.*;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    TextView texto;
    int respuesta;
    EditText edit1, edit2;
    Button btnSumar,btnRestar,btnProducto,btnDiv,btnpotencia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1=(EditText)findViewById(R.id.editText);
        edit2=(EditText)findViewById(R.id.editText2);
        btnSumar=(Button)findViewById(R.id.button2);
        btnSumar.setOnClickListener(this);
        btnRestar=(Button)findViewById(R.id.button3);
        btnRestar.setOnClickListener(this);
        btnProducto=(Button)findViewById(R.id.button4);
        btnProducto.setOnClickListener(this);
        btnDiv=(Button)findViewById(R.id.button5);
        btnDiv.setOnClickListener(this);
        btnpotencia=(Button)findViewById(R.id.button6);
        btnpotencia.setOnClickListener(this);
        texto=(TextView)findViewById(R.id.textView2);

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

    @Override
    public void onClick(View v) {
        int num1=Integer.parseInt(edit1.getText().toString());
        int num2=Integer.parseInt(edit2.getText().toString());

        if (v==btnSumar){
            respuesta=num1+num2;
            texto.setText(String.valueOf(respuesta));
        }
        if (v==btnRestar){
            respuesta=num1-num2;
            texto.setText(String.valueOf(respuesta));
        }
        if (v==btnProducto){
            respuesta=num1*num2;
            texto.setText(String.valueOf(respuesta));
        }
        if (v==btnDiv){
            respuesta=num1/num2;
            texto.setText(String.valueOf(respuesta));
        }
        if (v==btnpotencia){

            Double potencia=Math.pow(num1,num2);
            texto.setText(String.valueOf(potencia));
        }

    }
}
