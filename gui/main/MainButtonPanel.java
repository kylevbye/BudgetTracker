package gui.main;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @author
 */
public class MainButtonPanel extends JPanel {

    public MainButtonPanel() {
        super();
        setLayout(new FlowLayout());

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

        
        // Withdraw Button
        JButton withdrawButton = new JButton();
        withdrawButton.setText("Withdraw");
        withdrawButton.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    System.out.println("Withdraw Button Pressed...");
                }
            }
        );

        // History Button
        JButton historyButton = new JButton();
        historyButton.setText("History");
        historyButton.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    System.out.println("History Button Pressed...");
                }
            }
        );

        add(depositButton);
        add(withdrawButton);
        add(historyButton);
    }
}