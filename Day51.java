package ngoding;

import java.util.Scanner;

public class Day51 {
    public static void main(String[] args) {
        int a = 0;
        while(true){
            a++;
            if(a == 10 ){
                break;
            }else if (a == 5){
                continue;
            }else if (a == 7){
                return;
            }
            System.out.println(a);
        }
    }
    
}