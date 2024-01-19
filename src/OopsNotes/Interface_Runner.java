package src.OopsNotes;

public class Interface_Runner {

    public static void main(String[] args) {
        Interface_mouse mouse = new Interface_mouse();

        Interface_Speaker speaker = new Interface_Speaker();

        mouse.connect();
        speaker.disconnect();
        mouse.pointer();
        speaker.volume();
    }
}
