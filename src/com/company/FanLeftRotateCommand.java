package com.company;

public class FanLeftRotateCommand implements Command{
    private Fan fan;

    public FanLeftRotateCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.fan.rotote_left();
    }
}
