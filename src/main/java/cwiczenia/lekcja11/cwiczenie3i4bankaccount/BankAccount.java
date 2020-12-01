package cwiczenia.lekcja11.cwiczenie3i4bankaccount;

public class BankAccount {
    Person person;
    double money;

    public BankAccount(Person person, double money) {
        if (person == null) {
            throw new NullPointerException("BankAccount should have an owner");
        }
        this.person = person;
        this.money = money;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    // wpłata na konto
    void deposit(double additionalMoney) {
        money += additionalMoney; // na poziomie bankomatu powinna byc weryfikacja czy ktos nie podał kwoty <0
    }

    // wypłata z konta
    void withdraw(double amount) {
        if (amount > 1000) {
            throw new MaximumWithdrawalExceededException();
        }
        if (money < amount) {
            throw new NotEnoughMoneyException();
        }
        money -= amount;
    }

    public double getAccountValue() {
        return money;
    }
}
