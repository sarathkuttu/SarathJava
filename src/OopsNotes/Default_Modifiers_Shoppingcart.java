package src.OopsNotes;

public class Default_Modifiers_Shoppingcart {

    public static void main(String[] args) {

        Default_Modifiers_Shop cart = new Default_Modifiers_Shop("Laptop", 50000);

        Default_Modifiers_Shop cart2 = new Default_Modifiers_Shop("Fridge", 2000);

        cart.DISPLAY();
        cart2.DISPLAY();
    }
}
