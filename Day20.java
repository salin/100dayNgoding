package ngoding;

import java.util.Scanner;

class Day20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan gaji : ");
        int gaji = input.nextInt();
        System.out.println("gaji anda perbulan :" + gaji);
        if (gaji == 3000000 ) {
            System.out.println("pajak 5%");
            double pajak = gaji * 0.05;
            double hasil = pajak + gaji;
            int hasilInt = (int) hasil;
            System.out.println("maka gaji bersih anda : "+hasilInt);
        } else if (gaji >= 5000000) {
            System.out.println("Anda Kinekan pajak 10%");
            double pajak = gaji * 0.1;
            double hasil = pajak + gaji;
            int hasilInt = (int) hasil;
            System.out.println("maka gaji bersih anda : "+hasilInt);
        }else{
            System.out.println("tidak dikenakan pajak");
        }
    }

}
