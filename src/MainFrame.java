import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MainFrame extends JFrame{
    public void init(){
        setTitle("Pomodoro Suzdalenko");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
