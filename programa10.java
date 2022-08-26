import java.util.*;
public class programa10 {
    public static void main(String[] args) {
        ArrayList<Integer> vector=new ArrayList<>();
        // System.out.println(vector.size());
        Scanner cin =new Scanner(System.in);
        for (int i = 0; i < 5; i++) {//i=i+1;
            int x=cin.nextInt();
            vector.add(x);
        }
        int total=0;
        double promedio=0;
        // for (int i = 0; i < vector.size(); i++) {
        //     total=total+vector.get(i);
        // }
        for (Integer valor: vector) {
            total+=valor;// total=total+valor;
        }
        promedio=total/(double)vector.size();
        System.out.println("promedio="+promedio);
    }
}
