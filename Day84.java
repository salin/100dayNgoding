package ngoding;

import java.util.concurrent.TimeUnit;

public class Day84 {

    public static void main(String[] args) {

        long ms = 1000000;

       
        long detik = TimeUnit.MILLISECONDS.toSeconds(ms);
        System.out.println(ms + " Milidetik = " + detik + " Detik");

        long minutes = TimeUnit.MILLISECONDS.toMinutes(ms);
        System.out.println(ms + " Milidetik = " + minutes + " Menit");
   }
}
