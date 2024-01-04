package src.Javanotes;

public class Reverse {

    public static void main(String[] args) {

        String name = "KEERTHANA";

        char[] charArray = name.toCharArray();

        int left = 0;

        int right = charArray.length - 1;

        while (left < right) {

            char temp = charArray[left];

            charArray[left] = charArray[right];

            charArray[right] = temp;
            left++;
            right--;


        }

        String reversal = new String(charArray);

        System.out.println(reversal);
    }
}
