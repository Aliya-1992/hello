package HomeTask2.Task3;

import java.util.Scanner;
import java.util.Random;
public class Chislo {
    private int niznyayaGraniza;
    private int verhnyayaGraniza;
    private int kolichestvoZhiznei;






    public Chislo(int niznyayaGraniza, int verhnyayaGraniza, int kolichestvoZhiznei){
        this.niznyayaGraniza = niznyayaGraniza;
        this.verhnyayaGraniza = verhnyayaGraniza;
        this.kolichestvoZhiznei = kolichestvoZhiznei;


    }


    public void action(){

        Random num4 = new Random();
        int num1 = num4.nextInt(niznyayaGraniza, verhnyayaGraniza);
        System.out.println(num1);
        for (int i=1; i<=kolichestvoZhiznei; i=i+0){
            System.out.println("Для выхода укажите ESC, если хотите продолжить игру, нажмите пробел либо что-то еще:");
            String ESC = "ESC";
            Scanner s = new Scanner(System.in);
            String esc= s.nextLine();

            if (ESC.equals(esc.toUpperCase())){
                break;
            }


            System.out.println("укажите число: ");
            Scanner sc = new Scanner(System.in);
            int chislo = sc.nextInt();



        if (chislo==num1){
            System.out.println("Вы победили");
            break;
        }
        else if (chislo<=num1+2 && chislo>=num1-2){
            i = i-1;
            System.out.println("вы рядом");
        }
        else{
            i = i+1;
            System.out.println("Вы не рядом");
        }

    } }
}
