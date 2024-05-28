package com.smartHomeAutomation.SmartHomeAutomation;

import com.smartHomeAutomation.SmartHomeAutomation.adapter.DeviceAdapter;
import com.smartHomeAutomation.SmartHomeAutomation.adapter.LightAdapter;
import com.smartHomeAutomation.SmartHomeAutomation.command.*;
import com.smartHomeAutomation.SmartHomeAutomation.decorator.BasicLight;
import com.smartHomeAutomation.SmartHomeAutomation.decorator.PowerSavingMode;
import com.smartHomeAutomation.SmartHomeAutomation.decorator.SmartDevice;
import com.smartHomeAutomation.SmartHomeAutomation.decorator.VacationMode;
import com.smartHomeAutomation.SmartHomeAutomation.strategy.EcoFriendlyStrategy;
import com.smartHomeAutomation.SmartHomeAutomation.strategy.QuickCoolStrategy;
import com.smartHomeAutomation.SmartHomeAutomation.strategy.Thermostat;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class SmartHomeAutomationSystem {
	public static void main(String[] args) {
		// Command Pattern
		Light light = new Light();
		DeviceCommand lightOnCommand = new LightOnCommand(light);
		lightOnCommand.execute();

		Thermostat thermostat = new Thermostat();
		DeviceCommand thermostatSetCommand = new ThermostatSetCommand(thermostat, 22);
		thermostatSetCommand.execute();

		DoorLock doorLock = new DoorLock();
		DeviceCommand lockDoorCommand = new LockDoorCommand(doorLock);
		lockDoorCommand.execute();

		// Decorator Pattern
		SmartDevice basicLight = new BasicLight();
		SmartDevice powerSavingLight = new PowerSavingMode(basicLight);
		powerSavingLight.operate();

		SmartDevice vacationLight = new VacationMode(basicLight);
		vacationLight.operate();

		// Strategy Pattern
		thermostat.setStrategy(new EcoFriendlyStrategy());
		thermostat.regulate();

		thermostat.setStrategy(new QuickCoolStrategy());
		thermostat.regulate();

		// Adapter Pattern
		Light lights = new Light();
		DeviceAdapter lightAdapter = new LightAdapter(lights);
		lightAdapter.turnOn();
		lightAdapter.turnOff();
	}
}
