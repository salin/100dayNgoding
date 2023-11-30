package ngoding;

import java.util.Scanner;

public class Day53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan jumlah siswa : ");
        int juml = sc.nextInt();
        int [] r = new int[juml];
        for (int i = 0; i < juml; i++) {
            System.out.print("masukkan nilai : ");
            r[i]=sc.nextInt();
        }
        System.out.print("{");
        for (int i = 0; i < juml; i++) {
            if (i>0) {
                System.out.print(",");
                
            }
            System.out.print(r[i]);
        }
        System.out.println("}");
    }
    
}
