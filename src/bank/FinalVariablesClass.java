package bank;

class FinalVariablesClass {

	//final змінні екземплярів класу
    private final int finalVariable1 = 5;
    private final String finalVariable2 = "Hello";
    private final double finalVariable3;

    //Конструктор для ініціалізації fina змінної під час створення об'єкта
    public FinalVariablesClass(double initialValue) {
        this.finalVariable3 = initialValue;
    }

    //Перший метод, що використовує усі final змінні екземплярів класу
    public void firstMethod() {
        System.out.println("Перший метод. Змінна 1: " + finalVariable1 + ", Змінна 2: " + finalVariable2 + ", Змінна 3: " + finalVariable3);
    }

    //Другий метод, що використовує локальні final змінні
    public void secondMethod() {
        final int localFinalVariable1 = 10;
        final String localFinalVariable2 = "World";

        // Використання локальних final змінних
        System.out.println("Другий метод. Локальна змінна 1: " + localFinalVariable1 + ", Локальна змінна 2: " + localFinalVariable2);
    }
}
