package HomeTask3;

public class Task2 {
    public static void main(String[] args) {
        double dlinaOkr = 47.1;
        double radius = dlinaOkr/(2*Math.PI);
        double s = Math.PI * Math.pow(radius, 2);
        System.out.println(Math.round(s));

    }
}
