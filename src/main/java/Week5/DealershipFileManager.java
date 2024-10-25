package Week5;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class DealershipFileManager {
    static FileReader fileReader;
    static ArrayList<Dealership> dealershipList = new ArrayList<>();
    static {
        try {
            fileReader = new FileReader("inventoryCar.csv");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static FileWriter writer;
    static BufferedReader buffReader = new BufferedReader(fileReader);

    public void getDealership() throws IOException {
        try {
            fileReader = new FileReader("inventoryCar.csv");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            writer = new FileWriter("inventoryCar.csv", true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String line;
        Dealership currentDealership = null;
        while ((line = buffReader.readLine()) != null) {

            String[] lineArray = line.split("\\|");

            if(Character.isDigit(lineArray[0].charAt(0))){
                currentDealership.getInventory().add(new Vehicle(Integer.parseInt(lineArray[0]), Integer.parseInt(lineArray[1]), lineArray[2], lineArray[3], lineArray[4], lineArray[5], Integer.parseInt(lineArray[6]), Double.parseDouble(lineArray[7])));
            }else{
                System.out.println(lineArray[0]);
                Dealership dealership = new Dealership(lineArray[0], lineArray[1], lineArray[2], new ArrayList<>());
                currentDealership = dealership;
                dealershipList.add(dealership);

            }

        }
    }
    public void saveDealership(){

    }
}
