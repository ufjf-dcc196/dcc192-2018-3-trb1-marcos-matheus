package marcos_matheus.trabalho_dcc196;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class DadosParticipante extends AppCompatActivity {

    Button btDadosInscrever;
    Button btDadosEditar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_participante);


        btDadosInscrever = (Button) findViewById(R.id.btDadosInscrever);
        btDadosEditar = (Button) findViewById(R.id.btDadosEditar);

    }
}
