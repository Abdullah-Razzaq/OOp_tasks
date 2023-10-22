package InventoryManagementSystem;

public class Seats extends Furniture{
    String loadCapacity;

    public Seats(String id, String name, double price, int stockQuantity, double tax, String dimensions, String material, String loadCapacity) {
        super(id, name, price, stockQuantity, tax, dimensions, material);
        this.loadCapacity = loadCapacity;
    }

    public String getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(String loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public String toString() {
        return "Seats{" +
                "dimensions='" + dimensions + '\'' +
                ", material='" + material + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                ", tax=" + tax +
                ", loadCapacity='" + loadCapacity + '\'' +
                '}';
    }
}
