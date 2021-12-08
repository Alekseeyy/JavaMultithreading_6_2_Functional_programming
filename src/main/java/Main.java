import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    private static final int PLOTS = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цену участка за кв.м (от 500 до 1499):");
        int price = scanner.nextInt();
        List<LandPlot> landPlots = new ArrayList<>();
        for (int i = 0; i < PLOTS; i++) {
            landPlots.add(new LandPlot());
        }
        System.out.println("Список участков с ценой, не более " + price + " рублей за кв.м:");
        landPlots.stream()
                .filter(a -> a.getCost() / (a.getLength() * a.getWidth()) <= price)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
