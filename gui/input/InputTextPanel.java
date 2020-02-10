package gui.input;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

/**
 * @author Kyle Bye
 */
@SuppressWarnings("serial")
public class InputTextPanel extends JPanel implements ActionListener {

    private char[] currencySymbols = {
        '$', new Character('\u20AC')
    };

    private char[] numericChars = {
        '0', '1', '2', '3', '4', 
        '5', '6', '7', '8', '9',
        '.', ','
    };

    private JComboBox<Character> comboBox;
    private JTextField textField;

    public String retrieveInput() {
        String returnString = new String();

        returnString += comboBox.getSelectedItem().toString();
        returnString += textField.getText();

        return returnString;
    }

    public InputTextPanel() {
        super();
        setLayout(new BorderLayout());

        // Set up a panel for the ComboBox and
        // textfield
        JPanel hPanel = new JPanel(new FlowLayout());
 
        // Setting up ComboBox
        comboBox = new JComboBox<Character>();

        for (char c : currencySymbols) {
            comboBox.addItem(c);
        }

        comboBox.setEditable(false);
        hPanel.add(comboBox);

        // Setting up JTextfield
        textField = new JTextField();
        textField.setText("0.00");
        textField.setFont(textField.getFont().deriveFont(Font.PLAIN, 16));
        textField.addActionListener(this);
        textField.setColumns(9);
        textField.setHorizontalAlignment(textField.CENTER);
        hPanel.add(textField);

        //
        add(hPanel, BorderLayout.CENTER);

    }
    
    public void actionPerformed(ActionEvent ae) {
        String filteredText = new String();
        String text = textField.getText();

        for (int i = 0; i<text.length(); ++i) {

            char textC = text.charAt(i);
            boolean isNumeric = false;

            for (char numericChar : numericChars) {

                if (numericChar == textC) {
                    isNumeric = true;
                    break;

                }

            }

            if (isNumeric) filteredText += textC;

        }
        textField.setText(filteredText);
    }
}