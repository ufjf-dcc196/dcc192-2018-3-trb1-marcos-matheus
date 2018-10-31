package marcos_matheus.trabalho_dcc196;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

        edtNomeParticipante = (EditText) findViewById(R.id.edtNomeParticipante);
        edtEmailParticipante = (EditText) findViewById(R.id.edtEmailParticipante);
        edtCpfParticipante = (EditText) findViewById(R.id.edtCpfParticipante);

        btVoltar = (Button) findViewById(R.id.btVoltar);
        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DadosParticipante.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Bundle bundleDetalhes = getIntent().getExtras();
        final int posicao = bundleDetalhes.getInt("posicao");
        final Inscrito ins = MainActivity.inscritos.get(posicao);
        edtNomeParticipante.setText(ins.getNome());
        edtEmailParticipante.setText(ins.getEmail());
        edtCpfParticipante.setText(ins.getCpf());


        btDadosEditar = (Button) findViewById(R.id.btDadosEditar);
        btDadosEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentEditar = new Intent(DadosParticipante.this, EditarDadosInscrito.class);
                intentEditar.putExtra("posicao", posicao);
                startActivity(intentEditar);
            }
        });

        btDadosInscrever = (Button) findViewById(R.id.btDadosInscrever);
        btDadosInscrever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DadosParticipante.this, ListaEventos.class);
                intent.putExtra("posicao", posicao);
                startActivity(intent);
            }
        });
    }
}
