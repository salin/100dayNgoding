package ngoding;

import java.util.Scanner;

public class Day41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nilai : ");
        int angka = sc.nextInt();
        int a = 0;
        for (int i = 1; i <= angka; i++) {
            if (i % 2==0) {
                a++;
            }
            System.out.println(i);
            
        }
        System.out.println("jadi jumlah angka genap adalah "+a);
    }
    
}
