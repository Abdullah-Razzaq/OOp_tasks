package InventoryManagementSystem;

public class SmartPhone extends Electronics{

    String operatingSystem;
    String ram;

    public SmartPhone(String id, String name, double price, int stockQuantity, double tax, String powerConsumption, String warranty, String operatingSystem, String ram) {
        super(id, name, price, stockQuantity, tax, powerConsumption, warranty);
        this.operatingSystem = operatingSystem;
        this.ram = ram;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }


    public String toString() {
        return "SmartPhone{" +
                "powerConsumption='" + powerConsumption + '\'' +
                ", warranty='" + warranty + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                ", tax=" + tax +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }
}
