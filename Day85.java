package ngoding;

import java.util.Random;

public class Day85 {

    public static void main(String[] args) {

        // create a string of all characters
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // create random string builder
        StringBuilder sb = new StringBuilder();

        // create an object of Random class
        Random random = new Random();

        // specify length of random string
        int length = 7;

        for (int i = 0; i < length; i++) {

    
            int index = random.nextInt(alphabet.length());

            
            
            char Characak = alphabet.charAt(index);

            
            sb.append(Characak);
        }

        String Stringacak = sb.toString();
        System.out.println("String Acak Adalah : " + Stringacak);

    }
}
