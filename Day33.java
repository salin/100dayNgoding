package ngoding;

import java.util.Scanner;

public class Day33 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama penumpang : ");
        String nama;
        int tiket,pertiket,total;
        double p,pajak,hasil;
        nama = sc.nextLine();
        System.out.println("nama penumpang : "+nama);
        pertiket = 180000;
        p = 0.11;
        System.out.print("masukkan jumlah tiket : ");
        tiket = sc.nextInt();
        total = tiket * pertiket;
        pajak = total * p ;
        hasil = pajak + total;
        System.out.println("jumlah tiket : "+tiket);
        System.out.println("total bayar : "+total);
        System.out.println("dikenakan pajak 11% "+pajak);
        System.out.println("pajak yang dikenakan penumpang 11% "+hasil); 
    }
    
}
