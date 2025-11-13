package Interface_Segregation_ISP;


abstract class CreditCard_{
    private String cardNumber;
    private String cardHolder;
    private String expireDate;
    private int cvv;

    public abstract void swipeAndPay();
    public abstract void onlinePayment();
    public abstract void tapAndPay();
}

interface UPICompatableCard{
     void upiPayment();
}

interface intlPayCompatableCard{
     void intlPayment();
}

interface refundCompatableCard{
     void doRefund();
}

class MasterCard_ extends CreditCard_ implements refundCompatableCard, intlPayCompatableCard{
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
    public void tapAndPay() {

    }
    @Override
    public void intlPayment() {
        System.out.println("Master card inter national payment");
    }
}

class RupayCard_ extends CreditCard_ implements UPICompatableCard{
    @Override
    public void swipeAndPay() {
        System.out.println("Rupay card swipe and pay");
    }
    @Override
    public void onlinePayment() {
        System.out.println("Rupay card online payment");
    }
    @Override
    public void tapAndPay() {

    }
    @Override
    public void upiPayment() {
        System.out.println("Rupay card  UPI payment");
    }
}


class ISP_Followed_Code {
    public static void main(String[] args) {
        MasterCard_ C1 = new MasterCard_();
        RupayCard_ C2 = new RupayCard_();

        C1.doRefund();
        C1.intlPayment();

        C2.onlinePayment();;
        C2.upiPayment();
    }
}
