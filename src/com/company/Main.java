package com.company;

public class Main {

    public static void main(String[] args) {

        RemoteControl remoteController = new RemoteControl();

        Light light_1 = new Light("Red");
        Light light_2 = new Light("Blue");

        Fan fan_1 = new Fan("Black");

        LightOnCommand light_1_On = new LightOnCommand(light_1);
        LightOffCommand light_1_Off = new LightOffCommand(light_1);

        LightOnCommand light_2_On = new LightOnCommand(light_2);
        LightOffCommand light_2_Off = new LightOffCommand(light_2);

        FanLeftRotateCommand fan_1_left = new FanLeftRotateCommand(fan_1);
        FanRightRotateCommand fan_1_right = new FanRightRotateCommand(fan_1);

        remoteController.setCommand(1, light_1_On, light_1_Off);
        remoteController.setCommand(2, light_2_On, light_2_Off);

        remoteController.setCommand(3, fan_1_left, fan_1_right);

        remoteController.onButtonPushed(1);
        remoteController.offButtonPushed(1);

        remoteController.onButtonPushed(2);
        remoteController.offButtonPushed(2);

        remoteController.onButtonPushed(3);
        remoteController.offButtonPushed(3);
//
//        RemoteControl remoteControl_1 = new RemoteControl();
//        Light light1 = new Light("Red");
//        LightOnCommand lightoncommand = new LightOnCommand(light1);
//        remoteControl_1.setCommand(lightoncommand);
//
//        remoteControl_1.buttonPressed();

//        testSwitch.flipUp();
//        testSwitch.FlipDown();






    }
}
