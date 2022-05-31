package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class levels extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.levels);


    }
    public void onClick3(View view) {
            switch (view.getId()) {
                case R.id.button_hard:
                    Intent intent = new Intent(this,GameActivity3.class);
                    startActivity(intent);
                    finish();
                    break;
                default:
                    break;
        }
    }
    public void onClick2(View view) {
        switch (view.getId()) {
            case R.id.button_medium:
                Intent intent = new Intent(this,GameActivity1.class);
                startActivity(intent);
                finish();
                break;
            default:
                break;
        }
    }
    public void onClick1(View view) {
        switch (view.getId()) {
            case R.id.button_easy:
                Intent intent = new Intent(this,GameActivity2.class);
                startActivity(intent);
                finish();
                break;
            default:
                break;
        }
    }
}

