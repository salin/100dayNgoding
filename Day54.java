package ngoding;

import java.util.Scanner;

public class Day54 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan jumlah input : ");
        int juml = sc.nextInt();
        int[] array = new int[juml];
        for (int i = 0; i < juml; i++) {
            array[i] = sc.nextInt();

        }
        for (int i = 0; i < juml; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("genap");

            } else {
                System.out.println("ganjil");
            } 
        }

    }

}
