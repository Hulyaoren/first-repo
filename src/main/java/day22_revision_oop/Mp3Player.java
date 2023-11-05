package day22_revision_oop;

public class Mp3Player implements MusicPlayer{
    @Override
    public void playingMusic() {
        System.out.println("Mp3 player plays..");
    }

    @Override
    public void pausing() {
        System.out.println("Mp3 player pause..");
    }

    @Override
    public void stopping() {
        System.out.println("Mp3 stops..");
    }

    @Override
    public void skippingForward() {
        System.out.println("Mp3 skips forward");
    }

    @Override
    public void skippingBackward() {
        System.out.println("Mp3 skips backward");
    }
}
