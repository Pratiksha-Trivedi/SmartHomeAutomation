package com.smartHomeAutomation.SmartHomeAutomation.strategy;
public class Thermostat {
    private TemperatureControl strategy;

    public void setStrategy(TemperatureControl strategy) {
        this.strategy = strategy;
    }

    public void regulate() {
        strategy.regulate();
    }

    public void setTemperature(int temperature) {
        System.out.println("Setting thermostat to " + temperature + " degrees");
    }
}
