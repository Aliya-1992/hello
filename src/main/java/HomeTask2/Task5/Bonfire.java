package HomeTask2.Task5;

public class Bonfire implements Light{
    String goritIliNet;

    public Bonfire(String goritIliNet){
        this.goritIliNet = goritIliNet;
    }


    @Override
    public void goret(){
        if (goritIliNet.equals("Да")){
            System.out.println("Объект горит, его можно потушить");
        }
        else if(goritIliNet.equals("Нет")){
            System.out.println("Объект не горит, его можно зажечь");
        }
        else{
            System.out.println("Пожалуйста, укажите в качестве аргумета Да или Нет");
        }
    }
}
