package ngoding;

public class Day92 {

    static void aritmatika(int x, int y) {
        System.out.println("Hasil penjumlahan: " + (x + y));
        System.out.println("Hasil pengurangan: " + (x - y));
        System.out.println("Hasil perkalian  : " + (x * y));
        System.out.println("Hasil pembagian  : " + (x / y));
        System.out.println("Hasil Hasiilbagi : " + (x % y));
    }

    public static void main(String[] args) {
        aritmatika(10, 12);
    }
}
