package carDealershipWorkshop;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DealershipFileManager {
    public static HashMap<Dealership, Vehicle> dataMap = new HashMap<>();

    static FileReader fileReader;
    ArrayList<Dealership> dealershipList = new ArrayList<>();
    static {
        try {
            fileReader = new FileReader("inventoryCar.csv");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static FileWriter writer;
    static BufferedReader buffReader = new BufferedReader(fileReader);

    public List<Dealership> getDealership() throws IOException {
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
                Dealership dealership = new Dealership(lineArray[0], lineArray[1], lineArray[2], new ArrayList<>());
                currentDealership = dealership;
                //need to find a way to store old dealership preferably as a method
                //need a hash map as <dealership key/string name of dealership, list of vehicles>
                dealershipList.add(dealership);
                //seperate array list for every dealership
                //do while loop take first index 0 as name then until i hit a string then end loop
                //cant
            }

        }
        return dealershipList;
    }
    public void saveDealership(){

    }
}
