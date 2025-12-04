import java.util.List;

/**
 * Варіант 11 – Кава.
 */
public class Lab5Inheritance {

    public static void main(String[] args) {

        try {

            Van van = new Van();

            van.addCoffee(new BeanCoffee("Arabica зерно", 1.2, 450, 9));
            van.addCoffee(new GroundCoffee("Lavazza мелена", 0.8, 320, 8));
            van.addCoffee(new InstantCoffee("Nescafe розчинна", 0.5, 210, 6));
            van.addCoffee(new BeanCoffee("Colombia зерно", 1.5, 530, 10));
            van.addCoffee(new GroundCoffee("Jacobs мелена", 1.0, 350, 7));

            System.out.println("Вміст фургона:");
            van.printCargo();

            double totalPrice = van.calculateTotalPrice();
            System.out.println("\nЗагальна вартість вантажу: " + totalPrice + " грн");

            van.sortByPriceToWeight();
            System.out.println("\nВідсортовано за співвідношенням ціни до ваги:");
            van.printCargo();

            System.out.println("\nКава з якістю від 7 до 9:");
            List<Coffee> result = van.findByQuality(7, 9);

            for (Coffee coffee : result) {
                System.out.println(coffee);
            }

        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
