package Ders43;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_list {
    public static void main(String[] args) {

        Deque<String> dq1=new LinkedList<>();
        dq1.add("a");
        dq1.add("b");//normal peşpeşe ekler.

        dq1.addLast("f");//sona ekler

        dq1.addFirst("c");//başa ekler

        System.out.println(dq1.getFirst());//baştakini getirir
        System.out.println(dq1.getLast());//sondakini getirir

        System.out.println(dq1.remove());//birincisini siler ve onu döndürür queue de olduğu gibi
        System.out.println(dq1.poll());//baştakini siler ve onu döndürür.
        System.out.println(dq1.remove());
        System.out.println(dq1.remove());
        //dq1.remove();//hata verir
        dq1.poll();//null döndürür hata vermez.

        System.out.println("=======================================");

        dq1.add("K");
        dq1.add("B");

        dq1.push("F");//This method is equivalent to addFirst.
        System.out.println(dq1);

        System.out.println(dq1.pop());//This method is equivalent to removeFirst().//ilk elementi siler ve döndürür.

        dq1.element();//This method is equivalent to getFirst().ilk elementi silmeden getirir

        System.out.println(dq1.peek());;//Retrieves, but does not remove, the head of the queue represented by this deque (in other words,
        // the first element of this deque), or returns null if this deque is empty.

        System.out.println(dq1.peekFirst());//Retrieves, but does not remove,
        // the first element of this deque, or returns null if this deque is empty.
        System.out.println(dq1.peekLast());//Retrieves, but does not remove, the last element of this deque,
        // or returns null if this deque is empty.


        System.out.println(dq1);
    }
}
