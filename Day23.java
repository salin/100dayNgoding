package ngoding;

import java.util.Scanner;

public class Day23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int nilai = sc.nextInt();

        if (nilai % 2 == 0) {
            System.out.println("nilai ketika di tambah 2");
            for (int i = 0; i <= nilai; i += 2) {
                System.out.println(i);
            }
            System.out.println(nilai + " adalah angka genap.");
        } else {
            System.out.println("nilai ketika di tambah 1");
            for (int i = 1; i <= nilai; i++) {
                System.out.println(i);
            }
            System.out.println(nilai + " adalah angka ganjil.");
        }
    }
}
