package ngoding;

import java.util.Scanner;

public class Day68 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = scanner.nextInt();
        
      int faktorial = 1;
      int i = 1;
        while (i <= n) {
            faktorial *= i;
            i++;
        }
        System.out.print( "hasil dari " + n + "! adalah " + faktorial);
        System.out.println("");
    }
    
    
}
