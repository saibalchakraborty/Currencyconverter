package com.example.myapplication.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private Currencies currencies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertCurrency(View view){
        double result = 0;
        Spinner spinner = (Spinner) findViewById(R.id.spinnerOne);
        String fromCurrency = spinner.getSelectedItem().toString();
        spinner = (Spinner) findViewById(R.id.spinnerTwo);
        String twoCurrency = spinner.getSelectedItem().toString();
        EditText textValue = (EditText) findViewById(R.id.currency);
        try {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
            if(currencies == null) {
                currencies = new DataRetrieval().getCurrencyData();
            }
            result = CurrencyConverter.convertCurrency(fromCurrency, twoCurrency, currencies) * Integer.parseInt(textValue.getText().toString());
            Toast.makeText(this, Double.toString(result), Toast.LENGTH_LONG).show();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
