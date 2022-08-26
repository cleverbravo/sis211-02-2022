import java.util.*;
public class programa3 {
    public static void main(String[] args) {
        double a,b,c;
        System.out.println("introduzca dos numeros reales:");
        Scanner cin=new Scanner(System.in);
        a=cin.nextDouble();
        b=cin.nextDouble();
        if (b==0) {
            System.out.println("error de division por cero.");
        } else {
            c=a/b;
            System.out.println("la division de "+a+"/"+b+"="+c);
        }
    } 
}
