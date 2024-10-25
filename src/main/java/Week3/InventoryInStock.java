package Week3;
import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventoryInStock {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            //Here im trying to read the file containing my inventory
            FileReader fileReader = new FileReader("Inventory.txt");

            //I'm using buffered reader because I used it in my last assignment
            BufferedReader bufReader = new BufferedReader(fileReader);

            String inventory = bufReader.readLine();

            Map<String, Product2> productMap = new HashMap<>();



            while ((inventory = bufReader.readLine()) != null) {
                // I make an array to make list everything in the file
                String[] invArray = inventory.split("\\|");
                //I am instantiating a product to be able to map out the products
                Product2 p = new Product2(Integer.parseInt(invArray[0]),invArray[1],Double.parseDouble(invArray[2]));
                //Adding items from invArray into hashmap
                productMap.put(invArray[1],p);
                }

            System.out.println("We carry the following inventory: ");
            for(String items: productMap.keySet()){
                System.out.println( "\n" + productMap.get(items).getName());
            }


            System.out.print("What item are you interested in?:");
            String item = input.nextLine();
            //Im using productmap only because it comes with methods to check if something is contained within the list
            if((productMap.containsKey(item))){
                System.out.println("We have that item!");
            }else {
                System.out.println("We don't have that item sorry");
            }
            System.out.println("Would you like to search for another item? (y/n) ");
            String select = input.nextLine();



            //if statement to check if product equals anything in hashmap after while

            //make a loop to be able to print product list after every commaB

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}