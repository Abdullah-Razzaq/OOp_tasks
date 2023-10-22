package InventoryManagementSystem;

public class Laptop extends Electronics{
    String processor;
    String camera;

    public Laptop(String id, String name, double price, int stockQuantity, double tax, String powerConsumption, String warranty, String processor, String camera) {
        super(id, name, price, stockQuantity, tax, powerConsumption, warranty);
        this.processor = processor;
        this.camera = camera;

    }

    public String getProcessor() {
        return processor;
    }


    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String toString() {
        return "Laptop{" +
                "powerConsumption='" + powerConsumption + '\'' +
                ", warranty='" + warranty + '\'' +
                ", processor='" + processor + '\'' +
                ", camera='" + camera + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                ", tax=" + tax +
                '}';
    }

}
