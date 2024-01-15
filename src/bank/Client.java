package bank;

class Client extends BankObject {
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

    //sКонструктор для використання з батьківського класу
    Client(String name, int age, String sex) {
        this(name, age, sex, 0.0); //Виклик конструктора з параметрами
    }
    
    //Методи з модифікатором доступу private
    private double getBalance(int type) { //Перевизначення методу
        if (type == 1) { // Додаткова логіка залежно від типу
            return getBalance() * 0.85;  // Знижка для типу 1
        } else {
            return getBalance();
        }
    }

    //Рекурсивний метод
    private void recursiveMethod(int iterations, String message) {
        if (iterations > 0) {
            System.out.println(message);
            recursiveMethod(iterations - 1, message);
        }
    }

    //Допоміжні методи з модифікатором доступу public
    public double getBalancePublic(int type) {
        return getBalance(type);
    }

    public void recursiveMethodPublic(int iterations, String message) {
        recursiveMethod(iterations, message);
    }

    //Модифікатори доступу та методи get() та set()
    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    String getSex() {
        return sex;
    }

    void setSex(String sex) {
        this.sex = sex;
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
        System.out.println("Клієнт: " + name + ", Вік: " + age + ", Стать: " + sex + ", Баланс поточного рахунку: " + balance);
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
        
     //Новий метод з власною логікою та використанням методу батьківського класу
        void customLogicMethod() {
            System.out.println("Власний метод класу Client");
            //Виклик методу батьківського класу
            setBalance(getBalance() - 50.0);
    }
    
        void process() {
            System.out.println("Метод суперкласу для Client");
        }
}
