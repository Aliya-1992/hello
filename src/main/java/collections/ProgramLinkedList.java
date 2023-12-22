package collections;

import java.util.LinkedList;

public class ProgramLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("Жираф");
        linkedList.add("нот");
        linkedList.add("петух");
        linkedList.addFirst("Волк");
        linkedList.addLast("Лиса");
        linkedList.add(2, "Лягушка");
        linkedList.remove();
        System.out.println(linkedList);
        linkedList.remove(2);
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.peekLast()); //выводит последний элемент
        System.out.println(linkedList.pollLast());
    }

}
