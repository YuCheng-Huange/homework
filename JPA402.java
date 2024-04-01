import java.util.*;

public class JPA402 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("請輸入學生人數 : ");
        int num = sc.nextInt();

        double[] scores = new double[num];

        for(int i = 0 ; i<num ; i++){
            System.out.print("請輸入第"+(i+1)+"位學生的成績:");
            scores[i] = sc.nextDouble();

        }

        double total = 0;
        for(double score : scores){
            total += score;
        }
        double average = (total/num);

        System.out.println("人數: "+ num);
        System.out.println("總分:"+ total);
        System.out.println("平均:"+ average);
        sc.close();
    }
    
}