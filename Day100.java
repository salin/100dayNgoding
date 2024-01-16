package ngoding;

import java.util.Scanner;
public class Day100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah menit ngoding per hari: ");
        int menitPerHari = scanner.nextInt();

        int jumlahHari = 100;
        int totalMenitNgoding = menitPerHari * jumlahHari;

        int jam = totalMenitNgoding / 60;  // 1 jam = 60 menit
        int sisaMenit = totalMenitNgoding % 60;
        int detik = sisaMenit * 60;  // 1 menit = 60 detik

        System.out.println(jumlahHari + " hari.");
        System.out.println("Total waktu ngoding: " + jam + " jam, " +totalMenitNgoding+"menit : "+ detik + " detik");
    }
}
