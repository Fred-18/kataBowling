package org.example;

public class Game {

    private int rolls = 0;

    public void roll(int number) throws Exception {
        if( number < 0 || number > 10){
            throw(new Exception());
        }
        rolls+=number;
    }

    public int score(){
        return rolls;
    }
}
