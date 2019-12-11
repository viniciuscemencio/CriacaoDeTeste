package com.example.regradetres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Calcula(View view) {

        EditText editA, editB, editC;
        RadioButton  regraComposta;

        Double a, b, c;
        TextView textViewResult;
        Calcula cal = new Calcula();


        editA = findViewById(R.id.editTextValora);
        editB = findViewById(R.id.editTextValorb);
        editC = findViewById(R.id.editTextValorc);




        regraComposta = findViewById(R.id.radioButtonComposta);



        textViewResult = findViewById(R.id.textViewResultado);

        a = Double.parseDouble(editA.getText().toString());
        b = Double.parseDouble(editB.getText().toString());
        c = Double.parseDouble(editC.getText().toString());



        if (regraComposta.isChecked()) {

            Double resultado = cal.CalculaRegraInversa(a, b, c);
            textViewResult.setText(resultado.toString());

        } else  {

            Double resultado = cal.CalculaRegra(a, b, c);
            textViewResult.setText(resultado.toString());
        }

    }






    public void Soma(View v){
        EditText editA, editB;
        Double a, b;

        editA = findViewById(R.id.editTextCala);
        editB = findViewById(R.id.editTextCalb);

        a = Double.parseDouble(editA.getText().toString());
        b = Double.parseDouble(editB.getText().toString());

        Calcula cal = new Calcula();
        Double resultado = cal.CalculaSoma(a, b);

        TextView textViewResult = findViewById(R.id.textViewResultadoCal);
        textViewResult.setText(resultado.toString());

   }
    public void Subtracao(View v){
        EditText editA, editB;
        Double a, b;

        editA = findViewById(R.id.editTextCala);
        editB = findViewById(R.id.editTextCalb);

        a = Double.parseDouble(editA.getText().toString());
        b = Double.parseDouble(editB.getText().toString());

        Calcula cal = new Calcula();
        Double resultado = cal.CalculaSubtracao(a, b);

        TextView textViewResult = findViewById(R.id.textViewResultadoCal);
        textViewResult.setText(resultado.toString());

    }
    public void Multiplicacao(View v){
        EditText editA, editB;
        Double a, b;

        editA = findViewById(R.id.editTextCala);
        editB = findViewById(R.id.editTextCalb);

        a = Double.parseDouble(editA.getText().toString());
        b = Double.parseDouble(editB.getText().toString());

        Calcula cal = new Calcula();
        Double resultado = cal.CalculaMultiplicacao(a, b);

        TextView textViewResult = findViewById(R.id.textViewResultadoCal);
        textViewResult.setText(resultado.toString());

    }
    public void Divisao(View v){
        EditText editA, editB;
        Double a, b;

        editA = findViewById(R.id.editTextCala);
        editB = findViewById(R.id.editTextCalb);

        a = Double.parseDouble(editA.getText().toString());
        b = Double.parseDouble(editB.getText().toString());

        if(a == 0 || b ==0){
            Toast.makeText(MainActivity.this, "Não é possivel fazer divisão por 0 ! ", Toast.LENGTH_SHORT).show();
        }
        else {
            Calcula cal = new Calcula();

            Double resultado = cal.CalculaDivisao(a, b);


            TextView textViewResult = findViewById(R.id.textViewResultadoCal);
            textViewResult.setText(resultado.toString());
        }

    }
}
