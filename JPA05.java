import java.util.*;

public class JPA05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0 ; i < 4 ; i++){
            System.out.println("Enter an integer: ");
            int n1 = sc.nextInt();
            if (n1 % 2 == 0 && n1 % 3 == 0 && n1 % 6 == 0){
                System.out.println(n1 + "是2,3,6的倍數")    ;
            }else if (n1 % 2 == 0 ){
                System.out.print(n1 + "是2的倍數");
            }else if (n1 % 3 == 0){
                System.out.print(n1 + "是3的倍數");
            }else if (n1 % 6 == 0){
                System.out.print(n1 + "是6的倍數");
            }else{
                System.out.print(n1 + "不是2,3,6的倍數");
            }
                
        }
        System.out.println("");
        sc.close();
    }
}
