package com.smartHomeAutomation.SmartHomeAutomation.strategy;
public class QuickCoolStrategy implements TemperatureControl {
    @Override
    public void regulate() {
        System.out.println("Quick cool temperature regulation");
    }
}