package src.OopsBase;

public class Abstract_Videoplayer extends Abstract_Media {
    @Override
    void play() {

        System.out.println("Video Player is ON");

    }

    @Override
    void pause() {

        System.out.println("Video Player is Pause");

    }

    @Override
    void stop() {

        System.out.println("Video Player is Stopped");

    }
}
