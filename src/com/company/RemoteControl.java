package com.company;

public class RemoteControl {

    public static final int SLOT_SIZE = 3;
    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[SLOT_SIZE];
        offCommands = new Command[SLOT_SIZE];
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot - 1] = onCommand;
        this.offCommands[slot - 1] = offCommand;
    }

    public void onButtonPushed(int slot){
        onCommands[slot - 1].execute();
    }

    public void offButtonPushed(int slot){
        offCommands[slot - 1].execute();
    }


//    private Command slot;
//    public void setCommand(Command command) {
//        this.slot = command;
//    }
//
//    public void buttonPressed() {
//        this.slot.execute();
//    }




}
