package day22_revision_oop;

public class MobilePhone implements MusicPlayer{
    @Override
    public void playingMusic() {
        System.out.println("Mobile player plays..");
    }

    @Override
    public void pausing() {
        System.out.println("Mobile player pause..");

    }

    @Override
    public void stopping() {
        System.out.println("Mobile stops..");

    }

    @Override
    public void skippingForward() {
        System.out.println("Mobile skips forward");

    }

    @Override
    public void skippingBackward() {
        System.out.println("Mobile skips backward");

    }
}
