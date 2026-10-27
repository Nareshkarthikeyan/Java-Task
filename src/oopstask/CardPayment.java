package oopstask;

public class CardPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Card");
    }
}