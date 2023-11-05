package day22_revision_oop;

public class MusicRunner {
    public static void main(String[] args) {
        Mp3Player   device2 = new Mp3Player();
        device2.playingMusic();
        device2.pausing();

        MobilePhone device1 = new MobilePhone();
        device1.playingMusic();
        device1.skippingBackward();
        device1.skippingForward();



    }
}
