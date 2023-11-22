package ngoding;
import java.util.Scanner;

public class Day45 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("pilih 1/2 : ");
        int pilih = sc.nextInt();
        switch(pilih){
            case 1:
                System.out.println("Laki laki");
                break;
            case 2:
                System.out.println("perempuan");
                break;
            default:
                System.out.print("pilihan salah");
                break;
        }
    }
}
