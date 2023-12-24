package ngoding;
public class Day77 {
public static void main(String[] args) {

    int angka = 1234, balik = 0;
    
    System.out.println("urutan awal : " + angka);


    while(angka != 0) {
    
      int digit = angka % 10;
      balik = balik * 10 + digit;

      
      angka /= 10;
    }

    System.out.println("membalik urutan angka: " + balik);
  }
}