package bank;

public class BankAccount {
    private int balance;
    private Person owner;

    BankAccount(int pBalance) {
        if (pBalance < 0) {
            balance = 0;
        } else {
            balance = pBalance;
        }
    }

    BankAccount(Person pOwner) {
        owner = pOwner;
        balance = 0;
    }

    public BankAccount(int pBalance, Person pOwner) {
        if (pBalance < 0) {
            balance = 0;
        } else {
            balance = pBalance;
        }

        owner = pOwner;
    }

    public int getBalance() {
        return balance;
    }

    public Person getOwner() {
        return owner;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    boolean deposit(int amount) {
        if (amount < 0 || owner.getCashAmount() < amount) {
            System.out.printf("입금 실패입니다. 잔고: %d원, 현금: %d원\n", balance, owner.getCashAmount());
            return false;
        } else {
            balance += amount;
            owner.setCashAmount(owner.getCashAmount() - amount);

            System.out.printf("%d원 입금하였습니다. 잔고: %d원, 현금: %d원\n", amount, balance, owner.getCashAmount());

            return true;
        }
    }

    boolean withdraw(int amount) {
        if (!(balance < amount || amount < 0)) {
            balance -= amount;
            owner.setCashAmount(owner.getCashAmount() + amount);

            System.out.printf("%d원 출금하였습니다. 잔고: %d원, 현금: %d원\n", amount, balance, owner.getCashAmount());

            return true;
        } else {
            System.out.printf("출금 실패입니다. 잔고: %d원, 현금: %d원\n", balance, owner.getCashAmount());
            return false;
        }
    }

    public boolean transfer(Person to, int amount) {
        if (amount < 0 || amount > balance) {
            System.out.printf("false - from: %s, to: %s, amount: %d, balance: %d\n", owner.getName(), to.getName(), amount, owner.getAccount().getBalance());

            return false;
        } else {
            balance -= amount;
            to.getAccount().balance += amount;

            System.out.printf("true - from: %s, to: %s, amount: %d, balance: %d\n", owner.getName(), to.getName(), amount, owner.getAccount().getBalance());
            return true;
        }
    }

    public boolean transfer(BankAccount to, int amount) {
        if (amount < 0 || amount > balance) {
            System.out.printf("false - from: %s, to: %s, amount: %d, balance: %d\n", owner.getName(), to.getOwner().getName(), amount, owner.getAccount().getBalance());

            return false;
        } else {
            balance -= amount;
            to.getOwner().getAccount().balance += amount;

            System.out.printf("true - from: %s, to: %s, amount: %d, balance: %d\n", owner.getName(), to.getOwner().getName(), amount, owner.getAccount().getBalance());
            return true;
        }
    }
}
