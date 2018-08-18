package com.huy;

public class Main {

    public static void main(String[] args) {
        Resolution iMac5KResolution = new Resolution(5120, 2880);
        Dimensions dimensions = new Dimensions(20, 26, 8);
        Case theCase = new Case("iMac Pro", "Apple", "MQ2Y2LL/A ", dimensions);

        Monitor iMacMonitor = new Monitor("Apple Retina 5K", "Apple", 27, iMac5KResolution);

        Motherboard theMotherboard = new Motherboard("MD935", "Apple", 4, 1,"10.13.6");

        // PC in this context means personal computer, it doesn't connotate Microsoft, or Windows, or Bill Gate's evil twin.
        PC iMac = new PC(theCase, iMacMonitor, theMotherboard);
        iMac.powerUp();

        // If the above example isn't enough, here's another example to reinforced the point and a bit of comedy relief.
        System.out.println("-----------------------------------------------------------------------------------");

        Equipment restraint = new Equipment("Bacon handcuffs!!!");
        TortureDevice billGatesIncessantWhinyVoice = new TortureDevice(" You will be subjected to the sound of Bill Gates' incessant whiny voice until your nose bleed!!!");
        Dungeon redRoom = new Dungeon("The Red Room.", restraint, billGatesIncessantWhinyVoice);
        // A nerd walks into a dungeon.
        redRoom.getName();
        // A nerd gets restrained.
        redRoom.applyRestrainingDevice();
        // A nerd is tortured
        redRoom.activateTortureDevice();
    }
}
