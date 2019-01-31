package com.example.quest;

public class Scene {
    int number;
    int text;
    int chose1;
    int chose2;
    int chose3;
    Integer day;

    Scene(int number, Integer day, int text, int chose1, int chose2, int chose3){
        this.number = number;
        this.text = text;
        this.chose1 = chose1;
        this.chose2 = chose2;
        this.chose3 = chose3;
        this.day = day;
    }
}
