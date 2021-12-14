package JavaCollection.Map;

import java.util.HashMap;
import java.util.Map;

public class mapIntro {
    public static void main(String[] args) {
        Map<String, String> plates = new HashMap<>();
        plates.put("CA", "Cherkassy");
        plates.put("BA", "Vinnytsia");
        plates.put("BH", "Odessa");
        plates.put("AK", "Kyiv");

        if (plates.containsKey("AK")) {
            String region = plates.get("AK");
            System.out.println("AK is " + region + " region is going to be removed.");
            plates.remove("AK");
            System.out.println("Updated map : " + plates);
            for(String a: plates.keySet()) {
                for(String b: plates.values())
                System.out.print(a + " --> " + b);

            }
        }


        /*String region = plates.get("CA");
        if(region.equals("Cherkassy"))
            plates.put("CA","Uman");
        System.out.println(region);
        System.out.println(plates.get("CA"));*/


    }
}
