package ngoding;
import java.util.Scanner;
public class Day26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan jumlah : ");
        int n = sc.nextInt(); 

        for (int i = 0; i <= n; i++) {
            for (int j = 0 ; j <= i; j++) {
                System.out.print("*"); 
            }
            System.out.println();
        }
    }
}        
  