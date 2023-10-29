package ngoding;

import java.util.Scanner;

public class Day21 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("masukkan angka : ");
        double d1 = userInput.nextDouble();
        System.out.println("Ceiling  =" + Math.ceil(d1));
        System.out.print("masukkan angka : ");
        double d2 = userInput.nextDouble();
        System.out.print("Floor  =" + Math.floor(d2));
    }

}
