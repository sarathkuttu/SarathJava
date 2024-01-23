package src.OopsBase;

public class Animal_Method_Overriding_Runner {

    public static void main(String[] args) {

        Animal_Method_Overriding Animal = new Animal_Method_Overriding();
        Animal_Cat_Method_Overriding Cat = new Animal_Cat_Method_Overriding();

        Animal_Dog_Method_Overriding Dog = new Animal_Dog_Method_Overriding();

        Animal.Sound();
        Cat.Sound();
        Dog.Sound();

    }


}


