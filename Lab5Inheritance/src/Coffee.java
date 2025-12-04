/**
 * Абстрактний базовий клас для всіх типів кави.
 */
public abstract class Coffee {

    protected String name;
    protected double weight;
    protected double price;
    protected int quality;

    public Coffee(String name, double weight, double price, int quality) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.quality = quality;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public int getQuality() {
        return quality;
    }

    public double getPriceToWeightRatio() {
        return price / weight;
    }

    @Override
    public String toString() {
        return name +
                " | вага=" + weight +
                " кг | ціна=" + price +
                " грн | якість=" + quality;
    }
}

