import java.util.ArrayList;



public class Player {
    private String name = "";
    private String currentItem = "";

    private int currentHealth = 100;
    private int maxInventorySpace = 10;

    private ArrayList<String> inventory = new ArrayList<>();

    public Player(String name, int maxInventorySpace){
        this.name = name;
        this.maxInventorySpace = maxInventorySpace;
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

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getMaxInventorySpace() {
        return maxInventorySpace;
    }

    public void setMaxInventorySpace(int maxInventorySpace) {
        this.maxInventorySpace = maxInventorySpace;
    }

    public ArrayList<String> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<String> inventory) {
        this.inventory = inventory;
    }









}
