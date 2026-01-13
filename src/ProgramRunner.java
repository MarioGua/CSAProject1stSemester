import javax.swing.*;

public class ProgramRunner {
    public static void main(String[] args) {
        System.out.println("Main Logic Runs Here");
        UIHandler ui = new UIHandler();
        Object UiFrame = ui.getFrame();
        ui.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ui.showInfoFrame("Hello, this is a project for csa", "Project");
        String Name  = ui.showQuestionFrame("What's you're name?", "Project");
        System.out.println(Name);


    }
}
