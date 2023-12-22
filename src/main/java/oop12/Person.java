package oop12;

public class Person {
    private String name;
    public Person(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return "Person " +name;
    }
    @Override
    public int hashCode(){
        return 3*name.hashCode()+123;
    }
    @Override
    public boolean equals(Object object){
        if (!(object instanceof Person)){
            return false;
        }
        Person person = (Person) object;
        return this.name.equals(person.name);
    }
}
