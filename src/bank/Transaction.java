package bank;

class Transaction extends BankObject {
	//Змінні екземпляра класу
    private String transactionId;
    private String description;

    //Конструктор
    Transaction(String transactionId, String description) {
        this.transactionId = transactionId;
        this.description = description;
    }

    //Конструктор для використання з батьківського класу
    Transaction(String transactionId) {
        this(transactionId, ""); //Виклик конструктора з параметрами
    }
    
    //Метод з модифікатором доступу private
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
        
     //Новий метод з власною логікою та використанням методу батьківського класу
        void customLogicMethod() {
            System.out.println("Власний метод класу Transaction");
            //Виклик методу батьківського класу
            executeTransaction(new Client("Іван", 35, "Чоловіча", 50000.0), 200.0);
    }
        void process() {
            System.out.println("Метод суперкласу для Transaction");
    }
}
