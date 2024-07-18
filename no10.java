class BankUser {
    public static void main(String[] args) {
        BankAccount john = new BankAccount("John", 123456);
        BankAccount mary = new BankAccount("Mary", 654321);

        john.Summarize();
        mary.Summarize();

        john.Deposit(100.0, true);
        john.Withdraw(0, false);
        john.Withdraw(50, true);
        System.out.println();

        john.Summarize();

        mary.Deposit(200.0, true);
        System.out.println();

        mary.Summarize();

        System.out.println("Total number of accounts : " + BankAccount.GetTotalNumberOfAccountsCreated());
    }
}
