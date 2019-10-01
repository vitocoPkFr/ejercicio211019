package com.example.ejercicio21_10_19;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button boton;
    TextView

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = (Button)findViewById(R.id.boton1);
        boton.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

    }
}
