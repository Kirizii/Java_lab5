import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Клас-фургон, який зберігає вантаж кави.
 */
public class Van {

    private final List<Coffee> cargo = new ArrayList<>();

    public void addCoffee(Coffee coffee) {
        cargo.add(coffee);
    }

    /**
     * Підрахунок загальної вартості вантажу.
     */
    public double calculateTotalPrice() {
        double sum = 0;
        for (Coffee coffee : cargo) {
            sum += coffee.getPrice();
        }
        return sum;
    }

    /**
     * Сортування за співвідношенням ціни до ваги.
     */
    public void sortByPriceToWeight() {
        cargo.sort(Comparator.comparingDouble(Coffee::getPriceToWeightRatio));
    }

    /**
     * Пошук кави за діапазоном якості.
     */
    public List<Coffee> findByQuality(int min, int max) {

        List<Coffee> result = new ArrayList<>();

        for (Coffee coffee : cargo) {
            if (coffee.getQuality() >= min && coffee.getQuality() <= max) {
                result.add(coffee);
            }
        }
        return result;
    }

    public void printCargo() {
        for (Coffee coffee : cargo) {
            System.out.println(coffee);
        }
    }
}

