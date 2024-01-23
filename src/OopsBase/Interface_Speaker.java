package src.OopsBase;

public class Interface_Speaker implements Interface_Computer{


    @Override
    public void connect() {

        System.out.println("Speaker is connected");

    }

    @Override
    public void disconnect() {

        System.out.println("Speaker is disconnected");


    }

    void volume (){

        System.out.println("Speaker volume is ON");
    }
}
