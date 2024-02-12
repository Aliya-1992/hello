package оооо;

import java.io.File;

public class Pr13 {
    public static void main(String[] args) {
        File directory = new File("C://test");
        if (directory.isDirectory()){
            for(File file: directory.listFiles()){
                System.out.println(file.getName());
            }}
            else{
            System.out.println(99);
            }
        }
    }

