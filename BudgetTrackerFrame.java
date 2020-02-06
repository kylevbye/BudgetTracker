import javax.swing.JFrame;

/**
 * @author  Kyle Bye
 * @version 1.0
 */
@SuppressWarnings("serial") 
public class BudgetTrackerFrame extends JFrame {
    public BudgetTrackerFrame() {
        super("Budget Tracker Frame");
        setBounds(0,0, 800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}