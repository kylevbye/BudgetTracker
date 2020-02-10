package gui.input;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author Kyle Bye
 */
@SuppressWarnings("serial")
public class InputInstructionPanel extends JPanel{
    public InputInstructionPanel() {
        super();
        JLabel instructionLabel = new JLabel();
        instructionLabel.setText(
            "Thwow in sum muny por favor $$$$"
        );
        add(instructionLabel);
    }
}
