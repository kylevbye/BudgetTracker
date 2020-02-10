package gui.input;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
/**
 * @author Kyle Bye
 */
public class InputButtonPanel extends JPanel {
    public InputButtonPanel() {
        // Ok Button
        JButton okButton = new JButton();
        okButton.setText("Ok");
        okButton.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    System.out.println("Ok button clicked...");
                    InputController.close();
                }
            }
        );
        add(okButton);

        // Cancel Button
        JButton cancelButton = new JButton();
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    System.out.println("Cancel button clicked...");
                    InputController.close();
                }
            }
        );
        add(cancelButton);


    }
}