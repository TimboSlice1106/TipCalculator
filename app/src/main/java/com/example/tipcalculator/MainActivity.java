package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText FinalBill;
    private EditText TipPercent;
    private EditText PerPersonBill;
    private EditText numPeople;
    private Button TipButton;
    private RadioButton radioButton2;
    private RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FinalBill = findViewById(R.id.FinalBill);
        TipPercent = findViewById(R.id.TipPercent);
        PerPersonBill = findViewById(R.id.PerPersonBill);
        TipButton = findViewById(R.id.TipButton);
        numPeople = findViewById(R.id.numPeople);
        TipButton = findViewById(R.id.TipButton);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton = findViewById(R.id.radioButton);
    }

    public void tip(View v) {
        if (radioButton2.isChecked()) {
            String input = TipPercent.getText().toString();
            String input2 = FinalBill.getText().toString();
            String input3 = PerPersonBill.getText().toString();
            if (input.length() > 0) {
                if (input2.length() > 0) {
                    double TipValue = Double.parseDouble(input);
                    double FinalBill = Double.parseDouble(input2);
                    double PerPersonalBill = Double.parseDouble(input3);
                    TipValue = ((TipValue * FinalBill) / 100) / PerPersonalBill;
                    numPeople.setText(String.format("%.2f", TipValue));
                }
            } else {
                String input4 = TipPercent.getText().toString();
                String input5 = FinalBill.getText().toString();
                    if (input4.length() > 0) {
                        if (input5.length() > 0) {
                            double TipValue = Double.parseDouble(input4);
                            double FinalBill = Double.parseDouble(input5);
                            TipValue = ((TipValue * FinalBill) / 100);
                            numPeople.setText(String.format("%.2f", TipValue));
                }
            }
        }
    }
}
}
