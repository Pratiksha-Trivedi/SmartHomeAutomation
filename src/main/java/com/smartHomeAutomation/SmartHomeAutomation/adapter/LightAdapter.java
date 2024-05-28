package com.smartHomeAutomation.SmartHomeAutomation.adapter;

import com.smartHomeAutomation.SmartHomeAutomation.command.Light;

public class LightAdapter implements DeviceAdapter {
    private Light light;

    public LightAdapter(Light light) {
        this.light = light;
    }

    @Override
    public void turnOn() {
        light.on();
    }

    @Override
    public void turnOff() {
        light.off();
    }
}