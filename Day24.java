package ngoding;

import java.util.Scanner;

public class Day24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nilai : ");
        double nilai = sc.nextDouble();
        System.out.println("nilai sebelumnya : " + nilai);
        int hasil = (int) nilai;
        System.out.println("setelah di konversi : " + hasil);
    }
}
