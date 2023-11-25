package ngoding;

public class Day48 {
    public static void main(String[] args) {
        double mm,bhsind,bhsingg,ips,r,kkm,total;
        kkm = 75;
        mm = 90;
        bhsind = 86;
        bhsingg = 75;
        ips = 78;
        total = mm+bhsind+bhsingg+ips;
        r = total / 4;
        System.out.println(r);
        if (r>=kkm){
            System.out.println("lulus");
        }else{
            System.out.println("tidak lulus");
        }
    }
        
}
