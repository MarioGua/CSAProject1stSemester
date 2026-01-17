import java.util.HashMap;
import java.util.Map;

public class Locations {
    private Map<String, String> Locations = new HashMap<>();
    private Map<String, String> Attributes = new HashMap<>();
    private String currentLocation = "";
    private String currentLocationDescription = "";



    public Locations(){
        Locations.put("City", "A very dense and populated area where people get to hang out and discover new things everyday.");
        Locations.put("Forest", "A normal forest");
        Locations.put("Desert", "Very hot, make sure you drink something or else you might get sick");

    }

    public String getCurrentLocation(){
        return currentLocation;
    }

    public void changeLocation(String Location){
        for (Map.Entry<String, String> entry : Locations.entrySet()) {
            if (entry.getKey().equals(Location)){
                currentLocation = Location;
                currentLocationDescription = entry.getValue();

                System.out.println("You've moved to " + currentLocation + ".");
                break;
            }

        }
    }

    public void displayLocation(){
        System.out.println(currentLocation + ": " + currentLocationDescription);
    }
}
