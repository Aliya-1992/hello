package оооо;

import java.io.File;

public class Pr14 {
    public static void main(String[] args) {
        //создание фалйа
        File directory = new File("C:/test/new");
        boolean created = directory.mkdir();  //метод позволяет создать файл
        if(created){
            System.out.println("created");
        }
        else{
            System.out.println("not created");
        }
        File newDirectoryName = new File("C:/test/ko");
        directory.renameTo(newDirectoryName); //переименовываем

        newDirectoryName.delete(); //удаление

        File newFile = new File("C:/test/еею.txt");
        System.out.println(newFile.getName());//получаем имя файла
        System.out.println(newFile.getParent()); //получаем имя папки где файл
        try{newFile.createNewFile();}
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        if(newFile.exists()) { //выясняем есть ли файл
            System.out.println("существует");}
        else {
            System.out.println("net");
        }
        System.out.println(newFile.length()); //узнаем размер файла

        if (newFile.canRead()){
            System.out.println("Можно прочитать");
        }
        else {
            System.out.println("не прочитать");
        }
        if (newFile.canRead()){
            System.out.println("Можно написать");
        }
        else {
            System.out.println("не написать ничего");
        }
        System.out.println(newFile.lastModified()); //сколько милисекунд назад был изменен файл
        if (newFile.isFile()){
            System.out.println("это файл");
        }
        else {
            System.out.println("не файл");
        }

        if (newFile.isHidden()){
            System.out.println("это файл скрытый");
        }
        else {
            System.out.println("файл общедоступный");
        }


        //архивирование


    }

}
