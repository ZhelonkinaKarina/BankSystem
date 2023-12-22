package bank;

class Transaction {
	//Змінні екземпляра класу
	private String transactionId;
    private String description;

    //Конструктор
    Transaction(String transactionId, String description) {
        this.transactionId = transactionId;
        this.description = description;
    }
    
 // Метод з модифікатором доступу private
    private void executeTransaction(Client client, double amount) {
        double currentBalance = client.getBalance();
        if (currentBalance >= amount) {
            client.setBalance(currentBalance - amount);
            System.out.println("Транзакція " + transactionId + ": " + description + ". Залишок коштів на поточному рахунку: " + client.getBalance());
        } else {
            System.out.println("Транзакція " + transactionId + ": Недостатньо коштів. Операцію перервано!");
        }
    }

    // Допоміжний метод з модифікатором доступу public
    public void executeTransactionPublic(Client client, double amount) {
        executeTransaction(client, amount);
    }
    
    //Модифікатори доступу та методи get() та set()
    String getTransactionId() {
        return transactionId;
    }

    void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    String getDescription() {
        return description;
    }

    void setDescription(String description) {
        this.description = description;
    }
    
    //Перевантаження методу
    static void printTransactionInfo(String transactionId, String description) {
        System.out.println("ID транзикції : " + transactionId + ", Опис: " + description);
    }
}
