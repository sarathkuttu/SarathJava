package src.OopsBase;

public class Abstract_Mediaplayer extends Abstract_Media {


    @Override
    void play() {

        System.out.println("Media Player is ON");

    }

    @Override
    void pause() {

        System.out.println("Media Player is Paused");

    }

    @Override
    void stop() {

        System.out.println("Media Player is Stopped");

    }
}
