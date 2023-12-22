package oop19;

public class Transaction <T extends Accountable>{
    private T fromUser;
    private T toUser;
    private int sum;
    public Transaction(T fromUser, T toUser, int sum){
        this.fromUser = fromUser;
        this.toUser = toUser;
        this.sum = sum;
    }
    public void execute(){
        if (fromUser.getSum()>sum){
            fromUser.setSum(fromUser.getSum() - sum);
            toUser.setSum(toUser.getSum() + sum);
            System.out.println("Айди отправителя: "+ fromUser.getId() + "счет первого: "+ fromUser.getSum() + "Айди получателя: "+toUser.getId() + "счет второго: "+toUser.getSum());
        }
        else {
            System.out.println("Неверная сумма");
        }

    }
}
