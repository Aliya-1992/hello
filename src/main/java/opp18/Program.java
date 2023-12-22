package opp18;

public class Program {
    public static void main(String[] args) {
        //Person sergey = new Person ("Sergey", 67);
        //Person anton = new Person("Anton", 45);
        //sergey.display();
        //Person anton = sergey;
        //anton.setName("Anton");
        //anton.display();
       try {
        Person sergey1 = new Person("Sergey", 78);
        Person anton = sergey1.clone();
        anton.setName("M");
        anton.display();
        sergey1.display();
       }
       catch (CloneNotSupportedException exception){
          System.out.println("нельзя склонировать элемент");
       }

   }
}
