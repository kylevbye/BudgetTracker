package gui.input;

import javax.swing.JFrame;

/**
 * @author Kyle Bye
 */
public class InputFrame extends JFrame {

    public final int DEPOSIT_TYPE;
    public final int WITHDRAW_TYPE;

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

    }

    private constructDepositFrame() {
        setTitle("Deposit");
    }

    private constructWithdrawFrame() {
        setTitle("Withdraw");
    }

}