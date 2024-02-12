package оооо;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Pr9 {
    //для больших текстов
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("b.txt", false)){
           String text = "TTTTT";
           fileWriter.write(text);
            System.out.println(0);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
     try(FileReader fileReader = new FileReader("b.txt")){
         int i;
         while ((i = fileReader.read())!=-1){
             System.out.println((char)i);
         }
     }
     catch (Exception e){
         System.out.println(e.getMessage());
     }  //FileWriter позволяет работать с файлами, внутри которых есть какой-то обширный объем текста. в качетве аргументов принимает 2 параметра: название файла и будем ли мы дописывать информацию. тру - значит что информацию будем дописывать если фалсе то информацию будем перезаписывать
    }
}
