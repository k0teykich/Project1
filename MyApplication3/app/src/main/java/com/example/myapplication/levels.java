package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class levels extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.levels);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, GameActivity1.class);
       switch(v.getId()) {
           case R.id.button_easy:
               intent.putExtra("diff", 1);
               startActivity(intent);
               break;
           case R.id.button_medium:
               intent.putExtra("diff", 2);
               startActivity(intent);
               break;
           case R.id.button_hard:
               intent.putExtra("diff", 3);
               startActivity(intent);
               break;
       }
    }
}