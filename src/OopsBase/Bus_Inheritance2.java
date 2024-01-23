package src.OopsBase;

public class Bus_Inheritance2 extends Bus_Inheritance {

    int Doors;

    public Bus_Inheritance2(String Bus_name, String Bus_model, int Bus_Doors) {
        super(Bus_name, Bus_model);

        this.Doors = Bus_Doors;
    }

    public void DisplayBus() {

        Display();

        System.out.println("Bus door number are " + this.Doors);
    }
}
