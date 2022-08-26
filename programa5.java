import java.util.*;

public class programa5 {
    public static void main(String[] args) {
        System.out.println("Introduzca un numero:");
        Scanner cin=new Scanner(System.in);
        int x=cin.nextInt();
        System.out.println("con for");
        for (int i = 0; i < x; i++) {
            System.out.println(i+1);    
        }
        int i=0;
        System.out.println("con while");
        while(i<x){
            System.out.println(i+1);
            i=i+1;
        }
        i=0;
        System.out.println("con do-while");
        do{
            System.out.println(i+1);
            i=i+1;
        }while(i<x);
    }
}