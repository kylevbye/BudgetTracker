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

    private static void composeInputFrame() {
        
    }
}