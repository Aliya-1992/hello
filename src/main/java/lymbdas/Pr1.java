package lymbdas;

public class Pr1 {
    /*static  int c = 10;
    static  int x = 30;
    public static void main(String[] args) {
        EmptyOperation emptyOperation = () -> {
           x = 40;
           return c+x;
        };
        System.out.println(x);*/
    public static void main(String[] args) {
        int y = 10;
        int x = 20;

        EmptyOperation emptyOperation = () -> {
            return x+y;
        };
        System.out.println(emptyOperation.cal());



    }
    }





