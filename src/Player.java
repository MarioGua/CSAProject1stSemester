import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Player {
    private String name = "";
    private String currentItem = "";

    private int thirstLevel = 100;
    private int currentHealth = 100;
    private int maxInventorySpace = 10;

    private ArrayList<String> inventory = new ArrayList<>();


    public Player(String name, int maxInventorySpace){
        this.name = name;
        this.maxInventorySpace = maxInventorySpace;
    }

    public Player(String name){
        this.name = name;
    }

    public Player(){
        name = "Default-10";
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrentItem() {
        return currentItem;
    }

    public void setCurrentItem(String currentItem) {
        this.currentItem = currentItem;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }
    public int getThirstLevel(){ return thirstLevel;}

    public int getMaxInventorySpace() {
        return maxInventorySpace;
    }

    public ArrayList<String> getInventory() {
        return inventory;
    }



    public void removeItemFromInventory(String item){
        inventory.add(item);
    }

    public void addItemFromInventory(Item item){
        inventory.remove(item);
    }










}
