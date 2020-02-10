package gui.main;

import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.font.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class MainPanel extends JPanel {

    private JLabel budgetLabel;

    public JLabel getBudgetLabel() {
        return budgetLabel;
    }

    public MainPanel() {
        super();
        //setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setLayout(new BorderLayout());

        // JButton Panel
        MainButtonPanel buttonPanel = new MainButtonPanel();

        // Budget Label
        budgetLabel = new JLabel();
        buttonPanel.setSize(500, 300);
        budgetLabel.setText("$$$");
        budgetLabel.setHorizontalAlignment(JLabel.CENTER);
        budgetLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));

        add(budgetLabel, BorderLayout.CENTER);

        add(buttonPanel, BorderLayout.SOUTH);

    }
}