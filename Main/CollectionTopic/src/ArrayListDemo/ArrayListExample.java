package ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List al=new ArrayList<>();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i)+" ");
        }
        System.out.println(al.size());
        System.out.println(al.isEmpty());
        System.out.println(al.contains("A"));
        System.out.println(al.contains("F"));
        System.out.println(al.remove(2));
        System.out.println(al.set(2,"G"));
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i)+" ");
        }




        System.out.println("---------------------");

        List al1=new ArrayList<>();
        al1.add("Apple");
        al1.add("Banana");
        al1.add("Cat");
        al1.add("Dog");

     for (Object item:al1){
         System.out.println(item+" ");
     }

        Iterator it=al1.iterator();
          while (it.hasNext()){
         System.out.println(it.next());
     }

    }
}
