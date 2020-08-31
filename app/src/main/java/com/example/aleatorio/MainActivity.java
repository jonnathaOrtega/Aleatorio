package com.example.aleatorio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
private EditText editTextRango;
private Button btnlanzar;
private TextView textResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // editTextRango=(EditText) findViewById(R.id.editTextRango);
        btnlanzar=(Button) findViewById(R.id.botonlanzar);
        textResult=(TextView) findViewById(R.id.textViewResult);
        btnlanzar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
if(btnlanzar==v){
    Random r=new Random();
    int random=r.nextInt(10);

    textResult.setText(""+random);
}
//int aleatorio=0;
//aleatorio=(int) (Math.random()*10);
    }

}