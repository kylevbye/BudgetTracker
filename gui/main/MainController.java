package gui.main;

import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

import java.awt.event.ActionEvent;

import gui.main.*;

/**
 * 
 */
public class MainController {

    private static MainFrame mainFrame;

    public static void run() {
        if (mainFrame == null) {
            mainFrame = new MainFrame();
            composeMainFrame();
            mainFrame.setVisible(true);
        }

    }

    private static void composeMainFrame() {
        MainPanel mainPanel = new MainPanel();
        //mainPanel.setBounds(mainFrame.getBounds());
        mainPanel.setSize(mainFrame.getSize());

        mainFrame.add(mainPanel,SwingConstants.CENTER);
    }

}