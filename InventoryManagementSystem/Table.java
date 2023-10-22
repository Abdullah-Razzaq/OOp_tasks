package InventoryManagementSystem;

public class Table extends Furniture {
    String shape;

    public Table(String id, String name, double price, int stockQuantity, double tax, String dimensions, String material, String shape) {
        super(id, name, price, stockQuantity, tax, dimensions, material);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
    public String toString() {
        return "Table{" +
                "dimensions='" + dimensions + '\'' +
                ", material='" + material + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                ", tax=" + tax +
                ", shape='" + shape + '\'' +
                '}';
    }
}
