package ngoding;

public class Day76 {

    public static void main(String[] args) {

        int count = 0, num = 07556;

        while (num != 0) {
            // num = num/10
            num /= 10;
            ++count;
        }

        System.out.println("digit angka di belakang nol: " + count);
    }
}
