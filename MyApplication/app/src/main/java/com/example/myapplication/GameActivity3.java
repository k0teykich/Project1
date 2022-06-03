package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity3 extends AppCompatActivity implements View.OnClickListener{

    //ImageAdapter Randomizer
    private int score;
    private ImageAdapter3 imageAdapter;
    private Button[] buttonsAnswer;

    private void newGameIteration() {
        for (int i = 0; i < buttonsAnswer.length; i++) {
            int currentNumber = getRandomNumber();
            if (currentNumber == imageAdapter.getCurrentCountOfImages()) {
                currentNumber--;
                if (currentNumber == 0)
                    currentNumber = imageAdapter.getCount();
            }
            buttonsAnswer[i].setText(String.valueOf(currentNumber));
        }
        buttonsAnswer[(int) (Math.random() * (buttonsAnswer.length))].setText(String.valueOf(imageAdapter.getCurrentCountOfImages()));
    }

    private int getRandomNumber() {
        return (int) (Math.random() * (imageAdapter.getCount() - 1)) + 1;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game3);

        GridView gridview = (GridView) findViewById(R.id.gridView1);
        imageAdapter = new ImageAdapter3(this);
        imageAdapter.setCurrentImageId(R.drawable.toy);
        imageAdapter.setCurrentCountOfImages(getRandomNumber());

        gridview.setAdapter(imageAdapter);
        Log.d("Logging", "InCreate");

        buttonsAnswer = new Button[4];
        buttonsAnswer[0] = (Button) findViewById(R.id.button_answer1);
        buttonsAnswer[1] = (Button) findViewById(R.id.button_answer2);
        buttonsAnswer[2] = (Button) findViewById(R.id.button_answer3);
        buttonsAnswer[3] = (Button) findViewById(R.id.button_answer4);
        newGameIteration();
    }

    @Override
    public void onClick(View view) {
        Button currentButton = (Button) view;
        //ПРАВИЛЬНЫЙ ОТВЕТ
        if (Integer.valueOf(currentButton.getText().toString()) == imageAdapter.getCurrentCountOfImages()) {
            Toast.makeText(getApplicationContext(), "Верно!", Toast.LENGTH_SHORT).show();
            imageAdapter.setImagesAtRandomPosition(getRandomNumber());
            newGameIteration();

            TextView textView = (TextView) findViewById(R.id.textView5);
            textView.setText("Ваш счет: " + ++score);}
        //НЕПРАВИЛЬНЫЙ ОТВЕТ
        else {
            Intent intent = new Intent(this, LoseActivity.class);
            startActivity(intent);
            finish();
        }
    }
}



