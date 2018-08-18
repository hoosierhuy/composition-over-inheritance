package com.huy;

public class Dungeon {
    private String name;
    private Equipment restrainingDevice;
    private TortureDevice tortureDevice;

    public Dungeon(String name, Equipment restrainingDevice, TortureDevice tortureDevice) {
        this.name = name;
        this.restrainingDevice = restrainingDevice;
        this.tortureDevice = tortureDevice;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public void applyRestrainingDevice() {
        System.out.println("Applying " + restrainingDevice.chooseRestraint());
    }

    public void activateTortureDevice() {
        System.out.println("Commence torture: " + tortureDevice.chooseTortureDevice());
    }
}
