

import java.util.ArrayList;
import java.util.ListIterator;


public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        ListIterator itr = list.listIterator();
        while(itr.hasNext()){ 
            System.out.println(itr.next());
        }
    }
}
