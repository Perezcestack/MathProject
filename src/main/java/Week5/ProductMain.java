package Week5;

import java.util.Scanner;

public class ProductMain {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Product jellyBeans = new Product(203,42, "Fruity Tooty", "Delicious fruit flavored jelly beans", "CesarCheezer");
        System.out.println("Hello our product code is " );
        jellyBeans.supplierCode();
        jellyBeans.inStock();

    }
}
