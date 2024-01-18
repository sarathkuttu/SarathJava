package src.OopsNotes;

public class Car_Constructor {

    //Instance Variables

    String Name;

    String model;

    int Year;

    //Constructor

    public Car_Constructor(String carName, String carmodel, int carYear) {

        this.Name = carName;
        this.model = carmodel;
        this.Year = carYear;
    }

    //Method

    public void print() {

        System.out.println("Car Details");
        System.out.println("Car name is " + this.Name);
        System.out.println("Car model is " + this.model);
        System.out.println("Car Year is " + this.Year);
    }
}

