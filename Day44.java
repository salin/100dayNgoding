package ngoding;

import java.util.Scanner;

public class Day44 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nilai n : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        
        int t = 0;
        for (int i = 0; i < n ; i++) {
            System.out.print("masukkan nilai ke - ["+i+"] : ");
            int nilai = sc.nextInt();
            t += nilai;
            
        }
        System.out.println("jumlahnya bila engan positif "+t);
    }

}
