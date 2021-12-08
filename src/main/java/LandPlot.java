import java.util.Random;

public class LandPlot {
    private final int width;
    private final int length;
    private final int cost;
    private final Random random = new Random();

    public LandPlot() {
        length = random.nextInt(100) + 60;
        width = random.nextInt(30) + 10;
        cost = length * width * (random.nextInt(1000) + 500);
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Участок длиной " + length +
                " м, шириной " + width +
                " м, стоимостью " + cost +
                " руб.";
    }
}
