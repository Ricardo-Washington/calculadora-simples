package com.example.calculadorasimples;

import android.os.Bundle;
import android.app.*;
import android.view.*;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText valor1, valor2;
    Button btsomar, btsub, btmult, btdiv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        valor1 = (EditText) findViewById(R.id.valor1);
        valor2 = (EditText) findViewById(R.id.valor2);
        btsomar = (Button) findViewById(R.id.btsomar);
        btsub = (Button) findViewById(R.id.btsub);
        btmult = (Button) findViewById(R.id.btmult);
        btdiv = (Button) findViewById(R.id.btdiv);

        btsomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                double num1 = Double.parseDouble(valor1.getText().toString());
                double num2 = Double.parseDouble(valor2.getText().toString());
                double somar = num1 + num2;

                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);

                dialog.setTitle("resultado da soma");
                dialog.setMessage("O resultado da soma e " + somar);
                dialog.setNeutralButton("ok", null);
                dialog.show();


            }
        });
        btsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(valor1.getText().toString());
                double num2 = Double.parseDouble(valor2.getText().toString());
                double sub = num1 - num2;

                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);

                dialog.setTitle("resultado da sub");
                dialog.setMessage("resultado da subitração" + sub);
                dialog.setNeutralButton("ok" , null);
                dialog.show();

            }
        });

        btmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(valor1.getText().toString());
                double num2 = Double.parseDouble(valor2.getText().toString());
                double mult = num1 * num2;

                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);

                dialog.setTitle("resultado mult");
                dialog.setMessage("valor da multipliacação e " + mult);
                dialog.setNeutralButton("ok", null);
                dialog.show();
            }
        });

        btdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(valor1.getText().toString());
                double num2 = Double.parseDouble(valor2.getText().toString());

                if(num2 == 0){
                    AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                    dialog.setTitle("mensagem de erro");
                    dialog.setMessage("nao se divide valores por zero");
                    dialog.setNeutralButton("ok", null);
                    dialog.show();
                }
                else {
                    double mult = num1 / num2;
                    AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                    dialog.setTitle("result div");
                    dialog.setMessage("ro resultado da divisão e " + mult);
                    dialog.setNeutralButton("ok", null);
                    dialog.show();
                }


            }
        });


    }
}
