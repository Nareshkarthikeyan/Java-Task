package oopstask;

public class CashPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Cash");
    }
}