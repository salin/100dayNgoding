package ngoding;

public class Day98 {

    double panjang;
    double lebar;

    public Day98(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    double hitungLuas() {
        return panjang * lebar;
    }

    double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    public static void main(String[] args) {
        Day98 persegiPanjang = new Day98(5, 8);
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.hitungLuas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.hitungKeliling());
    }
}
