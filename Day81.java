package ngoding;

public class Day81 {

    public static void main(String[] args) {

        String str = "Java Coding.";

        char ch = 'a';

        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {

            if (ch == str.charAt(i)) {

                ++frequency;
            }
        }
        System.out.println("Frekuensi karakter " + ch + " = " + frequency);
    }
}
