package ngoding;

public class Day82 {
  public static void main(String[] args) {

    String[] kata = { "Ruby", "C", "Python", "Java" };

    for(int i = 0; i < 3; ++i) {
      for (int j = i + 1; j < 4; ++j) {
          
        if (kata[i].compareTo(kata[j]) > 0) {

          String temp = kata[i];
          kata[i] = kata[j];
          kata[j] = temp;
        }
      }
    }

    System.out.println("Dalam urutan :");
    
    for(int i = 0; i < 4; i++) {
      System.out.println(kata[i]);
    }
  }
}
   
