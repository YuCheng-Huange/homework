import java.util.Scanner;

public class JPA103 {
    public static void main(String[] arge) {
        System.out.println("Please input:");
        Scanner sc = new Scanner(System.in);
        int a,b,c;

        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.printf("Average: %4.2f", ((double)(a+b+c)/3));
        sc.close();
    }
}
