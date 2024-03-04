import java.util.*;

public class JPA07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0 ; i<4 ; i++){
            System.out.print("請輸入三個整數: ");
            int a,b,c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            double x = Math.pow(a, 2);
            double y = Math.pow(b, 2);
            double z = Math.pow(c, 2);
            if ((a+b)>c && (a+c)>b && (b+c)>a)
                if ((x+y)==z || (x+z)==y || (y+z)== x)
                    System.out.println("直角三角形");
                else if ((x+y) < z || (x+z) < y || (y+z) < x)
                    System.out.println("鈍角三角形");
                else
                    System.out.println("銳角三角形");
            else
                System.out.println("不可以構成三角形");
        }
        sc.close();
    }
}
