package com.example.weather_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText etCity;
    TextView tvResult;
    private final String url="http://api.weatherapi.com/v1/current.json";
    private final String apikey="d8d7c444454f48bdadd134514223105";
    DecimalFormat df= new DecimalFormat("#.##");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etCity=findViewById(R.id.etCity);
        tvResult=findViewById(R.id.tvResult);
    }

    public void getWeatherDetails(View view) {
    }
}