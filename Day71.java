package ngoding;

import java.util.Scanner;

public class Day71 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();

        System.out.print("Masukkan kata yang dicari: ");
        String kataCari = input.next();

        if (kalimat.contains(kataCari)) {
            System.out.println("Kata ditemukan dalam kalimat.");
        } else {
            System.out.println("Kata tidak ditemukan dalam kalimat.");
        }
    }
}
