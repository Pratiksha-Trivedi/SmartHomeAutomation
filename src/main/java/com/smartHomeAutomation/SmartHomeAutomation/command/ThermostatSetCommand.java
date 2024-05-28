package com.smartHomeAutomation.SmartHomeAutomation.command;

import com.smartHomeAutomation.SmartHomeAutomation.strategy.Thermostat;

public class ThermostatSetCommand implements DeviceCommand {
    private Thermostat thermostat;
    private int temperature;

    public ThermostatSetCommand(Thermostat thermostat, int temperature) {
        this.thermostat = thermostat;
        this.temperature = temperature;
    }

    @Override
    public void execute() {
        thermostat.setTemperature(temperature);
    }
}