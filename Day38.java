package ngoding;
import java.util.Scanner;
public class Day38 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        String[] a ={
            "tahu",
            "tempe",
            "kecap"
        };
        String cari;
        for (int i = 0; i < a.length; i++) {
            System.out.println((i+1)+", "+a[i]);
        }
        System.out.print("cari : ");
        cari = masuk.nextLine();
        for (int i = 0; i < a.length; i++) {
            if(cari.equalsIgnoreCase(a[i])){
                System.out.println("nomor "+(i+1));
            }
            
        }
    }
}
