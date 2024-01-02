package ngoding;

public class Day86 {

    public static void main(String[] args) {

        String string = "12345.09";
        boolean numeric = true;

        try {
            Double num = Double.parseDouble(string);
        } catch (NumberFormatException e) {
            numeric = false;
        }

        if (numeric) {
            System.out.println(string + " adalah angka");
        } else {
            System.out.println(string + " adalah bukan angka");
        }
    }
}
