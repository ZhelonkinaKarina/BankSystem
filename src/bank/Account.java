package bank;

class Account {
	//Змінні екземпляра класу
    private String accountId;
    private String accountType;
    private double balance;

    //Конструктор
    Account(String accountId, String accountType, double balance) {
        this.accountId = accountId;
        this.accountType = accountType;
        this.balance = balance;
    }

    //Конструктор для використання з батьківського класу
    Account(String accountId, String accountType) {
        this(accountId, accountType, 0.0); //Виклик конструктора з параметрами
    }
    
    //Методи з модифікатором доступу private
    private void deposit(double amount) { //Void метод
        balance += amount;
        System.out.println("Поповнення коштів на депозитний рахунок у розмірі " + amount + " UAH клієнта №" + accountId + ". Оновлений баланс вкладного (депозитного) рахунку: " + balance);
    }

    private void deposit(int amount) { //Перевизначення методу
        deposit((int) amount);
    }

    private Account updateAccount(double newBalance) {
        this.balance = newBalance;
        return this;
    }
    
    //Допоміжні методи з модифікатором доступу public
    public void depositPublic(double amount) {
        deposit(amount);
    }

    public void depositPublic(int amount) {
        deposit(amount);
    }

    public void performOperationsPublic(Account otherAccount) {
        performOperations(otherAccount);
    }

    //Метод посилкового типу
    public Account updateAccountPublic(double newBalance) {
        return updateAccount(newBalance);
    }
    
    //Модифікатори доступу та методи get() та set()
    String getAccountId() {
        return accountId;
    }

    void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    String getAccountType() {
        return accountType;
    }

    void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    
    //Типізований метод
    double getBalance() {
        return balance;
    }

    //Void-методи
    void setBalance(double balance) {
        this.balance = balance;
    }

    //Метод, що дозволяє автоматично збільшувати значення balance удвічі
    void setAndDoubleBalance(double balance) {
        this.balance = balance * 2;
    }
    
    void displayInfo() {
        System.out.println("Клієнт №" + accountId + ", Тип рахунку: " + accountType + ", Баланс вкладного (депозитного) рахунку: " + balance);
    }
     
    //Метод, що приймає екземпляр того ж класу в якості параметру
    void performOperations(Account otherAccount) {
        //Виклик методу із класу, екземпляр якого передано в параметр
        otherAccount.deposit(5000.0);

    //Виклик змінної екземпляра класу, який передано в параметр
    double otherBalance = otherAccount.getBalance();
    System.out.println("Баланс іншого рахунку: " + otherBalance);
    }
    
    //Новий метод з власною логікою та використанням методу батьківського класу
    void customLogicMethod() {
        System.out.println("Власний метод класу Account");
    	//Виклик методу батьківського класу
        deposit(100.0);

    }
}
