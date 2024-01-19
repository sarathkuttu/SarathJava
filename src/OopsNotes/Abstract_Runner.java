package src.OopsNotes;

public class Abstract_Runner {

    public static void main(String[] args) {

        Abstract_Mediaplayer Audio = new Abstract_Mediaplayer();

        Abstract_Videoplayer Video = new Abstract_Videoplayer();

        Audio.play();
        Video.play();
        Audio.volume();
        Video.power();
    }
}
