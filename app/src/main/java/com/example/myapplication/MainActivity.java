package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{

    //ПЕРЕХОД НА АКТИВНОСТЬ С ВЫБОРОМ ВОЗРАСТА!
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button_play);
        button1.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.button_play:
                Intent intent = new Intent(this,Activity3.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}




