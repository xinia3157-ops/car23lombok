//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Corolla", "Toyota", 2022, 85000.0, "Red", 5);

        System.out.println(car);

        car.sell();

        System.out.println("Model: " + car.getModel());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Color: " + car.getColor());
        System.out.println("Quantity: " + car.getQuantity());

        car.setColor("Blue");
        car.setPrice(80000.0);
        car.setYear(2023);

        System.out.println(car);
    }
}