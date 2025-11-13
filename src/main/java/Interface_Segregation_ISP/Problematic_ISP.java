package Interface_Segregation_ISP;


abstract class CreditCard{
    private String cardNumber;
    private String cardHolder;
    private String expireDate;
    private int cvv;

    public abstract void swipeAndPay();
    public abstract void doRefund();
    public abstract void onlinePayment();
    public abstract void intlPayment();
    public abstract void upiPayment();
}

class MasterCard extends CreditCard{
    @Override
    public void swipeAndPay() {
        System.out.println("Master card swipe and pay");
    }
    @Override
    public void doRefund() {
        System.out.println("Master card refund");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Master card online payment");
    }

    @Override
    public void intlPayment() {
        System.out.println("Master card inter natiuonal payment");
    }

    @Override
    public void upiPayment() {
        throw new UnsupportedOperationException("Upi payment not supported in Master card");
    }
}

class RupayCard extends CreditCard{
    @Override
    public void swipeAndPay() {
        System.out.println("Rupay card swipe and pay");
    }
    @Override
    public void doRefund() {
        throw new UnsupportedOperationException("Refund not supported in Rupay card");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Rupay card online payment");
    }

    @Override
    public void intlPayment() {
        throw new UnsupportedOperationException("International payment not supported in Rupay card");
    }

    @Override
    public void upiPayment() {
        System.out.println("Rupay card inter UPI payment");
    }
}

public class Problematic_ISP {
}
