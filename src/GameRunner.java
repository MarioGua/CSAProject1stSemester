import java.util.Scanner;
import javax.sound.sampled.*;
import java.io.File;



public class GameRunner {
    public static void main(String[] args) {
//        // ... inside your method ...
//        try {
//            File audioFile = new File("src/audio.wav");
//            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
//            Clip clip = AudioSystem.getClip();
//            clip.open(audioStream);
//            clip.start(); // Plays the music
//            // Thread.sleep(clip.getMicrosecondLength() / 1000); // Keep program alive
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        Logic logic = new Logic();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give yourself a name: ");
        String input = scanner.nextLine();
        Player player = new Player(input);



        logic.executeGame(player);
    }
}
