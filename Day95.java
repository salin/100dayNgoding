package ngoding;

public class Day95 {

    static boolean cekGenap(int angka) {
        return angka % 2 == 0;
    }

    static int pangkatDua(int angka) {
        return angka * angka;
    }

    public static void main(String[] args) {
        boolean hasilCek = cekGenap(6);
        System.out.println("Apakah angka genap? " + hasilCek);

        int hasilPangkat = pangkatDua(4);
        System.out.println("Hasil pangkat dua: " + hasilPangkat);
    }
}
