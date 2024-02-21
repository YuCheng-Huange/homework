

public class JPA106 {
    public static void main(String[] args) {
        double x;
        x = -3.2;
        System.out.printf("f(%.1f) = %4.4f\n",x,f(x));
        x = -2.1;
        System.out.printf("f(%.1f) = %4.4f\n",x,f(x));
        x = 0;
        System.out.printf("f(%.1f) = %4.4f\n",x,f(x));
        x = 2.1;
        System.out.printf("f(%.1f) = %4.4f\n",x,f(x));

    }
    static double f(double d) {
        return (3*(Math.pow(d,3))+2*d-1);
    }
}
