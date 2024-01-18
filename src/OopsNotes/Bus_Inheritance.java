package src.OopsNotes;

public class Bus_Inheritance {

    String Name;

    String Model;


    public Bus_Inheritance(String Bus_name, String Bus_model) {

        this.Name = Bus_name;
        this.Model = Bus_model;


    }

    public void Display() {

        System.out.println("BUS INFO");
        System.out.println("Bus name is " + this.Name);
        System.out.println("Bus model is " + this.Model);

    }

}
