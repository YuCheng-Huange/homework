import java.util.Scanner;

public class JPA105 {
    public static void main(String[] args) {
        System.out.print("請輸入您的名字");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.printf("Hi, %s,請輸入您的銅板的個數:\n",name);
        System.out.print("請輸入1元的數量:");
        int n1 = sc.nextInt();
        System.out.print("請輸入5元的數量:");
        int n5 = sc.nextInt();
        System.out.print("請輸入10元的數量:");
        int n10 = sc.nextInt();
        System.out.print("請輸入50元的數量:");
        int n50 = sc.nextInt();

        int sum,G1,G2,G3,G4;

        sum = n1*1+ n5*5+ n10*10 +n50*50;
        G1 = sum/1000;
        G2 = (sum/100)%10;
        G3 = (sum/10)%10;
        G4 = sum%10;
        System.out.printf("您的錢總共有: %d 千 %d 百 %d 十 %d 元",G1,G2,G3,G4);
        sc.close();
    }
}
