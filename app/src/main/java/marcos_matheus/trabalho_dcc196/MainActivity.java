package marcos_matheus.trabalho_dcc196;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btNovoEvento;
    Button btNovoParticipante;

    List lstEventos;
    List lstParticipantes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btNovoEvento = (Button) findViewById(R.id.btNovoEvento);
        btNovoEvento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(MainActivity.this, CadastroEvento.class);
                startActivity(it);

            }
        });

        btNovoParticipante = (Button) findViewById(R.id.btNovoParticipante);
        btNovoParticipante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(MainActivity.this, CadastroParticipante.class);
                startActivity(it);

            }
        });

    }
}
