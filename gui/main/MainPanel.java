package gui.main;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class MainPanel extends JPanel {

    private JLabel budgetLabel;

    public JLabel getBudgetLabel() {
        return budgetLabel;
    }

    public MainPanel() {
        super();
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        // Budget Label
        budgetLabel = new JLabel();
        budgetLabel.setText("$$$");
        add(budgetLabel);

        // Deposit Button
        JButton depositButton = new JButton();
        depositButton.setText("Desposit");
        depositButton.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    System.out.println("Deposit Button Pressed...");
                }
            }
        );
        add(depositButton);

        // Withdraw Button

        // History Button

    }
}