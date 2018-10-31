package marcos_matheus.trabalho_dcc196;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastroEvento extends AppCompatActivity {

    Button btCadastrarEvento;
    Button btCancelar;

    EditText edtTituloEvento;
    EditText edtDataEvento;
    EditText edtHorarioEvento;
    EditText edtFacilitadorEvento;
    EditText edtDescricaoEvento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_evento);

        btCadastrarEvento = (Button) findViewById(R.id.btCadastrarEvento);

        btCancelar = (Button) findViewById(R.id.btCancelar);
        btCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent cancela = new Intent(CadastroEvento.this, MainActivity.class);
                startActivity(cancela);
            }
        });

        edtTituloEvento = (EditText) findViewById(R.id.edtTituloEvento);
        edtDataEvento = (EditText) findViewById(R.id.edtDataEvento);
        edtHorarioEvento = (EditText) findViewById(R.id.edtHorarioEvento);
        edtFacilitadorEvento = (EditText) findViewById(R.id.edtFacilitadorEvento);
        edtDescricaoEvento = (EditText) findViewById(R.id.edtDescricaoEvento);
    }
}
