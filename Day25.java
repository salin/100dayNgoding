package ngoding;

import java.util.Scanner;

public class Day25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan alas : ");
        int alas = sc.nextInt();

        System.out.print("masukkan tinggi ");
        int tinggi = sc.nextInt();

        int hasil = alas * tinggi;
        int hasil2 = hasil * 1 / 2;

        System.out.println("maka hasilnya " + hasil2);
    }
}
