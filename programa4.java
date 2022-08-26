import java.util.*;
public class programa4 {
    public static void main(String[] args) {
        double a,b,c;
        char operacion;
        Scanner cin=new Scanner(System.in);
        System.out.println("introduzca una operacion aritmetica (+,-,*,/) separados por espacios");
        a=cin.nextDouble();
        operacion=cin.next().charAt(0);
        b=cin.nextDouble();
        switch (operacion) {
            case '+':
                System.out.println("suma="+(a+b));     
                break;
            case '-':
                System.out.println("resta="+(a-b));
                break;
            case '*':
                System.out.println("multiplicacion="+(a*b));
                break;
            case '/':
                System.out.println("division="+(a/b)); 
                break;
            default:
                break;
        }

    }    
}
