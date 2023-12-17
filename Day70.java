package ngoding;

import java.util.Scanner;

public class Day70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b,hasil;
        System.out.print("masukkan nilai : ");
        a = sc.nextFloat();
        System.out.print("Operator : ");
        String op = sc.next();
        System.out.print("masukkan nilai : ");
        b = sc.nextFloat();
        
        switch(op){
            case"+":
                hasil = a + b;
                System.out.println("Hasil = "+hasil);
                break;
            case"-":
                hasil = a - b;
                System.out.println("Hasil = "+hasil);
                break;
            case"*":
                hasil = a * b;
                System.out.println("Hasil = "+hasil);
                break;
            case"/":
                hasil = a / b;
                System.out.println("Hasil = "+hasil);
                break;
            default:
                System.out.print("operator"+op+"tidak ditemukan");
        }
    }
    
}
