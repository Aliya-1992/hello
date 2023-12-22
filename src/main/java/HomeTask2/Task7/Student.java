package HomeTask2.Task7;

public class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;

    public double getAverageMark() {
        return averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGroup() {
        return group;
    }

    public String getLastName() {
        return lastName;
    }

    public Student(String firstName, String lastName, String group, double averageMark){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;

    }
    public void getScholarship() {
        if (averageMark >= 4.7) {
            int sum= 3200;
            System.out.println("Студент "+ firstName + " "+lastName + " из группы "+group+ " получает стипендию в "+ sum + " рублей, так как средний балл составляет: "+averageMark);
        } else if (averageMark<4.7 && averageMark>=3.7) {
            int sum =  2100;
            System.out.println("Студент "+ firstName + " "+lastName + " из группы "+group+ " получает стипендию в "+ sum + " рублей, так как средний балл составляет: "+averageMark);
        }
        else{int sum = 0;
            System.out.println("Студент "+ firstName + " "+lastName + " из группы "+group+ " получает стипендию в "+ sum + " рублей, так как средний балл составляет: "+averageMark);}
    }

}
