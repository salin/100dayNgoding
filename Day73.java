package ngoding;
import java.util.Scanner;
public class Day73 {
  
  public static void main(String args[]){
            
    Scanner input = new Scanner(System.in);
       
     
    int tahun;
     
    System.out.print("Input tahun: ");
    tahun = input.nextInt();
     
    if (tahun % 400 == 0) {
      System.out.println(tahun + " adalah tahun kabisat");
    }
    else if (tahun % 100 == 0) {
      System.out.println(tahun + " bukan tahun kabisat");
    }
    else if (tahun % 4 == 0) {
      System.out.println(tahun + " adalah tahun kabisat");
    }
    else {
      System.out.println(tahun + " bukan tahun kabisat");
    }
        
  }
}    

