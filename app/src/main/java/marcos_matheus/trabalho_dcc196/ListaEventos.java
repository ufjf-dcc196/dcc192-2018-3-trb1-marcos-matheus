package marcos_matheus.trabalho_dcc196;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

public class ListaEventos extends AppCompatActivity {

    private Button btVoltar;
    private RecyclerView lstEventosDisponiveis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscricao_evento);

        Bundle bundle = getIntent().getExtras();
        final int posicao = bundle.getInt("posicao");

        btVoltar = (Button) findViewById(R.id.btVoltarInscricao);
        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListaEventos.this, DadosParticipante.class);
                intent.putExtra("posicao", posicao);
                startActivity(intent);
            }
        });

        lstEventosDisponiveis = (RecyclerView) findViewById(R.id.lstEventosDisp);
        lstEventosDisponiveis.setLayoutManager(new LinearLayoutManager(this));
        final ControleEvento eventoAdapter = new ControleEvento(MainActivity.eventos);
        lstEventosDisponiveis.setAdapter(eventoAdapter);
        eventoAdapter.setOnEventoClickListener(new ControleEvento.OnEventoClickListener() {
            @Override
            public void onEventoClick(View view, int position) {
                Intent intent = new Intent(ListaEventos.this, InscricaoEvento.class);
                intent.putExtra("posicao", position);
                int idParticipante = posicao;
                intent.putExtra("idParticipante", idParticipante);
                startActivity(intent);
            }
        });
    }
}
