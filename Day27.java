package ngoding;
import java.util.Scanner;
public class Day27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan jari jari : ");
        double r = sc.nextDouble();
        double phi = 3.14;
        double luas = phi * r * r; //rumus luas 
        double keliling = 2 * phi * r; //rumus keliling 
        System.out.println("luas     : "+luas);
        System.out.println("keliling : "+keliling);
        
    }
}
