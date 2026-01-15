import java.util.HashMap;
import java.util.Map;

public class Locations {
    private Map<String, String> Locations = new HashMap<>();
    private Map<String, String[]> Attributes = new HashMap<>();
    private String currentLocation = "";



    public Locations(){
        Locations.put("City", "A very dense and populated area where people get to hang out and discover new things everyday.");
        Locations.put("Forest", "A normal forest");
        Locations.put("Desert", "Very hot, make sure you eat something or else you might get sick");
    }

    public String getCurrentLocation(){
        return currentLocation;
    }

    public void changeLocation(String Location){
        currentLocation = Location;
        System.out.println("You've moved to " + currentLocation + ".");
    }
}
