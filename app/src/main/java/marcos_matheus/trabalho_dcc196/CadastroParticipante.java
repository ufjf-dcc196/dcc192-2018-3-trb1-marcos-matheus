package marcos_matheus.trabalho_dcc196;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


public class CadastroParticipante extends AppCompatActivity {

    Button btCadastrarParticipante;
    Button btCancelar;

    EditText edtNomeParticipante;
    EditText edtEmailParticipante;
    EditText edtCpfParticipante;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_participante);


        btCadastrarParticipante = (Button) findViewById(R.id.btCadastrarParticipante);
        btCancelar = (Button) findViewById(R.id.btCancelar);

        edtNomeParticipante = (EditText) findViewById(R.id.edtNomeParticipante);
        edtEmailParticipante = (EditText) findViewById(R.id.edtEmailParticipante);
        edtCpfParticipante = (EditText) findViewById(R.id.edtCpfParticipante);

    }
}
