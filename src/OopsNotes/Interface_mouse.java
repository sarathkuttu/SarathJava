package src.OopsNotes;

public class Interface_mouse implements Interface_Computer{
    @Override
    public void connect() {

        System.out.println("Mouse connected");

    }

    @Override
    public void disconnect() {

        System.out.println("Mouse Disconnected");

    }

    void pointer(){

        System.out.println("Mouse pointer is working");
    }
}
