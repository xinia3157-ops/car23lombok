import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;

    public void delivery() {
        quantity++;
    }
    public void sell() {
        if (quantity > 0) {
            quantity--;
        } else {
            System.out.println("No cars available to sell!");
        }
    }
}