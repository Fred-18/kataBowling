package org.example;

public class Frame {

    private State state;

    public Frame() {
        this.state = State.SPARE;
    }

    public State getState() {
        return state;
    }

}

