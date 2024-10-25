package Week3;
import java.util.ArrayList;
import java.util.Scanner;


public class SearchInventory {

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Product2> inventory = getInventory();

        System.out.println("We carry the following inventory: ");

        for (int i = 0; i < inventory.size(); i++) {
            Product2 p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f",
                    p.getId(), p.getName(), p.getPrice());
        }
    }
    public static ArrayList<Product2> getInventory() {
        ArrayList<Product2> inventory = new ArrayList<Product2>();
        inventory.add(new Product2(12,"Chariot",349.99f));
        inventory.add(new Product2(13,"Medieval Armor", 500.99f));
        inventory.add(new Product2(14,"Sword and Shield Set", 8999.99f));
        inventory.add(new Product2(15,"Mario Costume", 94.99f));
        inventory.add(new Product2(16,"Marble Statue of Lebron", 19999.99f));
        return inventory;
    }
}

