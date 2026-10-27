package oopstask;

public class UpiPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using UPI");
    }
}