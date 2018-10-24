package marcos_matheus.trabalho_dcc196;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView txtTitulo;
    TextView txtMainEventos;
    TextView txtMainParticipantes;

    Button btNovoEvento;
    Button btNovoParticipante;

    List lstEventos;
    List lstParticipantes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtTitulo = (TextView) findViewById(R.id.txtTitulo);
        txtMainEventos = (TextView) findViewById(R.id.txtMainEventos);
        txtMainParticipantes = (TextView) findViewById(R.id.txtMainParticipantes);

        btNovoEvento = (Button) findViewById(R.id.btNovoEvento);
        btNovoParticipante = (Button) findViewById(R.id.btNovoParticipante);



    }
}
