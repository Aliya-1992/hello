package HomeTask2.Task4;

public class Program {
    public static void main(String[] args) {
        PassengerCar lada = new PassengerCar(2000, 45, "red");
        lada.color();
        FreightCar kamaz = new FreightCar(5099, 540, 25);
        kamaz.razhodTopliva();
    }
}
