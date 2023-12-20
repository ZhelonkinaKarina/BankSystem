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

    //Void-метод
    void deposit(double amount) {
        balance += amount;
        System.out.println("Поповнення коштів на депозитний рахунок у розмірі " + amount + " UAH клієнта №" + accountId + ". Оновлений баланс вкладного (депозитного) рахунку: " + balance);
    }
    
    //Типізований метод
    double getBalance() {
        return balance;
    }

    //Void-методи
    void setBalance(double balance) {
        this.balance = balance;
    }

    void displayInfo() {
        System.out.println("Клієнт №" + accountId + ", Тип рахунку: " + accountType + ", Баланс вкладного (депозитного) рахунку: " + balance);
    }
    
    //Перевизначення методу
    void deposit(int amount) {
        deposit((int) amount);  
    }
    
    //Метод, що приймає екземпляр того ж класу в якості параметру
    void performOperations(Account otherAccount) {
        //Виклик методу із класу, екземпляр якого передано в параметр
        otherAccount.deposit(5000.0);

    //Виклик змінної екземпляра класу, який передано в параметр
    double otherBalance = otherAccount.getBalance();
    System.out.println("Баланс іншого рахунку: " + otherBalance);
    }

    //Метод посилкового типу
    Account updateAccount(double newBalance) {
    // Логіка для оновлення об'єкта з новими значеннями змінних екземпляра класу
    this.balance = newBalance;
    return this;
    }
}
