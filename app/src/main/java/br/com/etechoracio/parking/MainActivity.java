package br.com.etechoracio.parking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtQtdeHrs;
    EditText txtValorHora;
    EditText txtHoraAdc;
    TextView lblTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtQtdeHrs = findViewById(R.id.txtQtdeHrs);
        txtValorHora = findViewById(R.id.txtValorHora);
        txtHoraAdc = findViewById(R.id.txtHoraAdc);
        lblTotal = findViewById(R.id.lblTotal);

    }

    public void onCalcular(View v) {
        double Valor = Double.parseDouble(txtValorHora.getText().toString());
        double Qtde = Double.parseDouble(txtQtdeHrs.getText().toString());
        double Adc = Integer.parseInt(txtHoraAdc.getText().toString());

        double total = Valor + Adc * (Qtde - 1);
        lblTotal.setText(String.valueOf(total));
    }

}