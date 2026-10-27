package oopstask;

public class PaymentTest {
    public static void main(String[] args) {
        Payment p;

        p = new UpiPayment();
        p.pay(5000);

        p = new CardPayment();
        p.pay(3000);

        p = new CashPayment();
        p.pay(1000);
    }
}