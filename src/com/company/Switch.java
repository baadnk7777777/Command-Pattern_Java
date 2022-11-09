package com.company;

public class Switch {
    private Command UpCommand, DownCommand;

    public Switch(Command upCommand, Command downCommand) {
        this.UpCommand = upCommand;
        this.DownCommand = downCommand;
    }

    void flipUp() {
        this.UpCommand.execute();

    }
    void FlipDown(){
        this.DownCommand.execute();
    }
}
