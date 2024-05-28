package com.smartHomeAutomation.SmartHomeAutomation.strategy;
public class EcoFriendlyStrategy implements TemperatureControl {
    @Override
    public void regulate() {
        System.out.println("Eco-friendly temperature regulation");
    }
}