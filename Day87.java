package ngoding;
public class Day87 {
public static void main(String[] args) {

    StringBuffer str = new StringBuffer();

    str.append("Java");
    str.append(" is");
    str.append(" popular.");
    System.out.println("StringBuffer: " + str);
    str.delete(0, str.length());
    System.out.println("Update stringbuffer: "+str);
}
    
}
