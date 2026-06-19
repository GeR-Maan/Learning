package homework6;

public class ATM {
    public int counterTwenties;
    public int counterFifties;
    public int counterHundred;
    public int balance;

    public void addMoney(int amount) {
        balance += amount;
    }

    public boolean removeMoney(int amount) {

        System.out.println("Снятие суммы с аккаунта...");
        if (amount > balance) {
            System.out.println("Нет достаточных средств на карте");
            return false;
        }
        else {
            // Узнаем по итогу сколько останется на счёте
            int result = balance - amount;
            //Смотрим сколько будет соток
            counterHundred = amount/100;
            // Убираем эту сумму из снимаемой денежной массы
            amount -= counterHundred*100;
            //Повторяем
            counterFifties = amount/50;
            amount -= counterFifties*50;

            counterTwenties = amount/20;
            amount -= counterTwenties*20;

            balance -= result;

            System.out.printf("Выдача суммы следующими купюрами:\n" +
                    "Сотнями: %d\n" +
                    "Пятидесятками: %d\n" +
                    "Двадцатки: %d\n",counterHundred,counterFifties,counterTwenties);
            if (amount != 0){
                System.out.println("Остальная сумма в размере " + amount + " была выдана другими купюрами");
            }
            return true;
        }
    }


}
