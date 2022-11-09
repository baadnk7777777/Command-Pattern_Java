package com.company;

public class Fan {
    private final String fanColor;

    public Fan(String fanColor) {
        this.fanColor = fanColor;
    }

    void rotote_left() {
        System.out.println(this.fanColor + " Fan is Rotate Left.");
    }

    void rotate_right() {
        System.out.println(this.fanColor + " Fan is Rotate Right.");
    }
}
