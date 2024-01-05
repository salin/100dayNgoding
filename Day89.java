package ngoding;

public class Day89 {

    public static void main(String[] args) {

       
        String nama = "Programiz";

        System.out.println("hurup dalam  " + nama + " adalah ");

       
        for (int i = 0; i < nama.length(); i++) {

            
            char a = nama.charAt(i);
            System.out.print(a + ", ");
        }
    }
}
