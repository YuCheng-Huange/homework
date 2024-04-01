import java.util.*;

public class JPA406 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<4;i++){
            int[] rate = {30,50,80,100};
            int hours;
            System.out.printf("停車時數 : %d小時", hours = sc.nextInt());
            System.out.println();

            int fee = parking(hours,rate);
            System.out.println("應繳費用 :"+ fee + "元整");
        }
        
        sc.close();
    }
    public static int parking(int hours, int[] rate){
        int fee = 0;
        if (hours<=2){
            fee = hours * rate[0];
        }else if(hours <= 4){
            fee = 2 * rate[0] + (hours-2)*rate[1];
        }else if (hours <= 6){
            fee = 2 * rate[0] + 2 * rate[1] + (hours - 4)*rate[2];
        }else{
            fee = 2 * rate[0] + 2 * rate[1] + 2 * rate[2] + (hours - 6) * rate[3];
        }

        return fee;
    }
}
