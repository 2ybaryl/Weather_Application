package com.example.weather_application;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText etCity;
    TextView tvResult;
    private final String url="http://api.weatherapi.com/v1/current.json?key=d8d7c444454f48bdadd134514223105&q=";
    DecimalFormat df= new DecimalFormat("#.##");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etCity=findViewById(R.id.etCity);
        tvResult=findViewById(R.id.tvResult);
    }

    public void getWeatherDetails(View view) {
        String requrl="";
        String city=etCity.getText().toString().trim();
        if(city.equals("")){
            tvResult.setText("City field should not be empty");
        } else {
            requrl=url+city+"&aqi=no";
            StringRequest stringRequest= new StringRequest(Request.Method.POST, requrl, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    Log.d("response", response);
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Toast.makeText(getApplicationContext(), error.toString().trim(), Toast.LENGTH_SHORT).show();
                }
            });
            RequestQueue requestQueue= Volley.newRequestQueue(getApplicationContext());
            requestQueue.add(stringRequest);
        }
    }
}