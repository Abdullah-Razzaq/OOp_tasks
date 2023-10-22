package InventoryManagementSystem;

public class InventoryManagement {
    Product[] products;
    int CurrentProducts;

    InventoryManagement(){
        products = new Product[100];
    }
    public void addProduct(Product p) {
        if (CurrentProducts < 100) {
            products[CurrentProducts++] = p;
        } else {
            System.out.println("Inventory is full");
        }
    }

    public void removeProduct(String p) {
        int flag = 0;
        for (int i = 0; i < CurrentProducts; i++) {
            if (p.equals(products[i].id))
            {
                for (int j = i; j < CurrentProducts - 1; j++) {
                    products[j] = products[j + 1];
                }
                products[CurrentProducts - 1] = null;
                CurrentProducts--;
                flag = 1;
                break;
            }
        }
        if (flag==0)
            System.out.println("There is no product named '"+ p +"' in inventory");

    }
    public void displayProducts() {
        if (CurrentProducts == 0) {
            System.out.println("Inventory is empty");
        } else {

            System.out.println("List of Products:");
            for (int i = 0; i < CurrentProducts; i++) {
                System.out.println(products[i]);
            }
        }
    }

    public void searchProducts(String p){
        int flag = 0;
        for (Product product:products){
            if (product != null){
                if (product.id.equals(p)) {
                    System.out.println("Product found:");
                    System.out.println(product);
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0)
            System.out.println("Product not found!");
    }

}


