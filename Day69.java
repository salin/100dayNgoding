package ngoding;

import java.util.Scanner;

public class Day69 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a, b, n, total;
        total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        n = sc.nextInt();
        for (a = 1; a <= n; a++) {
            System.out.print("Bilangan ke" + a + "=");
            b = sc.nextInt();
            total = total + b;
        }
        System.out.println("Total bilangan inputan=" + total);
    }

}
