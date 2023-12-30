package src.Javanotes;

public class Array2D {

    public static void main(String[] args) {

        int a[][] = new int[3][3];

        a[0][0] = 29;
        a[0][1] = 9;
        a[0][2] = 33;
        a[1][0] = 32;
        a[1][1] = 99;
        a[1][2] = 13;
        a[2][0] = 45;
        a[2][1] = 66;
        a[2][2] = 19;

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {

                System.out.print(a[i][j] + "\t");

            }

            System.out.println("");

        }


    }
}
