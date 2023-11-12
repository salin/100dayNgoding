package ngoding;
import java.util.Scanner;
public class Day35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan,pangkat,hasil;
        System.out.print("masukkan bilangan : ");
        bilangan = sc.nextInt();
        System.out.print("masukkan pangkat : ");
        pangkat = sc.nextInt();
        System.out.print("hasil : ");
        hasil = bilangan;
        for (int i = 1; i < pangkat; i++) {
            hasil *= bilangan;
        }
        System.out.println(hasil);
    }
}
