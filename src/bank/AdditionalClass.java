package bank;

class AdditionalClass {
	
	//Статичні змінні з ініціалізацією під час оголошення та статичним блоком
    private static int staticVariable1 = 1300;
    private static int staticVariable2;

    static {
        staticVariable2 = 890;
    }

    //Перший статичний метод
    static void firstStaticMethod() {
        System.out.println("Перший статичний метод. Змінна 1: " + staticVariable1 + ", Змінна 2: " + staticVariable2);
    }

    //Другий статичний метод
    static void secondStaticMethod() {
        //Використання результатів роботи першого методу
        firstStaticMethod();
        System.out.println("Другий статичний метод.");
    }

}
