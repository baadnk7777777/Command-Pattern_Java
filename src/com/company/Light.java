package com.company;

public class Light {

    private final String Color;

    public Light(String color) {
        this.Color = color;
    }

    void turnOn() {
        System.out.println(this.Color + " Light is On.");
    }

    void turnOff() {
        System.out.println(this.Color + " Light is Off.");
    }
}
