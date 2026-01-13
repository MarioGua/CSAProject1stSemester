import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class UIHandler {
    final private JFrame frame = new JFrame("Frame");


    public UIHandler(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
    }

    public JFrame getFrame() {
        return frame;
    }

    public void showInfoFrame(String message, String title){
        JOptionPane.showMessageDialog(frame,
                message,
                title,
                JOptionPane.INFORMATION_MESSAGE);
    }

    public String showQuestionFrame(String message, String title){
        String name = JOptionPane.showInputDialog(frame,
                message,
                title,
                JOptionPane.QUESTION_MESSAGE);
        return name;
    }

    public String showWarningFrame(String message, String title){
        String name = JOptionPane.showInputDialog(frame,
                message,
                title,
                JOptionPane.WARNING_MESSAGE);
        return name;
    }

}
