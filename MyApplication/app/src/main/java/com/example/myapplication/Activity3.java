package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity implements View.OnClickListener{

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        button = findViewById(R.id.button_ok2);
        button.setOnClickListener(this);
    }
    //ПЕРЕХОД НА АКТИВНОСТЬ С ПРАВИЛАМИ
    @Override
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.button_ok2:
                Intent intent = new Intent(this,levels.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}