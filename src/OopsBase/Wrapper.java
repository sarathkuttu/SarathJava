package src.OopsBase;

public class Wrapper {

        public static void main(String[] args) {

        double a = 43.22;

        //Boxing

        Double wrapperdouble = Double.valueOf(a);

        System.out.println("Primitive value is "+a);

        System.out.println("Wrapper value is "+wrapperdouble);

        //Unboxing

            double b = wrapperdouble.doubleValue();

            System.out.println("unwrapping value is "+b);

    }


}
