import java.util.Scanner;

public class JPA104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1,x2,y1,y2;

        System.out.print("輸入第1組的x和y座標:");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();

        System.out.print("輸入第2組的x和y座標:");

        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        System.out.printf("介於(%4.2f,%4.2f)和(%4.2f,%4.2f)之間的距離是%4.2f", x1,y1,x2,y2,(Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2), 2))));
        sc.close();

    }
}
