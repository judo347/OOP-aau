package problem6;

public class Pear implements Fruit {
    @Override
    public String getColor() {
        return "Yellow";
    }

    @Override
    public String getTaste() {
        return "Sweet";
    }

    @Override
    public int getCalorieCount() {
        return 10000;
    }
}
