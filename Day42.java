package ngoding;

import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nilai : ");
        int angka = sc.nextInt();
        int a = 0;
        int b = 0;
        for (int i = 1; i <= angka; i++) {
            if (i % 2==0) {
                a++;
            }else{
                b++;
            }
            System.out.println(i);   
        }
        System.out.println("jumlah nilai ganjil adalah "+b);
        
        System.out.println("jadi jumlah angka genap adalah "+a);
    }
    
}
