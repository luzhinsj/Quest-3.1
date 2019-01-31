package com.example.quest;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class QuestScreen extends AppCompatActivity {
    Scene currentScene;

    private void drawScene (){
        final TextView tvDay = (TextView) findViewById(R.id.tvDay);
        final TextView TVtext = (TextView) findViewById(R.id.TVtext);
        final TextView TVchose1 = (TextView) findViewById(R.id.TVchose1);
        final TextView TVchose2 = (TextView) findViewById(R.id.TVchose2);
        final TextView TVchose3 = (TextView) findViewById(R.id.TVchose3);



        tvDay.setText("День "+ currentScene.day.toString());
        TVtext.setText(currentScene.text);
        TVchose1.setText(currentScene.chose1);
        TVchose2.setText(currentScene.chose2);
        TVchose3.setText(currentScene.chose3);

        if (TVchose1.getText().equals(""))TVchose1.setBackgroundColor(Color.TRANSPARENT);
        else TVchose1.setBackgroundColor(Color.DKGRAY);
        if (TVchose2.getText().equals(""))TVchose2.setBackgroundColor(Color.TRANSPARENT);
        else TVchose2.setBackgroundColor(Color.DKGRAY);
        if (TVchose3.getText().equals(""))TVchose3.setBackgroundColor(Color.TRANSPARENT);
        else TVchose3.setBackgroundColor(Color.DKGRAY);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest_screen);

        final TextView tvDay = (TextView) findViewById(R.id.tvDay);
        final TextView TVtext = (TextView) findViewById(R.id.TVtext);
        final TextView TVchose1 = (TextView) findViewById(R.id.TVchose1);
        final TextView TVchose2 = (TextView) findViewById(R.id.TVchose2);
        final TextView TVchose3 = (TextView) findViewById(R.id.TVchose3);

        final Toast toast = Toast.makeText(getApplicationContext(),
                "Недостаточно умений или припасов", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);


        final Scene scene1 = new Scene(1,1, R.string.text1, R.string.chose1_1, R.string.chose1_2, R.string.chose1_3);
        final Scene scene2 = new Scene(2,2, R.string.text2_1, R.string.chose2_1, R.string.chose2_2, R.string.chose2_3);
        final Scene scene3 = new Scene(3,2, R.string.text3, R.string.chose3_1, R.string.chose3_2, R.string.chose3_3);
        final Scene scene4 = new Scene(4,2,R.string.text4,R.string.chose4_1, R.string.chose4_2, R.string.chose4_3);
        final Scene scene9 = new Scene(9,2,R.string.text9, R.string.chose9_1, R.string.chose9_2, R.string.chose9_3);
        final Scene scene6 = new Scene(6,2,R.string.text6, R.string.chose6_1, R.string.chose6_2, R.string.chose6_3);
        final Scene scene5 = new Scene(5,2,R.string.text5, R.string.chose5_1, R.string.chose5_2, R.string.chose5_3);
        final Scene scene7 = new Scene(7,2,R.string.text7, R.string.chose7_1, R.string.chose7_2, R.string.chose7_3);
        final Scene scene8 = new Scene(8,2,R.string.text8, R.string.chose8_1, R.string.chose8_2, R.string.chose8_3);
        final Scene scene10 = new Scene(10,2,R.string.text10, R.string.chose10_1, R.string.chose10_2, R.string.chose10_3);
        final Scene scene11 = new Scene(11,3,R.string.text11, R.string.chose11_1, R.string.chose11_2, R.string.chose11_3);
        final Scene scene12 = new Scene(12,3,R.string.text12, R.string.chose12_1, R.string.chose12_2, R.string.chose12_3);
        final Scene scene14 = new Scene(14,3,R.string.text14, R.string.chose14_1, R.string.chose14_2, R.string.chose14_3);
        final Scene scene15 = new Scene(15,3,R.string.text15, R.string.chose15_1, R.string.chose15_2, R.string.chose15_3);
        final Scene scene16 = new Scene(16,3,R.string.text16, R.string.chose16_1, R.string.chose16_2, R.string.chose16_3);
        final Scene scene22 = new Scene(22,3,R.string.text22, R.string.chose22_1, R.string.chose22_2, R.string.chose22_3);
        final Scene scene13 = new Scene(13,3,R.string.text13, R.string.chose13_1, R.string.chose13_2, R.string.chose13_3);
        final Scene scene18 = new Scene(18,3,R.string.text18, R.string.chose18_1, R.string.chose18_2, R.string.chose18_3);
        final Scene scene19 = new Scene(19,3,R.string.text19, R.string.chose19_1, R.string.chose19_2, R.string.chose19_3);
        final Scene scene17 = new Scene(17,3,R.string.text17, R.string.chose17_1, R.string.chose17_2, R.string.chose17_3);
        final Scene scene20 = new Scene(20,3,R.string.text20, R.string.chose20_1, R.string.chose20_2, R.string.chose20_3);
        final Scene scene23 = new Scene(23,4,R.string.text23, R.string.chose23_1, R.string.chose23_2, R.string.chose23_3);
        final Scene scene21 = new Scene(21,4,R.string.text21, R.string.chose21_1, R.string.chose21_2, R.string.chose21_3);
        final Scene scene24 = new Scene(24,4,R.string.text24, R.string.chose24_1, R.string.chose24_2, R.string.chose24_3);


        currentScene = scene1;
        drawScene();

        TVchose1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (currentScene.number){
                    case 1:
                        currentScene = scene2;
                        if (MyCharacter.luck >= 4) scene2.text = R.string.text2_2;
                        Choices.rucksackIsTaken = true;
                        drawScene();
                        break;
                    case 5:
                        currentScene = scene7;
                        drawScene();
                        break;
                    case 7:
                        finish();
                        break;
                    case 8:
                        finish();
                        break;
                    case 2:
                        Choices.foodIsTaken = true;
                        currentScene = scene11;
                        drawScene();
                        break;
                    case 3:
                        currentScene = scene11;
                        drawScene();
                        break;
                    case 10:
                        currentScene = scene11;
                        drawScene();
                        break;
                    case 4:
                        currentScene = scene11;
                        drawScene();
                        break;
                    case 9:
                        Choices.silencerIsTaken = true;
                        currentScene = scene11;
                        drawScene();
                        break;
                    case 11:
                        currentScene = scene12;
                        drawScene();
                        break;
                    case 12:
                        currentScene = scene14;
                        drawScene();
                        break;
                    case 16:
                        currentScene = scene22;
                        drawScene();
                        break;
                    case 13:
                        currentScene = scene12;
                        drawScene();
                        break;
                    case 14:
                        if (MyCharacter.supply == 2) {
                            currentScene = scene17;
                            drawScene();
                        }
                        else toast.show();
                        break;
                    case 15:
                        currentScene = scene17;
                        drawScene();
                        break;
                    case 22:
                        currentScene = scene17;
                        drawScene();
                        break;
                    case 18:
                        if (MyCharacter.supply == 2) {
                            currentScene = scene20;
                            drawScene();
                        }
                        else toast.show();
                        break;
                    case 19:
                        currentScene = scene20;
                        drawScene();
                        break;
                    case 17:
                        currentScene = scene23;
                        drawScene();
                        break;
                    case 20:
                        currentScene = scene23;
                        drawScene();
                        break;
                    case 23:
                        finish();
                        break;
                    case 21:
                        finish();
                        break;
                    case 24:
                        finish();
                        break;


                }
            }
        });

        TVchose2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (currentScene.number){
                    case 1:
                        currentScene = scene3;
                        drawScene();
                        break;
                    case 4:
                        if (MyCharacter.strength >= 4){
                        currentScene = scene9;
                        drawScene();
                        }
                        else toast.show();
                        break;
                    case 3:
                        currentScene = scene5;
                        drawScene();
                        break;
                    case 5:
                        if (MyCharacter.supply == 3) {
                            if (MyCharacter.luck < 5) {
                                currentScene = scene8;
                                drawScene();
                            } else {
                                currentScene = scene10;
                                drawScene();
                            }
                        }
                        else toast.show();
                        break;
                    case 2:
                        if (MyCharacter.strength >= 3){
                            Choices.axeIsTaken = true;
                            currentScene = scene11;
                            drawScene();
                        }
                        else toast.show();
                        break;
                    case 9:
                        Choices.shotgunIsTaken = true;
                        currentScene = scene11;
                        drawScene();
                        break;
                    case 14:
                        finish();
                        break;
                    case 12:
                        if (Choices.foodIsTaken){
                            currentScene = scene15;
                            drawScene();
                        }
                        else toast.show();
                        break;
                    case 11:
                        currentScene = scene13;
                        drawScene();
                        break;
                    case 13:
                        if (Choices.silencerIsTaken){
                            currentScene = scene18;
                            drawScene();
                        }
                        else toast.show();
                        break;
                    case 18:
                        finish();
                        break;
                    case 16:
                        currentScene = scene17;
                        drawScene();
                        break;
                    case 17:
                        if (MyCharacter.luck == 5){
                            currentScene = scene21;
                            drawScene();
                        }
                        else {
                            currentScene = scene24;
                            drawScene();
                        }
                        break;
                }
            }
        });

        TVchose3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (currentScene.number){
                    case 1:
                        currentScene = scene4;
                        drawScene();
                        break;
                    case 4:
                        if (MyCharacter.intellegence >= 4){
                        currentScene = scene9;
                        drawScene();}
                        else toast.show();
                        break;
                    case 3:
                        if (MyCharacter.intellegence >= 3){
                            currentScene = scene6;
                            drawScene();}
                        else toast.show();
                        break;
                    case 2:
                        if (MyCharacter.luck >= 4){
                            currentScene = scene11;
                            drawScene();
                        }
                        else toast.show();
                        break;
                    case 9:
                        if (MyCharacter.strength >= 4){
                            Choices.M4IsTaken = true;
                            currentScene = scene11;
                            drawScene();
                        }
                        else toast.show();
                        break;
                    case 16:
                        if (Choices.foodIsTaken){
                            currentScene = scene15;
                            drawScene();
                        }
                        else toast.show();
                        break;
                    case 12:
                        if (MyCharacter.supply == 1){
                            currentScene = scene16;
                            drawScene();
                        }
                        else toast.show();
                        break;
                    case 13:
                        if (MyCharacter.oratory >= 4){
                            currentScene = scene19;
                            drawScene();
                        }
                        else toast.show();
                        break;

                }
            }
        });
    }
}

