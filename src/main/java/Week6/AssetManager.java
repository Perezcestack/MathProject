package Week6;

import java.util.ArrayList;

public class AssetManager {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();
        House vacationHome = new House("4 story Home in San Francisco, luxury everything with rooftop pool",
                "12/03/2000",1500000.00,"892 123 main",4,2000,1000);
        House realHome = new House("4 story Home in New York, luxury everything with gym theatre and rooftop pool",
                "12/03/2000",1500000.00,"892 123 main",3,3000,2000);
        assets.add(vacationHome);
        assets.add(realHome);

        for(Asset asset: assets){
            System.out.println(asset.getValue());
        }

    }
}
