package ngoding;

public class Day79 {

    public static void main(String[] args) {
        byte[] umur = {32, 45, 14, 76, 17, 53, 19, 33};
        byte maks = umur [0];
        byte min = umur [0];
        for (int i = 0; i < umur.length; i++) {
            if (umur[i]>maks) {
                maks = umur[i];
            }
            else if (umur[i]<min) {
                min = umur[i];
            }
        }
        System.out.println(maks);
        System.out.println(min);
    }
}
