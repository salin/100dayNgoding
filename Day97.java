package ngoding;
import java.util.Scanner;
public class Day97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan angka (1-3999): ");
        int angka = scanner.nextInt();

        if (angka < 1 || angka > 3999) {
            System.out.println("Input diluar rentang yang valid.");
        } else {
            String hasil = konversiKeRomawi(angka);
            System.out.println("Hasil konversi: " + hasil);
        }

        scanner.close();
    }

    public static String konversiKeRomawi(int angka) {
        String[] romawi = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] nilai = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

        StringBuilder hasil = new StringBuilder();

        for (int i = 12; i >= 0; i--) {
            while (angka >= nilai[i]) {
                hasil.append(romawi[i]);
                angka -= nilai[i];
            }
        }

        return hasil.toString();
    }
}
