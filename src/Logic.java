import java.util.Scanner;

public class Logic {
    private Player player = null;
    private boolean endGame = false;
    private Scanner scanner = new Scanner(System.in);
    private Locations locations = new Locations();
    public Logic(){}

    public void executeGame(Player plr){
        player = plr;
        System.out.println("Hello " + player.getName() + "!");
        try {
            // Pause for 3 seconds (3000 milliseconds)
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // Handle the exception if the thread is interrupted
            System.out.println("The thread was interrupted!");
            Thread.currentThread().interrupt(); // Restore the interrupt status
        }
        while (!endGame){
            System.out.println(locations.getCurrentLocation());
        }
    }

    private void setEndGame(boolean value){
        endGame = value;
    }

    private void getEndGame(){
        boolean endGame;
    }

    private void displayKeybinds(){

    }

}
