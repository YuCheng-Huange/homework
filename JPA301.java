import java.util.*;

public class JPA301 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int total = 0;
        System.out.println("Input:");
        int criteria = scn.nextInt();
        for (int i = 0; i < criteria + 1; i++) {
            total += i;
        }
        System.out.println("1 + ... + " + criteria + " = " + total);
        scn.close();
    }
}
