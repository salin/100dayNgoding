package ngoding;
import java.util.Scanner;
public class Day34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah,nilai,max = 0 ,min=100;
        System.out.print("masukkan jumlah nilai : ");
        jumlah = sc.nextInt();
        for (int i = 1; i <= jumlah; i++) {
            System.out.print("angka ke : "+i+" = ");
            nilai = sc.nextInt();
            if(nilai > max){
                max = nilai;
            }
            else if (nilai < min){
                min = nilai;
            }
            
        }
        System.out.println("nilai max : "+max);
        System.out.println("nilai min : "+min);
    }
}
