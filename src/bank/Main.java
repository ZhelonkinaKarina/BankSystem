package bank;

class Main {
	public static void main(String[] args) {
	 //Створення екземплярів класів
    Client client1 = new Client("Марта", 25, "Жіноча", 65000.0);
    Account account1 = new Account("A123", "Вкладний (депозитний)", 20000.0);
    Transaction transaction1 = new Transaction("T001", "Переказ коштів");

    //Виклик методів
    client1.displayInfo();
    account1.displayInfo();

    account1.displayInfo();
    
    Transaction.printTransactionInfo("T002", "Виведення коштів");  //Виклик статичного методу
    
    //Ініціалізація змінних різними варіантами
    Client client2 = new Client("Петро", 30, "Чоловіча", 75000.0, true); //Варіант ініціалізації 1
    Client client3 = new Client("Анна", 55000.0, false, "Жіноча", 28); //Варіант ініціалізації 2
    Client client4 = new Client("Катерина", "Жіноча", 34, 95000.0, true); //Варіант ініціалізації 3
    Client client5 = new Client("Максим", true, "Чоловіча", 51, 60000.0); //Варіант ініціалізації 4
    Account account2 = new Account("A124", "Вкладний (депозитний)", 30000.0);
    Account account3 = new Account("A125", "Вкладний (депозитний)", 40000.0);
    Transaction transaction2 = new Transaction("T002", "Зняття коштів");
    Transaction transaction3 = new Transaction("T003", "Переказ коштів");
    
    
    //Виклик новостворених методів
    Account account4 = new Account("A123", "Вкладний (депозитний)", 20000.0);
    Account account5 = new Account("A124", "Вкладний (депозитний)", 30000.0);

    //Виклик методу, що приймає екземпляр того ж класу в якості параметру
    account1.performOperations(account2);
    
    
    //Виклик методу збільшення балансу удвічі
    Account account = new Account("A123", "Вкладний (депозитний)", 20000.0);
    account.setAndDoubleBalance(5000.0);
    System.out.println("Оновлений баланс рахунку: " + account.getBalance());
    
    //Виклик закритих методів через допоміжні публічні методи
    Account account8 = new Account("A123", "Вкладний (депозитний)", 20000.0); //Виклик методу посилкового типу
    account.depositPublic(15000.0);	//Виведення інформації про оновлений об'єкт

    Client client = new Client("Іван", 35, "Чоловіча", 50000.0); //Виклик рекурсивного методу
    client.recursiveMethodPublic(3, "Застосування рекурсії");

    Transaction transaction = new Transaction("T001", "Переказ коштів");
    transaction.executeTransactionPublic(client, 11500.0);
    
    //Виклик статичних методів нового класу
    AdditionalClass.firstStaticMethod();
    AdditionalClass.secondStaticMethod();
    
    //Створення екземпляру класу
    FinalVariablesClass finalVariablesClass = new FinalVariablesClass(3.14);

    //Виклик методів
    finalVariablesClass.firstMethod();
    finalVariablesClass.secondMethod();
	}
}
