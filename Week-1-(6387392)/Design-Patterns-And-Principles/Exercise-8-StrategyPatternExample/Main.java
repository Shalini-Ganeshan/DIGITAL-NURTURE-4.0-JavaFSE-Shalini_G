public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext(new CreditCardPayment());
        context.payAmount(1500.00);

        context.setStrategy(new PayPalPayment());
        context.payAmount(3000.00);
    }
}
