package bank;

public class Person {
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;

    Person(String pName, int pAge) {
        if (pAge < 0) {
            age = 12;
        } else {
            age = pAge;
        }

        cashAmount = 0;
        name = pName;
    }

    Person(String pName, int pAge, int pCashAmount) {
        if (pAge < 0) {
            age = 12;
        } else {
            age = pAge;
        }

        if (pCashAmount < 0) {
            cashAmount = 0;
        } else {
            cashAmount = pCashAmount;
        }
        name = pName;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    BankAccount getAccount() {
        return account;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getCashAmount() {
        return cashAmount;
    }

    void setCashAmount(int cashAmount) {
        this.cashAmount = cashAmount;
    }

    void setAccount(BankAccount account) {
        this.account = account;
    }


    void transfer(Person to, int amount) {
        if (amount < 0 || amount > getAccount().getBalance()) {
            System.out.printf("false - from: %s, to: %s, amount: %d, balance: %d\n", getName(), to.getName(), amount, getAccount().getBalance());
        } else {
            getAccount().setBalance(getAccount().getBalance() - amount);
            to.getAccount().setBalance(to.getAccount().getBalance() + amount);

            System.out.printf("true - from: %s, to: %s, amount: %d, balance: %d\n", getName(), to.getName(), amount, getAccount().getBalance());

        }
    }

    void transfer(BankAccount to, int amount) {
        if (amount < 0 || amount > getAccount().getBalance()) {
            System.out.printf("false - from: %s, to: %s, amount: %d, balance: %d\n", getName(), to.getOwner().getName(), amount, getAccount().getBalance());
        } else {
            getAccount().setBalance(getAccount().getBalance() - amount);
            to.getOwner().getAccount().setBalance(to.getOwner().getAccount().getBalance() + amount);

            System.out.printf("true - from: %s, to: %s, amount: %d, balance: %d\n", getName(), to.getOwner().getName(), amount, getAccount().getBalance());

        }
    }
}