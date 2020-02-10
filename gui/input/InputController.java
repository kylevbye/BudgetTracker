package gui.input;

/**
 * @author Kyle Bye
 */
public class InputController {

    public static InputFrame inputFrame;

    public static void runDeposit() {
        inputFrame = new InputFrame(InputFrame.DEPOSIT_TYPE);
        composeInputFrame();
    }

    public static void runWithdraw() {
        inputFrame = new InputFrame(InputFrame.WITHDRAW_TYPE);
        composeInputFrame();
    }

    public static void close() {
        if (inputFrame != null) {
            inputFrame.setVisible(false);
            inputFrame.dispose();
            inputFrame = null;
        }
    }

    private static void composeInputFrame() {   
        inputFrame.setVisible(true);     
    }
}