package com.smartHomeAutomation.SmartHomeAutomation.command;
public class LightOnCommand implements DeviceCommand {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}