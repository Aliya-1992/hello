package оооо;

import java.io.*;

public class Pr8 {
    public static void main(String[] args) {
        Person person = new Person("An", 12, 67, true);
        try (FileOutputStream fileOutputStream = new FileOutputStream("data.bin");
                DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream)){
                dataOutputStream.writeUTF(person.name); //принимает значение строки
                dataOutputStream.writeInt(person.age);
                dataOutputStream.writeDouble(person.height);
                dataOutputStream.writeBoolean(person.gender);
            System.out.println(89);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    try(DataInputStream dataInputStream = new DataInputStream(new FileInputStream("data.bin"))){
        String name = dataInputStream.readUTF();
        int age = dataInputStream.readInt();
        double height = dataInputStream.readDouble();
        boolean gender = dataInputStream.readBoolean();
        System.out.println(name + " "+ height+ " "+ gender + " " +age);
    }
    catch(IOException e){
        System.out.println(e.getMessage());
    }

    }
}


class Person {
    public String name;
    public int age;
    public double height;
    public boolean gender;
    public Person(String name, int age, double height, boolean gender){
        this.name = name;
        this.age = age;
        this.height = height;
        this.gender = gender;



    }

}

