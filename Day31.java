package ngoding;

public class Day31 {
    public static void main(String[] args) {      
   /*Tulislah program dengan bahasa java untuk menghitung hasil dari  3^4 !
        *Gunakan konsep perulangan untuk menyelesaikannya
    */    
    
        int angka = 3;
        for (int i = 0; i <= 3; i++) {
            angka *= 3;
        }
         System.out.println(angka);
        }   
    
}
