package Week5;

import java.util.Scanner;
import java.util.function.Supplier;

public class Product {
    Scanner input = new Scanner(System.in);
    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }



    public Product(int iD, int stockQuantity, String name, String description, String supplier){
        this.iD = iD;
        this.stockQuantity = stockQuantity;
        this.name = name;
        this.description = description;
        this.productCode = productCode;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Product(String supplier) {
        this.supplier = supplier;
    }

    private String supplier = "CesarCheezer";
    private int stockQuantity;
    private String name;
    private String description;
    private String productCode;
    private int iD;

    public void supplierCode(){
        int truncatedRando = (int) (Math.random() * 1000);
        productCode = supplier.substring(0,3) + name.substring(0,3) + truncatedRando;
        System.out.println(productCode);
    }

    public void inStock(){
        System.out.println("How much of " + name + " do you need?");
        int quantity = input.nextInt();

        if (quantity > stockQuantity) {
            System.out.println("We dont have that many sorry");
        }else {
            stockQuantity = stockQuantity - quantity;
            System.out.println("Congrats we have enough " + name + " Your order has been placed. We have " + stockQuantity + " " + name + "'s left!");
        }

    }
}
