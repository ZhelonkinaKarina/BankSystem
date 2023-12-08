package bank;

public class Account {
	// Змінні екземпляра класу
	private String accountId;
    private String accountType;
    private double balance;
    
    // Конструктор
    public Account(String accountId, String accountType, double balance) {
        this.accountId = accountId;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Void-метод
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Поповнення коштів на депозитний рахунок у розмірі " + amount + " UAH клієнта №" + accountId + ". Оновлений баланс вкладного (депозитного) рахунку: " + balance);
    }
    
    // Типізований метод
    public double getBalance() {
        return balance;
    }

    // Void-методи
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayInfo() {
        System.out.println("Клієнт №" + accountId + ", Тип рахунку: " + accountType + ", Баланс вкладного (депозитного) рахунку: " + balance);
    }
}
