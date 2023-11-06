package ngoding;

import java.util.Scanner;

public class Day29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan harga : ");
        double harga, diskon, m, total;
        harga = sc.nextDouble();
        diskon = 10;//nilai diskon
        m = harga * diskon / 100;//rurmus diskon 
        total = harga - m;
        System.out.println("total " + total);
    }

}
