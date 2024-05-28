package com.smartHomeAutomation.SmartHomeAutomation.command;

public class LockDoorCommand implements DeviceCommand {
    private DoorLock doorLock;

    public LockDoorCommand(DoorLock doorLock) {
        this.doorLock = doorLock;
    }

    @Override
    public void execute() {
        doorLock.lock();
    }
}