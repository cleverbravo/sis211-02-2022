import java.util.*;
public class programa8 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        
        System.out.print(n);
        // for(inicializador;condicion;incremento)
        do{
            if(n%2==1)
                n=3*n+1;
            else
                n=n/2;
            System.out.print(" "+n);
        }while(n!=1);
    }
}
