package оооо;

import java.io.*;

public class Pr10 {
    public static void main(String[] args) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("g.txt"))){
            String text = "ggggggg";
            bufferedWriter.write(text);
            System.out.println(899);
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("g.txt"))){
            int y;
            while ((y = bufferedReader.read())!=-1);{
                System.out.println((char)y);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
