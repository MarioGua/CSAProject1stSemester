import javax.swing.JOptionPane;
import javax.swing.JFrame;


public class UIHandler {
    private JFrame frame = new JFrame("Frame");


    public UIHandler(){ }

    public JFrame getFrame() {
        return frame;
    }

    public void showFrame(String message, String title){
        JOptionPane.showMessageDialog(frame,
                message,
                title,
                JOptionPane.INFORMATION_MESSAGE);
    }

    public String showInputFrame(String message, String title){
        String name = JOptionPane.showInputDialog(frame,
                message,
                title,
                JOptionPane.QUESTION_MESSAGE);
        return name;
    }

}
