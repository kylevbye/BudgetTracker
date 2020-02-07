package gui.main;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.color.*;
import java.awt.font.*;

@SuppressWarnings("serial") 
public class BudgetLabel extends JLabel {
    public BudgetLabel() {
        super();
        setText("$$$");
        setHorizontalAlignment(SwingConstants.CENTER);
    }
}