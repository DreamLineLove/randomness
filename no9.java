class BankAccount {
    private String account_holder_name;
    private int account_number;
    private double current_balance = 0;
    private static int number_of_accounts_created = 0;

    BankAccount(String name, int number) {
        account_holder_name = name;
        account_number = number;
        number_of_accounts_created++;
    }

    void Deposit(double amount, boolean valid) {
        current_balance += amount;
        if (valid) {
            System.out.println("Deposit successful");
            System.out.println(account_holder_name + " new balance : " + current_balance);
        } else {
            System.out.println("Deposit unsuccessful!");
        }
    }
    
    void Withdraw(double amount, boolean valid) {
        current_balance -= amount;
        if (valid) {
            System.out.println("Withdrawal successful");
            System.out.println(account_holder_name + " new balance : " + current_balance);
        } else {
            System.out.println("Withdrawal unsuccessful!");
        }
    }

    void Summarize() {
        System.out.println("Name\t\t" + account_holder_name);
        System.out.println("Account Number\t" + account_number);
        System.out.println("Current Balance\t" + current_balance);
        System.out.println();
    }

    static int GetTotalNumberOfAccountsCreated() {
        return number_of_accounts_created;
    }
}
