import java.util.Scanner;

public class JPA102 {
    public static void main (String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Please input:");
        double kg=scn.nextDouble();
        System.out.println(kg+" Kg = "+ (kg*2.20462) + " pounds");
        scn.close();
    }
}
