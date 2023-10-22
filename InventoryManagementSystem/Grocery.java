package InventoryManagementSystem;

public class Grocery extends Product{
    String expiryDate;
    String nutritionalValue;

    public Grocery(String id, String name, double price, int stockQuantity, double tax, String expiryDate, String nutritionalValue) {
        super(id, name, price, stockQuantity, tax);
        this.expiryDate = expiryDate;
        this.nutritionalValue = nutritionalValue;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getNutritionalValue() {
        return nutritionalValue;
    }

    public void setNutritionalValue(String nutritionalValue) {
        this.nutritionalValue = nutritionalValue;
    }

    public String toString() {
        return "Grocery{" +
                "expiryDate='" + expiryDate + '\'' +
                ", nutritionalValue='" + nutritionalValue + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                ", tax=" + tax +
                '}';
    }
}
