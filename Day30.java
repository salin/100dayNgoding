package ngoding;
import java.util.Scanner;
public class Day30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double harga,diskon,n,total;
        System.out.print("Masukkan Harga : ");
        harga = sc.nextDouble();
        if(harga > 500000 && harga < 1000000){
            diskon = 5;
            n = harga * (diskon/100);
            total = harga - n;
            System.out.println("Anda mendapatkan diskon 5%");
            System.out.println("total harga : "+total);
        }else if (harga > 1000000 && harga < 2000000 ){
            diskon = 10;
            n = harga * (diskon/100);
            total = harga - n;
            System.out.println("Anda mendapatkan diskon 10%");
            System.out.println("total harga : "+total);
        }else{
            System.out.println("tidak dapat diskon");
        }
    }
    
}
