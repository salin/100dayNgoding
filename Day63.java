package ngoding;
public class Day63 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int indexhapus = 2;

        int[] newArray = new int[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != indexhapus) {
                newArray[j++] = array[i];
            }
        }
        for (int value : newArray) {
            System.out.print(value + " ");
        }
        System.out.println(" ");
    }
}
