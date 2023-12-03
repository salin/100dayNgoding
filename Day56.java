package ngoding;

public class Day56  {

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
        
        for (int i = 0; i < 30; i++) {
            int angk=0;
            for (int j = 1; j <=i; j++) {
                if (i%j==0) {
                    angk++;
                    
                }
                
            }
            if (angk==2) {
                System.out.println(i+" ");
                
            }
            
        }
    }

}
