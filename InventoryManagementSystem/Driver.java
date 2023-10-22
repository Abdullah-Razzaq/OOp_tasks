package InventoryManagementSystem;
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        InventoryManagement inventory=new InventoryManagement();
        Electronics e1= new Electronics("E1","hp victus",30000.0,4,800.0,"2kw","1 year");
        Laptop l1= new Laptop("L1","asus zenbook", 15000.0, 3,600.0,"1kw","1yeaar,","core i9","720px");
        SmartPhone m1= new SmartPhone("M1","samsung", 55000.0, 2,600.0,"3kw","1year","android","12gb");
        Furniture f1= new Furniture("F1","bed", 25000.0, 5,600.0,"6x4","wooden");
        Seats s1= new Seats("S1","sofa", 45000.0, 6,600.0,"2x3","plastic","50kg");
        Table t1= new Table("T1","table", 65000.0, 3,600.0,"4x4","glass","rectangle");
        Grocery g1= new Grocery("G1","protein bar", 5000.0, 7,600.0,"4/4/24","high in nutrition");

        System.out.println("inventory of metro store");

            inventory.addProduct(e1);
            inventory.addProduct(l1);
            inventory.addProduct(m1);
            inventory.addProduct(f1);
            inventory.addProduct(s1);
            inventory.addProduct(t1);
            inventory.addProduct(g1);
            inventory.displayProducts();

        System.out.println("    \n which product you want to remove write its id:");

            inventory.removeProduct(input.nextLine());
            inventory.displayProducts();

        System.out.println("    \n which product you want to search write its id:");

            inventory.searchProducts(input.nextLine());

    }
}

