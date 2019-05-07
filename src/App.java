public class App {
    public static void main(String[] args) {
        System.out.println("Консольний калькулятор");

        ReadEntered readEntered = new ReadEntered();

        System.out.println("Введіть перше ціле число від 0 до 10: ");
        int first = readEntered.readNextInt();

        System.out.println("Введіть друге ціле число від 0 до 10: ");
        int second = readEntered.readNextInt();

        Calculator calculator = new Calculator(first, second);
        System.out.println("Можливі дії:");
        System.out.println("1 - додати");
        System.out.println("2 - відняти");
        System.out.println("3 - помножити");
        System.out.println("4 - поділити");
        System.out.print("Введіть необхідну дію зазначивши її пункт: ");

        int act = readEntered.readNextInt();

        switch (act) {
            case 1:
                System.out.println(calculator.plus());
                break;
            case 2:
                System.out.println(calculator.minus());
                break;
            case 3:
                System.out.println(calculator.multiply());
                break;
            case 4: {
                System.out.println(calculator.divide());
                if (second == 0) throw new ArithmeticException("Ділення на нуль заборонене");
            }
            break;
            default:
                System.out.println("Невірно введений номер пункту.");
        }
    }
}
