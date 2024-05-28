package com.smartHomeAutomation.SmartHomeAutomation.decorator;

public class VacationMode extends DeviceDecorator {
    public VacationMode(SmartDevice decoratedDevice) {
        super(decoratedDevice);
    }

    @Override
    public void operate() {
        System.out.println("Vacation mode activated");
        decoratedDevice.operate();
    }
}