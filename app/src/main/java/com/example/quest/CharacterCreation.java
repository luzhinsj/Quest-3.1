package com.example.quest;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CharacterCreation extends AppCompatActivity {
    Integer pointRemains = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_creation);

        final TextView TVstr = (TextView) findViewById(R.id.StrengthNum);
        final TextView TVint = (TextView) findViewById(R.id.IntellegenceNum);
        final TextView TVluck = (TextView) findViewById(R.id.LuckNum);
        final TextView TVor = (TextView) findViewById(R.id.OratoryNum);
        final TextView TVpoints = (TextView) findViewById(R.id.textView11);
        final TextView Supply1 = (TextView) findViewById(R.id.textView13);
        final TextView Supply2 = (TextView) findViewById(R.id.textView14);
        final TextView Supply3 = (TextView) findViewById(R.id.textView15);
        final Button ready = (Button) findViewById(R.id.button2);

        final Toast toast = Toast.makeText(getApplicationContext(),
                "Слишком крутой персонаж", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP, 0, 0);

        Supply1.setBackgroundColor(Color.DKGRAY);
        Supply2.setBackgroundColor(Color.DKGRAY);
        Supply3.setBackgroundColor(Color.DKGRAY);

        TVstr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyCharacter.strength = (MyCharacter.strength + 1) % 6;
                TVstr.setText(MyCharacter.strength.toString());
                pointRemains = 10 - (MyCharacter.strength + MyCharacter.oratory + MyCharacter.luck + MyCharacter.intellegence);
                TVpoints.setText("Очков осталось: " + pointRemains);
            }
        });

        TVint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyCharacter.intellegence = (MyCharacter.intellegence + 1) % 6;
                TVint.setText(MyCharacter.intellegence.toString());
                pointRemains = 10 - (MyCharacter.strength + MyCharacter.oratory + MyCharacter.luck + MyCharacter.intellegence);
                TVpoints.setText("Очков осталось: " + pointRemains);
            }
        });

        TVluck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyCharacter.luck = (MyCharacter.luck + 1) % 6;
                TVluck.setText(MyCharacter.luck.toString());
                pointRemains = 10 - (MyCharacter.strength + MyCharacter.oratory + MyCharacter.luck + MyCharacter.intellegence);
                TVpoints.setText("Очков осталось: " + pointRemains);
            }
        });

        TVor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyCharacter.oratory = (MyCharacter.oratory + 1) % 6;
                TVor.setText(MyCharacter.oratory.toString());
                pointRemains = 10 - (MyCharacter.strength + MyCharacter.oratory + MyCharacter.luck + MyCharacter.intellegence);
                TVpoints.setText("Очков осталось: " + pointRemains);
            }
        });

        Supply1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyCharacter.supply = 1;
                Supply1.setBackgroundColor(Color.GREEN);
                Supply2.setBackgroundColor(Color.DKGRAY);
                Supply3.setBackgroundColor(Color.DKGRAY);
            }
        });

        Supply2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyCharacter.supply = 2;
                Supply1.setBackgroundColor(Color.DKGRAY);
                Supply2.setBackgroundColor(Color.GREEN);
                Supply3.setBackgroundColor(Color.DKGRAY);
            }
        });

        Supply3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyCharacter.supply = 3;
                Supply1.setBackgroundColor(Color.DKGRAY);
                Supply2.setBackgroundColor(Color.DKGRAY);
                Supply3.setBackgroundColor(Color.GREEN);
            }
        });

        ready.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CharacterCreation.this, QuestScreen.class);
                if (pointRemains < 0) toast.show();
                else
                    startActivity(intent);
            }
        });

    }
}

