package ngoding;
import java.util.Scanner;
public class Day32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai,kkm;
        System.out.print("masukkan nilai : ");
        nilai = sc.nextDouble();
        kkm = 75;
        String hasil = nilai >= kkm?"tuntas":"tidak tuntas";
        System.out.println("nilai anda : "+nilai);
        System.out.println("maka hasilnya : "+ hasil);
    }
    
}
