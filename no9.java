class BankAccount {
    private String account_holder_name;
    private int account_number;
    private int current_balance = 0;
    private static int number_of_accounts_created = 0;

    BankAccount(String name, int number) {
        account_holder_name = name;
        account_number = number;
        number_of_accounts_created++;
    }

    void Deposit(int amount) {
        current_balance += amount;
        System.out.println("Successful!\nNew Balance: " + current_balance + "\n");
    }
    
    void Withdraw(int amount) {
        current_balance -= amount;
        System.out.println("Successful!\nNew Balance: " + current_balance + "\n");
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
