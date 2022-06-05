package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

public class levels extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.levels);


    }
    //методы для перехода
    public void onClick1(View view) {
        switch (view.getId()) {
            case R.id.button_easy:
                Intent intent1 = new Intent(this,GameActivity1.class);
                setContentView(R.layout. activity_game2);
                startActivity(intent1);
                finish();

            case R.id.button_medium:
                Intent intent2 = new Intent(this,GameActivity1.class);
                setContentView(R.layout. activity_game1);
                startActivity(intent2);
                finish();

            case R.id.button_hard:
                Intent intent3 = new Intent(this,GameActivity1.class);
                setContentView(R.layout. activity_game3);
                startActivity(intent3);
                finish();

                break;
            default:
                break;
        }
    }
}

