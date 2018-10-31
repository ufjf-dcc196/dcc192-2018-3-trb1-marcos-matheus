package marcos_matheus.trabalho_dcc196;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DadosParticipante extends AppCompatActivity {

    Button btDadosInscrever;
    Button btDadosEditar;
    Button btVoltar;

    EditText edtNomeParticipante;
    EditText edtEmailParticipante;
    EditText edtCpfParticipante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_participante);


        btDadosInscrever = (Button) findViewById(R.id.btDadosInscrever);
        btDadosInscrever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent inscreve = new Intent(DadosParticipante.this, MainActivity.class);
                startActivity(inscreve);
            }
        });


        btDadosEditar = (Button) findViewById(R.id.btDadosEditar);
        btDadosEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent edita = new Intent(DadosParticipante.this, CadastroParticipante.class);
                startActivity(edita);
            }
        });

        btDadosEditar = (Button) findViewById(R.id.btDadosEditar);
        btDadosEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent edita = new Intent(DadosParticipante.this, CadastroParticipante.class);
                startActivity(edita);
            }
        });

        btVoltar = (Button) findViewById(R.id.btVoltar);
        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent cancela = new Intent(DadosParticipante.this, MainActivity.class);
                startActivity(cancela);
            }
        });

    }
}
