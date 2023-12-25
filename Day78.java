package ngoding;

public class Day78 {

    public static void main(String[] args) {

        int angka = 371, angkaAsli, sisa, hasil = 0;

        angkaAsli = angka;

        while (angkaAsli != 0) {
            sisa = angkaAsli % 10;
            hasil += Math.pow(sisa, 3);
            angkaAsli /= 10;
        }

        if (hasil == angka) {
            System.out.println(angka + " adalah sebuah bilangan Armstrong.");
        } else {
            System.out.println(angka + " bukan merupakan bilangan Armstrong.");
        }
    }
}
