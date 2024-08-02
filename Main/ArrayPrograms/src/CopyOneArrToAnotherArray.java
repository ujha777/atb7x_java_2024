import java.util.ArrayList;
import java.util.List;

public class CopyOneArrToAnotherArray {
    public static void main(String[] args) {

        ArrayList<Integer> a1=new ArrayList<>();
        a1.add(1);
        a1.add(3);
        a1.add(23);
        a1.add(44);
        ArrayList<Integer> a2=a1;
        System.out.println(a2);

        ArrayList<Integer> a3=new ArrayList<>(a1);
        System.out.println(a3);

        ArrayList<Integer> a4=new ArrayList<>();
        a4.addAll(a1);
        System.out.println(a4);

        ArrayList<Integer> a5=new ArrayList<>();
        for (Integer val:a1 ){
            a5.add(val);
        }
        System.out.println(a5);
       ArrayList<Integer> a6=new ArrayList<>(List.copyOf(a1));
        System.out.println(a6);

        ArrayList<Integer> a7=new ArrayList<>(List.copyOf(a1));
        a7= (ArrayList<Integer>) a1.clone();

        System.out.println(a7);


    }
}
