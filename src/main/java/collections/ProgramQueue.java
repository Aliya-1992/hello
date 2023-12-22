package collections;

import java.util.LinkedList;
import java.util.Queue;

public class ProgramQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        System.out.println(queue);
        queue.add("dog");
        queue.add("cat");
        System.out.println(queue.element()); //будет выведен первый элемент
        queue.offer("lion"); //будет выведен последний элемент
        System.out.println(queue);
        queue.peek(); //будет выведен первый элемент
        queue.poll(); //удаляется первый элемент
    }
}
