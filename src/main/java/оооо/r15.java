package оооо;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class r15 {
    public static void main(String[] args) {
        //архивирование
        File file = new File("file1.txt");
        try
        {file.createNewFile();
        } catch (IOException e){
            System.out.println(e.getMessage());

        }
        String file1 = "file1.txt";
        String file2 = "file2.txt";
       try(ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream("test.zip"));
           FileInputStream fileInputStream = new FileInputStream(file1)) {
           ZipEntry zipEntry = new ZipEntry("test.txt");
       zipOutputStream.putNextEntry(zipEntry); //метод позволяет запихнуть файл в архив
           byte[] inputMas = new byte[fileInputStream.available()];
           fileInputStream.read(inputMas);
           zipOutputStream.write(inputMas);

       } catch (IOException e){
           throw  new RuntimeException(e);

       }
       try(ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream("test.zip"))){
          ZipEntry zipEntry;
          String name;
           while ((zipEntry = zipInputStream.getNextEntry())!=null){
               name = zipEntry.getName();
               System.out.println(name);
               FileOutputStream fileOutputStream = new FileOutputStream(name);
               for (int i =zipInputStream.read(); i!=-1; zipInputStream.read()){
                   fileOutputStream.write(i);
               }

           }
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
       }




    }

