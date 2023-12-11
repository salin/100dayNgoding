package ngoding;

public class Day64 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        int pengganti = 2;
        int Value = 10;
        array[pengganti] = Value;

        for (int value1 : array) {
            System.out.print(value1 + " ");
        }
        System.out.println("");
    }
}
