class BankAccount{
    public int accountNumber;
    protected String accountHolder;
    private int balance;

    public BankAccount(int accountNumber, String accountHolder, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getBankBalance(){
        return balance;
    }
}

class SavingsAccount extends BankAccount{

    public SavingsAccount(int accountNumber, String accountHolder, int balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displaySavingsAccountDetails(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolder);
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(123456789, "Naman Malhotra",10000000);
       System.out.println(account1.getBankBalance());

        System.out.println();

        SavingsAccount savingsAccount = new SavingsAccount(25647865, "Manvi Grover",20000000);
        savingsAccount.displaySavingsAccountDetails();
    }
}
