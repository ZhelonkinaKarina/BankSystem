package bank;

class Client {
	//Змінні екземпляра класу
	private String name;
    private int age;
    private String sex;
    private double balance;

    //Конструктор
    Client(String name, int age, String sex, double balance) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.balance = balance;
    }
    
    Client(String name, String sex, int age, double balance) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.balance = balance;
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
        System.out.println("Клієнт: " + name + ", Вік: " + age + ", Стать: " + sex + ", Баланс поточного рахунку: " + balance);
    }
    
    //Перевизначення методу
    double getBalance(int type) {
        // Додаткова логіка залежно від типу
        if (type == 1) {
            return getBalance() * 0.85;  //Знижка для типу 1
        } else {
            return getBalance();
        }
    }
    
    //Перевизначення конструктора
    Client(String name, int age, String sex, double balance, boolean withDiscount) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.balance = withDiscount ? balance * 0.95 : balance;  //Застосовуємо знижку
    }
    
    Client(String name, double balance, boolean withDiscount, String sex, int age) {
        this.name = name;
        this.balance = withDiscount ? balance * 0.95 : balance;  //Застосовуємо знижку
        this.sex = sex;
        this.age = age;
    }
    
    Client(String name, String sex, int age, double balance, boolean withDiscount) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.balance = withDiscount ? balance * 0.95 : balance;  //Застосовуємо знижку
    }
    
    Client(String name, boolean withDiscount, String sex, int age, double balance) {
        this.name = name;
        this.balance = withDiscount ? balance * 0.95 : balance;  //Застосовуємо знижку
        this.sex = sex;
        this.age = age;
    }
    
    //Рекурсивний метод
    void recursiveMethod(int iterations, String message) {
        if (iterations > 0) {
            System.out.println(message);
            recursiveMethod(iterations - 1, message);
        }
    }
}
