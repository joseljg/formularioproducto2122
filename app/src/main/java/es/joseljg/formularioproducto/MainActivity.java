package es.joseljg.formularioproducto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_OBJETO_ENVIO = "es.joseljg.formularioproducto.mainActivity.envio";
    // variables privadas de tipo EditText
    private EditText edt_idproducto = null;
    private EditText edt_nombre = null;
    private EditText edt_direccion = null;
    private EditText edt_telefono = null;

    // variables del formulario
    private String idproducto = null;
    private String nombre = null;
    private String direccion = null;
    private String telefono = null;
    private String tipoEnvio = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_idproducto = (EditText) findViewById(R.id.edt_idproducto);
        edt_nombre = (EditText) findViewById(R.id.edt_nombre);
        edt_direccion = (EditText) findViewById(R.id.edt_direccion);
        edt_telefono = (EditText) findViewById(R.id.edt_telefono);
        tipoEnvio = "normal";

    }

    public void siguiente(View view) {
        idproducto = String.valueOf(edt_idproducto.getText());
        nombre = String.valueOf(edt_nombre.getText());
        direccion = String.valueOf(edt_direccion.getText());
        telefono = String.valueOf(edt_telefono.getText());
        //--------------------------------------------------------------------
        Envio e1 = new Envio(idproducto,nombre,direccion,telefono,tipoEnvio);
        //--------------------------------------------------------------------
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra(EXTRA_OBJETO_ENVIO, e1);
        startActivity(intent);
    }

    public void asignarEnvio(View view) {
        RadioButton rb1 = (RadioButton) view;
        if(rb1.isChecked())
        {
            switch(rb1.getId())
            {
                case R.id.rb_enviolento:
                    tipoEnvio = "lento";
                    break;
                case R.id.rb_envionormal:
                    tipoEnvio = "normal";
                    break;
                case R.id.rb_enviourgente:
                    tipoEnvio ="urgente";
                    break;
            }
            Toast.makeText(this,"el tipo de envio es ahora " + tipoEnvio, Toast.LENGTH_SHORT).show();
        }
    }
}