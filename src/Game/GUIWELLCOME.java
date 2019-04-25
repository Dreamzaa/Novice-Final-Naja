package Game;

import Game.GUI.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class GUIWELLCOME {
    private JPanel panel1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton LOGINButton;


    public GUIWELLCOME() {
        LOGINButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText().equals("") && passwordField1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Plese insert your ID and PASSWORD", "Warning", JOptionPane.WARNING_MESSAGE);
                } else if (textField1.getText().equals("") || passwordField1.getText().equals("")) {
                    if (textField1.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Plese insert your ID", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else if (passwordField1.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Plese insert your PASSWORD", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                } else if (textField1.getText().equals("Dreamzeed") && passwordField1.getText().equals("Dreamistyle")) {
                } else if (textField1.getText().equals("Dreamzeed") && passwordField1.getText().equals("Dreamistyle")) {
                    JOptionPane.showMessageDialog(null, "Succees TO LOGIN", "Warning", JOptionPane.WARNING_MESSAGE);
                    GUI a = new GUI();
                    a.load(a);
                    JFrame cur = (JFrame) SwingUtilities.getWindowAncestor(panel1);
                    cur.dispose();
                }
            }
        });
        LOGINButton.registerKeyboardAction(LOGINButton.getActionForKeyStroke(
                KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
                JComponent.WHEN_IN_FOCUSED_WINDOW);

        LOGINButton.registerKeyboardAction(LOGINButton.getActionForKeyStroke(
                KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
                JComponent.WHEN_IN_FOCUSED_WINDOW);
    }

    public static void main(String[] args)
    {

        GUIWELLCOME ui = new GUIWELLCOME();
        ui.load(ui);
    }

    public void load(GUIWELLCOME ui)
    {
        JFrame frame = new JFrame("BladeFlameGame");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane( ui.panel1);
        frame.setResizable(false);
        frame.setPreferredSize(new Dimension(600,400));
        frame.pack();
        frame.setVisible(true);
    }
}
