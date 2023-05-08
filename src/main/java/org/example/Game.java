package org.example;


public class Game {
 
    private int scores = 0;
    private Frame frames;

    
    public Game(){
        this.frames=new Frame();
    }
    
    public void roll(int number) throws Exception {
        if( number < 0 || number > 10){
            throw(new Exception());
        }
        scores +=number;
    }

    public int score(){
        return scores;
    }

    public Frame getFrames() {
        return frames;
    }

}
