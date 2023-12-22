package bank;

class OuterClass {
	private int outerVariable = 10;

    //Вкладений клас
    class InnerClass {
        private int innerVariable = 5;

        //Метод вкладеного класу, який використовує члени зовнішнього класу
        void innerMethod() {
            System.out.println("Зовнішня змінна: " + outerVariable);
        }
    }

    //Метод, який створює та викликає метод вкладеного класу
    void test() {
        InnerClass innerObject = new InnerClass();
        innerObject.innerMethod();
    }
}
