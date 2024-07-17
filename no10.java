class BankUser {
    public static void main(String[] args) {
        BankAccount john = new BankAccount("John", 123456);
        BankAccount mary = new BankAccount("Mary", 654321);

        john.Summarize();
        mary.Summarize();

        System.out.println("Total number of accounts created: " + BankAccount.GetTotalNumberOfAccountsCreated());
    }
}
