package оооо;

import java.io.*;

public class Pr12 {
    public static void main(String[] args) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("b.txt"))){
         PersonTest oerson = new PersonTest("yy", 23, 66, true);
         objectOutputStream.writeObject(oerson); //так мы кодируем информацию



    }
    catch (Exception e){
        System.out.println(e.getMessage());
    }
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("b.txt"))){
            PersonTest person = (PersonTest) objectInputStream.readObject();
            System.out.println(person.getName());



        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
}}


class PersonTest implements Serializable {
    public String name;
    public int age;
    public double height;
    public boolean gender;

    public PersonTest(String name, int age, double height, boolean gender){
        this.name = name;
        this.age = age;
        this.height = height;
        this.gender = gender;


    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {

        return height;
    }

    public boolean isGender() {
        return gender;
    }

   }





