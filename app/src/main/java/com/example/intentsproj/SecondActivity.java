package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText snumber1,snumber2;
    TextView viewResult;
    Button btnadd,btnsub,btnmul,btndiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        snumber1 = findViewById(R.id.txt1);
        snumber2 = findViewById(R.id.txt2);
        viewResult=findViewById(R.id.text);

        btnadd = findViewById(R.id.btnadd);
        btnsub = findViewById(R.id.btnsub);
        btnmul = findViewById(R.id.btnmul);
        btndiv = findViewById(R.id.btndiv);

        String nm1 = getIntent().getStringExtra("number1");
        String nm2 = getIntent().getStringExtra("number2");

        snumber1.setText(nm1);
        snumber2.setText(nm2);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numberO = Integer.parseInt(snumber1.getText().toString());
                int numberT = Integer.parseInt(snumber2.getText().toString());
                int btnadd = numberO+numberT;
                viewResult.setText((numberO)+"+"+(numberT)+"="+(btnadd));


            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numberO = Integer.parseInt(snumber1.getText().toString());
                int numberT = Integer.parseInt(snumber2.getText().toString());
                int btnsub = numberO - numberT;
                viewResult.setText((numberO)+"-"+(numberT)+"="+(btnsub));
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numberO = Integer.parseInt(snumber1.getText().toString());
                int numberT = Integer.parseInt(snumber2.getText().toString());
                int btnmul = numberO * numberT;
                viewResult.setText((numberO)+"*"+(numberT)+"="+(btnmul));
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numberO = Integer.parseInt(snumber1.getText().toString());
                int numberT = Integer.parseInt(snumber2.getText().toString());
                int btndiv = numberO / numberT;
                viewResult.setText((numberO)+"/"+(numberT)+"="+(btndiv));
            }
        });

    }
}