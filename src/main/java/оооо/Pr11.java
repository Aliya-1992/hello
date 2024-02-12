package оооо;

import java.io.*;

public class Pr11 {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter("gg.txt"))){
            String text;
            while (!(text = bufferedReader.readLine()).equalsIgnoreCase("end")){
                bufferedWriter.write(text+"\n");
            }
            System.out.println(999);
            }

        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }}

