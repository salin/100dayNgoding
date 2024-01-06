package ngoding;

public class Day90 {

    double tinggi = 20;
    double berat = 4;

    int umur;

    public Day90(int umur) {
        this.umur = umur;
    }

    void lari() {
        System.out.println("berlari dengan cepat ");
    }

    void jalan() {
        System.out.println("berjalan sambil melompat");
    }

    int getUmur() {
        return umur;
    }

    double getBerat() {
        return berat;
    }

    double getTinggi() {
        return tinggi;
    }
    public static void main(String[] args) {
        Day90 kelinci = new Day90(2);
        kelinci.jalan();
        kelinci.lari();
        System.out.println("berat : "+kelinci.getBerat());
        System.out.println("tinggi :"+kelinci.getTinggi());
        System.out.println("umur : "+kelinci.getUmur()+" tahun");
    }
}
