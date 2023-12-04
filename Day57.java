package ngoding;
import java.util.Scanner;
   
public class Day57 {
  public static void main(String args[]){
            
    Scanner input = new Scanner(System.in);
       
    System.out.print("Input Suhu Celsius: ");
    double celc = input.nextDouble();
     
    double fahr = (9.0/5.0 * celc) + 32;
     
    System.out.println(celc+" derajat Celcius = "+fahr+" derajat Fahrenheit");
  }
}