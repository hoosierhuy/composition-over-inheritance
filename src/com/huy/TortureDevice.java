package com.huy;

public class TortureDevice {
    private String typeOfTortureDevice;

    public TortureDevice(String typeOfTortureDevice) {
        this.typeOfTortureDevice = typeOfTortureDevice;
    }

    public String chooseTortureDevice() {
        return this.typeOfTortureDevice;
    }

    public String getTypeOfTortureDevice() {
        return typeOfTortureDevice;
    }
}
