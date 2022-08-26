import java.util.*;
public class programa6 {
    public static void main(String[] args) {
        // 1. input n
        // 2. print n
        // 3. if n = 1 then STOP
        //      4. if n is odd then n = 3n + 1
        //      5. else n = n / 2
        // 6. GOTO 2 
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        
        System.out.print(n);
        // for(inicializador;condicion;incremento) 
        for(;n!=1;){
            if(n%2==1)
                n=3*n+1;
            else
                n=n/2;
            System.out.print(" "+n);
        }
    }
}
