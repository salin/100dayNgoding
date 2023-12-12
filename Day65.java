package ngoding;

import java.util.Arrays;
public class Day65 {
    public static void main(String[] args) {
        // Inisialisasi array
        int[] array = {1, 2, 3, 4, 5};
        System.out.print("sebelum di tambah : "+"[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
            
        }
        System.out.print("]");
        System.out.println(" ");

        // Menambahkan elemen baru (misalnya, 6) ke dalam array
        int newValue = 6;

        // Membuat array baru dengan ukuran lebih besar
        int[] newArray = new int[array.length + 1];

        // Menyalin elemen-elemen array lama ke array baru
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        // Menambahkan elemen baru ke akhir array baru
        newArray[newArray.length - 1] = newValue;

        // Menampilkan isi array baru
        System.out.println("Isi array baru: " + Arrays.toString(newArray));
    }
}
    