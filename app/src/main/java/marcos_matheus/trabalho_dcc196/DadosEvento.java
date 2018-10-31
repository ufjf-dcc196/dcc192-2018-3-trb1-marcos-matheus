package marcos_matheus.trabalho_dcc196;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DadosEvento extends AppCompatActivity {

    private Button btEditarEvento;
    private Button btVoltar;

    private EditText edtTituloEvento;
    private EditText edtDataEvento;
    private EditText edtHorarioEvento;
    private EditText edtFacilitadorEvento;
    private EditText edtDescricaoEvento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_evento);

        btEditarEvento = (Button) findViewById(R.id.btEditarEvento);
        btEditarEvento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent edita = new Intent(DadosEvento.this, CadastroEvento.class);
                startActivity(edita);
            }
        });

        btVoltar = (Button) findViewById(R.id.btVoltar);
        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent cancela = new Intent(DadosEvento.this, MainActivity.class);
                startActivity(cancela);
            }
        });

    }
}
