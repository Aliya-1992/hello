package HomeTask;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double num = sc.nextInt();

        int y = 0;
        for (int i=0; i<num+1; i++){
            if (num%i==0){
                y=y+1;
            }
        }
        if (y ==1 || y==2){
            System.out.println("простое число");
        }
        else{
            System.out.println("Число не является простым");
        }
    }
}
