package HomeTask2.Task5;
import java.util.Scanner;

public class Lamp implements Light{
    String vkluchenIliNet;

    public Lamp(String vkluchenIliNet){
        this.vkluchenIliNet = vkluchenIliNet;
    }


    @Override
    public void goret(){
        if (vkluchenIliNet.equals("Да")){
            System.out.println("Объект включен, его можно выключить");
            System.out.println("Пожалуйста, укажите цвет: ");
            Scanner sc = new Scanner(System.in);
            String zvet = sc.nextLine();
            System.out.println("Лампа излучает цвет: "+zvet);
        }
        else if(vkluchenIliNet.equals("Нет")){
            System.out.println("Объект выключен, но его можно включить");
        }
        else{
            System.out.println("Пожалуйста, укажите в качестве аргумета Да или Нет");
        }
    }
}
