package ngoding;

import java.util.Scanner;

public class Day96 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String jawaban;

        do {
            System.out.print("Apakah Anda ingin melanjutkan? (ya/tidak): ");
            jawaban = scanner.next();

        } while (jawaban.equalsIgnoreCase("ya"));

        System.out.println("Perulangan berhenti");
    }
}
