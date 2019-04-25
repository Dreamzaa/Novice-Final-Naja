package Game.GUI;

        import Game.*;

        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;
        import java.util.ArrayList;
        import java.util.Enumeration;
        import javax.swing.AbstractButton;
        import javax.swing.ButtonGroup;

public class GUI {
    private JPanel panel1;
    private JButton nextButton;
    private JButton backButton;
    private JRadioButton berserkRadioButton;
    private JRadioButton wizardRadioButton;
    private JPanel Panel2;
    private JPanel Panel1;
    private ButtonGroup bg;
    private ImageIcon image;
    private ImageIcon image1;
    private ArrayList<NOVICS> class_list = new ArrayList<>();


    public GUI() {
        NOVICS berserk = new Berserk();
        NOVICS wizard = new Wizard();
        class_list.add(berserk);
        class_list.add(wizard);

        backButton.registerKeyboardAction(backButton.getActionForKeyStroke(
                KeyStroke.getKeyStroke(KeyEvent.VK_HOME, 0, false)),
                KeyStroke.getKeyStroke(KeyEvent.VK_BACK_SLASH, 0, false),
                JComponent.WHEN_IN_FOCUSED_WINDOW);

        backButton.registerKeyboardAction(backButton.getActionForKeyStroke(
                KeyStroke.getKeyStroke(KeyEvent.VK_HOME, 0, true)),
                KeyStroke.getKeyStroke(KeyEvent.VK_BACK_SPACE, 0, true),
                JComponent.WHEN_IN_FOCUSED_WINDOW);

        bg = new ButtonGroup();
        berserkRadioButton.setActionCommand("Berserk");
        wizardRadioButton.setActionCommand("Wizard");
        bg.add(berserkRadioButton);
        bg.add(wizardRadioButton);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUIWELLCOME a = new GUIWELLCOME();
                a.load(a);
                JFrame asd = (JFrame) SwingUtilities.getWindowAncestor(panel1);
                asd.dispose();
            }
        });
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = bg.getSelection().getActionCommand();
                if(class_list != null){
                    for(NOVICS d: class_list){
                        if(d != null && d.getName().equals(selected)) {
                            OptionGame a = new OptionGame(d);
                            a.run(a);
                        }
                    }
                }

                JFrame w = (JFrame) SwingUtilities.getWindowAncestor(panel1);
                w.dispose();
            }
        });
    }

    public void load(GUI ui) {
        JFrame frame = new JFrame("BladeFlameGame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(ui.panel1);
        frame.setPreferredSize(new Dimension(640, 480));
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
        createUIComponents();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        image = new ImageIcon("Game/GUI/berserk.jpg");
        Panel2 = new JPanel();
        Panel2.add(new JLabel(image));
        image1 = new ImageIcon("Game/GUI/wizard.jpg");
        Panel1 = new JPanel();
        Panel1.add(new JLabel(image1));
    }
}




