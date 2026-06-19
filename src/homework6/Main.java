package homework6;

public class Main {

    public static void main(String[] args) {

//        CreditCard creditCard1 = new CreditCard();
//        CreditCard creditCard2 = new CreditCard();
//        CreditCard creditCard3 = new CreditCard();
//
//        creditCard1.accountNumber = "8546201";
//        creditCard1.balance = 500;
//
//        creditCard2.accountNumber = "5422346";
//        creditCard2.balance = 500;
//
//        creditCard3.accountNumber = "6544424";
//        creditCard3.balance = 500;
//
//
//        creditCard1.addBalance(1000,"8546201");
//        creditCard2.addBalance(5000,"5422346");
//        creditCard3.removeBalance(5000,"6544424");


        ATM atm1 = new ATM();

        atm1.addMoney(10_000);
        atm1.removeMoney(10_000);
    }

}
