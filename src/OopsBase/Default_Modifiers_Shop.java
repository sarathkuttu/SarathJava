package src.OopsBase;

public class Default_Modifiers_Shop {

    String productname;

    int productprice;

    Default_Modifiers_Shop(String pname,int prodprice){

        this.productname=pname;

        this.productprice=prodprice;
    }

    void DISPLAY(){

        System.out.println("THE PRODUCT NAME IS "+this.productname);
        System.out.println("THE PRODUCT PRICE IS "+this.productprice);
    }
}




