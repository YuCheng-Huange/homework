import java.util.*;

public class JPA305 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i<3 ; i++){
            
            
            System.out.print("please enter one value: ");
            int n = sc.nextInt();
            int total = 1;
            int j;
            if (n>=1 && n<=10){
                for(j = 1; j<=n ; j++){
                    total = total*j;
                }
                
                System.out.printf("%d! : %d",n,total);
                System.out.println("");
            }else{
                System.out.println("Error, th value is out of range.");
            }
            
        }
        sc.close();
        
           
    }
   
}
