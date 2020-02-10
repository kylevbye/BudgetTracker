package gui.input;

import javax.swing.JPanel;
import java.awt.BorderLayout;

/**
 * @author Kyle Bye
 */
@SuppressWarnings("serial")
public class InputPanel extends JPanel {

    
    public InputPanel() {
        super();
        setLayout(new BorderLayout());

        InputInstructionPanel instructionPanel = new InputInstructionPanel();
        add(instructionPanel, BorderLayout.NORTH);

        InputTextPanel textPanel = new InputTextPanel();
        add(textPanel, BorderLayout.CENTER);

        InputButtonPanel buttonPanel = new InputButtonPanel();
        add(buttonPanel, BorderLayout.PAGE_END);
    }

}