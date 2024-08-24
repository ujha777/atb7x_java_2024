package LinkedListDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List ll=new LinkedList();
        ll.add("Amit");
        ll.add("Raj");
        ll.add("Guru");
        ll.add("Bhagat");

        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i));
        }

        Iterator itr=ll.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        for (Object s:ll){
            System.out.println(s);
        }
    }
}
