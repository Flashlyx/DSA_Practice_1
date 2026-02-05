package Spring;

interface Payment{

    void payment();
}

class Paytm implements Payment{

    public void payment(){
        System.out.println("Paytm payment successful !");
    }
}

class GooglePay implements Payment{

    public void payment(){
        System.out.println("GooglePay payment successful !");
    }
}

public class Spring_DI {

    Payment pay;

    Spring_DI(Payment payment){
        this.pay = payment;
    }

    void pay(){
        pay.payment();
    }

    public static void main(String[] args) {
        Payment pay = new GooglePay();
        pay.payment();
    }
}
