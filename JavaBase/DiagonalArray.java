package JavaBase;

public class DiagonalArray {

    public static void main(String[] args) {

        int array[][] = new int[3][3];

        array[0][0] = 10;
        array[0][1] = 122;
        array[0][2] = 15;
        array[1][0] = 9;
        array[1][1] = 2;
        array[1][2] = 115;
        array[2][0] = 110;
        array[2][1] = 22;
        array[2][2] = 5;

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i][i]);

        }
    }
}
