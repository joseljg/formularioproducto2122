package es.joseljg.formularioproducto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //----------------------------------------------------
        Intent intent = getIntent();
        if(intent != null)
        {
            Envio e1 = (Envio) intent.getSerializableExtra(MainActivity.EXTRA_OBJETO_ENVIO);
            mostrarEnvio(e1);
        }
    }

    private void mostrarEnvio(Envio e1) {
        Toast.makeText(this,e1.toString(), Toast.LENGTH_LONG).show();
    }
}