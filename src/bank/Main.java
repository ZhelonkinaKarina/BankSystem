package bank;

public class Main {
public static void main(String[] args) {
	 // Створення екземплярів класів
    Client client1 = new Client("Марта", 25, "Жіноча", 65000.0);
    Account account1 = new Account("A123", "Вкладний (депозитний)", 20000.0);
    Transaction transaction1 = new Transaction("T001", "Переказ коштів");

    // Виклик методів
    client1.displayInfo();
    account1.displayInfo();

    account1.deposit(15000.0);
    transaction1.executeTransaction(client1, 11500.0);

    account1.displayInfo();
}

}
