package bank;

public class Client {
	// Змінні екземпляра класу
	private String name;
    private int age;
    private String sex;
    private double balance;

    // Конструктор
    public Client(String name, int age, String sex, double balance) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.balance = balance;
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
        System.out.println("Клієнт: " + name + ", Вік: " + age + ", Стать: " + sex + ", Баланс поточного рахунку: " + balance);
    }
}
