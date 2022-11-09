package com.company;

public class FanRightRotateCommand implements Command {
    private Fan fan;

    public FanRightRotateCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.fan.rotate_right();
    }
}
