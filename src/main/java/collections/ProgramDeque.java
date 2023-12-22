package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ProgramDeque {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        System.out.println(deque);
        deque.add("cow");
        deque.add("froggy");
        deque.addFirst("monkey"); //этот метод позволяет добавить какой-либо элекмент в начало колеекуции
        deque.push("puppy"); //этот метод позволяет добавить какой-либо элекмент в начало колеекуции
        deque.addLast("elephant"); //этот метод позволяет добавить какой-либо элекмент в конец коллекции
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        deque.removeFirst(); //данный метод позволяет удалить элемент в начале списка
        deque.removeLast(); //данный метод позволяет удалить элемент в конце списка
        while(deque.peek()!=null){
            System.out.println(deque.pop());
        }
        System.out.println(deque);
        ArrayDeque<Person> arrayDeque = new ArrayDeque();
        arrayDeque.addFirst(new Person("Yan"));
        arrayDeque.addFirst(new Person("Yan1"));
        for(Person person:arrayDeque){
            System.out.println(person.getName());
        }
    }
}
class Person{
    private String name;
    public Person(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
