package InventoryManagementSystem;

public class Furniture extends Product {
    String dimensions;
    String material;

    public Furniture(String id, String name, double price, int stockQuantity, double tax, String dimensions, String material) {
        super(id, name, price, stockQuantity, tax);
        this.dimensions = dimensions;
        this.material = material;
    }

    public String getDimensions() {
        return dimensions;
    }


    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String toString() {
        return "Furniture{" +
                "dimensions='" + dimensions + '\'' +
                ", material='" + material + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                ", tax=" + tax +
                '}';
    }
}
