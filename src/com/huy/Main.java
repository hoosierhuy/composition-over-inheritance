package com.huy;

public class Main {

    public static void main(String[] args) {
        Resolution iMac5KResolution = new Resolution(5120, 2880);
        Dimensions dimensions = new Dimensions(20, 26, 8);
        Case theCase = new Case("iMac Pro", "Apple", "MQ2Y2LL/A ", dimensions);

        Monitor iMacMonitor = new Monitor("Apple Retina 5K", "Apple", 27, iMac5KResolution);

        Motherboard theMotherboard = new Motherboard("BJ-200", "Apple", 4, 1,"10.13.6");

        PC iMac = new PC(theCase, iMacMonitor, theMotherboard);
        iMac.getMonitor().drawPixelAt(2000, 1800, "blue");
        iMac.getMotherboard().loadProgram("High Sierra");
        iMac.getTheCase().pressPowerButton();
    }
}
