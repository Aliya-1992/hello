package HomeTask2.Task4;

public class PassengerCar extends Car{
    String color;
    public PassengerCar (int ves, int poleznayaNagruzka, String color){
        super(ves, poleznayaNagruzka);

        this.color = color;

    }
    @Override
    public void razgon(){
        super.razgon();
    }
    @Override
    public void ostanovka(){
        super.ostanovka();
    }
    public void color(){
        if (ves<3500 && poleznayaNagruzka<75){
            System.out.println("Цвет легковой машины: " + color);
        }
        else if (ves <3500 && poleznayaNagruzka>75){
            System.out.println("Вы указали свойcтва грузового автомобиля");
        }
    }


}
