package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view)
    {
        EditText in=(EditText) findViewById(R.id.rsinput);
        Double dl=Double.parseDouble(in.getText().toString());
        dl=dl*0.014;
        Toast.makeText(this, String.format("the amount in dollars is:%s", dl), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
