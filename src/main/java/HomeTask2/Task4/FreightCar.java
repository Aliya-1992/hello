package HomeTask2.Task4;

public class FreightCar extends Car{
    int razhodTopliva;
    public  FreightCar(int ves, int poleznayaNagruzka, int razhodTopliva){
        super(ves, poleznayaNagruzka);

        this.razhodTopliva= razhodTopliva;

    }
    @Override
    public void razgon(){
        super.razgon();
    }
    @Override
    public void ostanovka(){
        super.ostanovka();
    }
    public void razhodTopliva(){
        if (ves<3500 || poleznayaNagruzka<75){
            System.out.println("Вы указали свойства легкового автомобиля");

        }

        else if (ves > 3500 && poleznayaNagruzka>75 && razhodTopliva>24 && razhodTopliva<30){
                System.out.println("У этого грузового автомобиля средний расход топлива");
            }
        else if(razhodTopliva<=24 && ves >3500 && poleznayaNagruzka>75){
                System.out.println("У данного грузового автомобиля низкий расход топлива");
            }
            else if(razhodTopliva>=30 && ves > 3500 && poleznayaNagruzka>75){
                System.out.println("У данного автомобиля высокий расход топлива");
            }
        }
    }

