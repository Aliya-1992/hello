package HomeTask2.Task4;

public class Car {
    int ves;
    int poleznayaNagruzka;

    public Car(int ves, int poleznayaNagruzka){
        this.ves = ves;
        this.poleznayaNagruzka =poleznayaNagruzka;
    }

    public int getPoleznayaNagruzka() {
        return poleznayaNagruzka;
    }

    public int getVes() {
        return ves;
    }

    public void razgon() {
        if (ves > 3500) {
            String str = "Грузовой автомобиль разгоняется";
            System.out.println(str);
        } else if (ves < 3500 && ves > 0) {
            String str2 = "Легковой автомобиль разгоняется";
            System.out.println(str2);;
        }}

        public void ostanovka() {
            if (poleznayaNagruzka > 75) {
                String str3 = "Грузовой автомобиль останавливается";
                System.out.println(str3);
            } else if (poleznayaNagruzka < 75 && poleznayaNagruzka> 0) {
                String str4 = "Легковой автомобиль останавливается";
                System.out.println(str4);
            }
    }

}
