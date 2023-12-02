package ngoding;

public class Day55 {

    public static void main(String[] args) {
        int bilangan = 25, nil = 0;
        for (int i = 1; i <= bilangan; i++) {
            if (bilangan % i == 0) {
                nil++;

            }

        }
        if (nil == 2) {
            System.out.println("bilangan " + bilangan + " adalah prima");

        } else {
            System.out.println("bilangan " + bilangan + " adalah bukan prima");
        }
    }

}
