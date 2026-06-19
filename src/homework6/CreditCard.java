package homework6;

public class CreditCard {

    public String accountNumber;
    public int balance;

    public void addBalance(int amount, String accountNumber) {
        System.out.println("-".repeat(30));
        System.out.println("Начисление суммы на аккаунт " + accountNumber + "...");
        System.out.println("Баланс карты " + accountNumber + " до операции: " + balance);
        balance += amount;
        System.out.println("Баланс карты " + accountNumber + " после операции: " + balance);
    }

    public void removeBalance(int amount, String accountNumber) {
        System.out.println("-".repeat(30));
        System.out.println("Снятие суммы с аккаунта " + accountNumber + "...");
        if (amount > balance) {
            System.out.println("Нет достаточных средств на карте");
            System.out.println("Баланс карты " + accountNumber +": " + balance);
        }
        else{
            balance -= amount;
            System.out.println("Баланс аккаунта " + accountNumber + " после снятия: " + balance);
        }

    }



}
