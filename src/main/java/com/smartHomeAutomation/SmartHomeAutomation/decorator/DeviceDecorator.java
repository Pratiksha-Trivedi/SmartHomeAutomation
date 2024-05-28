package com.smartHomeAutomation.SmartHomeAutomation.decorator;
public abstract class DeviceDecorator extends SmartDevice {
    protected SmartDevice decoratedDevice;

    public DeviceDecorator(SmartDevice decoratedDevice) {
        this.decoratedDevice = decoratedDevice;
    }

    @Override
    public void operate() {
        decoratedDevice.operate();
    }
}
