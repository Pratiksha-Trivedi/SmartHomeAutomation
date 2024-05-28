package com.smartHomeAutomation.SmartHomeAutomation.decorator;
public class BasicLight extends SmartDevice {
    @Override
    public void operate() {
        System.out.println("Light is operating");
    }

    public void on() {
        System.out.println("Light is on");
    }

    public void off() {
        System.out.println("Light is off");
    }
}