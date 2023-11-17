package ngoding;
public class Day40 {
    public static void main(String[] args) {
        int angka = 5;
        int hasil = angka;
        for (int i = angka; i > 0 ; i--) {
            System.out.print(i);
            if(i>1){
                System.out.print(" * ");
            }
            if(angka != i){
                hasil *= i;
            }
        }
        System.out.println("");
        System.out.println("hasil : "+hasil);
    }
}        
  