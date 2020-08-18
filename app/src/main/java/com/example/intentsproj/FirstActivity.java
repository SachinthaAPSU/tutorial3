package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button button1;
    EditText num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=findViewById(R.id.button);

        num1 = findViewById(R.id.nu1);
        num2 =findViewById(R.id.nu2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String number1 = num1.getText().toString();
                String number2 = num2.getText().toString();
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                intent.putExtra("number1",number1);
                intent.putExtra("number2",number2);
                startActivity(intent);

                Toast toast= Toast.makeText(getApplicationContext(),"Sending message..",Toast.LENGTH_LONG);
                toast.show();

            }
        });
    }

}