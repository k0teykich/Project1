package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lose_activity);
    }
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.button_ok2:
                Intent intent = new Intent(this,Activity3.class);
                startActivity(intent);
                int score = +1;
                break;
            default:
                break;

        }
    }
}