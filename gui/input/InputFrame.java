package gui.input;

import javax.swing.JFrame;

/**
 * @author Kyle Bye
 */
@SuppressWarnings("serial")
public class InputFrame extends JFrame {

    public static final int DEPOSIT_TYPE = 0;
    public static final int WITHDRAW_TYPE = 1;

    public InputFrame(int inputFrameType) {
        super();

        if (inputFrameType == DEPOSIT_TYPE) {
            constructDepositFrame();
        }
        else if (inputFrameType == WITHDRAW_TYPE) {
            constructWithdrawFrame();
        }
        else {
            // Throw error
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 300);
        // layout

        InputPanel inputPanel = new InputPanel();
        add(inputPanel);
        pack();
    }

    private void constructDepositFrame() {
        setTitle("Deposit");
    }

    private void constructWithdrawFrame() {
        setTitle("Withdraw");
    }

}