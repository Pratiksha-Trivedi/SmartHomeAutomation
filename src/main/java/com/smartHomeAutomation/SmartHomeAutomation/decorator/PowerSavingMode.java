package com.smartHomeAutomation.SmartHomeAutomation.decorator;

public class PowerSavingMode extends DeviceDecorator {
    public PowerSavingMode(SmartDevice decoratedDevice) {
        super(decoratedDevice);
    }

    @Override
    public void operate() {
        System.out.println("Power-saving mode activated");
        decoratedDevice.operate();
    }
}