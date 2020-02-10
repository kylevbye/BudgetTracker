package gui.main;
import javax.swing.JFrame;
import java.awt.BorderLayout;

/**
 * @author  Kyle Bye
 * @version 1.0
 */
@SuppressWarnings("serial") 
class MainFrame extends JFrame {

    public MainFrame() {
        super();
        setBounds(0,0, 600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Budget Tracker");
        setLayout(new BorderLayout());
    }
}