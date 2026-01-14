import javax.swing.*;

public class ProgramRunner {
    public static void main(String[] args) {
        System.out.println("Main Logic Runs Here");
        UIHandler ui = new UIHandler();
        ui.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ui.showWarningFrame("Warning", "Warning");



    }
}
