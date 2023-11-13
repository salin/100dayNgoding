package ngoding;
import java.util.Scanner;
public class Day36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f1 = 0;
        int f2 = 1;
        System.out.print("Masukkan angka : ");
        int n = sc.nextInt();
        
        int fn;
        System.out.println("Deret fibonacci");
        System.out.print(f1+", ");
        System.out.print(f2);
        for (int a = 1; a < n; a++) {
            fn = f2 + f1;
            System.out.print(", "+fn);
            f1 = f2;
            f2 = fn; 
        }
        System.out.println("");
        
    }
}
