import java.util.*;
public class programa9 {
    public static void main(String[] args) {
        int []vector=new int[5];
        Scanner cin=new Scanner(System.in);
        int total=0;
        double promedio;
        for (int i = 0; i < vector.length; i++) {
            vector[i]=cin.nextInt();
        }
        for (int i = 0; i < vector.length; i++) {
            total=total+vector[i];
        }
        promedio=total/(double)vector.length;
        System.out.println("promedio="+promedio);
    }
}
