package Ders42;

import java.util.LinkedList;
import java.util.Queue;

public class Linked_listQ {
    public static void main(String[] args) {
        Queue<String>q1=new LinkedList<>();
        q1.add("h");
        q1.add("y");
        q1.offer("k");//kapasite sınırlamsı olmadığı sürece add ile aynı ,işlemi yapar.
        q1.remove();//bastakini kaldırır.
        System.out.println(q1);
        System.out.println(q1.remove());//bastakini kaldırır ve kaldırılanı döndürür.
        System.out.println(q1);
        System.out.println(q1.remove("k"));//k yı kaldırır ve kaldırınca yazdırırsak true döner.

        System.out.println(q1.poll());//Retrieves and removes the head of this queue, or returns null if this queue is empty.
        //boşken aynı işlemi remove ile yaparsak hata verir.
        System.out.println(q1);
        System.out.println("=============================================");

        q1.add("h");
        q1.add("y");
        System.out.println("baştaki eleman: "+q1.peek());//Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.

        System.out.println("bastaki eleman: "+q1.element());//Retrieves, but does not remove, the head of this queue.
        // This method differs from peek only in that it throws an exception if this queue is empty.

       q1.clear();//liste bosaltıldı
        System.out.println(q1.peek());//bos olmasına rağmen birsey kaldıramaz ama hata vermez ve null döner
        q1.element();//hata verir çünku bu method liste bosken eleman kaldıramadığı için hata verir.
        System.out.println(q1);

    }
}
