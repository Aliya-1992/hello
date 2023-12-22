package HomeTask2.Task7;




import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
public class Program {
    public static void main(String[] args) {

        ArrayDeque<Student> students = new ArrayDeque();
        students.add(new Student("Yan", "Leonov", "1003", 4.3));
        students.add(new Student("Vera", "Polinina", "9000", 5.0));
        for(Student student:students){
            student.getScholarship();
        }
        ArrayDeque<Student> students1 = new ArrayDeque();
        students1.add(new Aspirant("Nina", "Mishina", "1000", 4.8, "Kvantovaya mehanica"));
        students1.add(new Aspirant("Liniza", "Garaeva", "9989", 3.4, "Skazki v tatarskoi literature"));

           for(Student aspirant: students1){
                  aspirant.getScholarship();
    }
}}
