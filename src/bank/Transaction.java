package bank;

public class Transaction {
	// Змінні екземпляра класу
	private String transactionId;
    private String description;

    // Конструктор
    public Transaction(String transactionId, String description) {
        this.transactionId = transactionId;
        this.description = description;
    }

    // Void-метод
    public void executeTransaction(Client client, double amount) {
        double currentBalance = client.getBalance();
        if (currentBalance >= amount) {
            client.setBalance(currentBalance - amount);
            System.out.println("Транзакція " + transactionId + ": " + description + ". Залишок коштів на поточному рахунку: " + client.getBalance());
        } else {
            System.out.println("Транзакція " + transactionId + ": Недостатньо коштів. Операцію перервано!");
        }
    }
}
