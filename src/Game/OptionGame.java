package Game;

import Game.GUI.Mystatus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionGame {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JLabel label;
    private JPanel panel;
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    private NOVICS NOA;

    public OptionGame(NOVICS NOAV)
    {
        NOA = NOAV;
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        label = new JLabel();
        panel = new JPanel();
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        label.setFont(new Font("Courier New", Font.BOLD, 24));
        label.setText("BladeFlame Fighter");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        button1.setFont(new Font("Courier New", Font.BOLD, 20));
        button1.setText("Your Status");
        button1.setFont(new Font("Courier New", Font.BOLD, 20));
        button1.setText("Your Status");
        button2.setFont(new Font("Courier New", Font.BOLD, 20));
        button2.setText("Fight Monster");
        button3.setFont(new Font("Courier New", Font.BOLD, 20));
        button3.setText("Use potion");
        button4.setFont(new Font("Courier New", Font.BOLD, 20));
        button4.setText("Select class or Change class");
        panel.setLayout(new GridLayout(6,1,10,20));
        p1.add(button1);
        p2.add(button2);
        p3.add(button3);
        p4.add(button4);
        panel.add(label);
        panel.add(p1);
        panel.add(p2);
        panel.add(p3);
        panel.add(p4);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Mystatus a = new Mystatus(NOA);
                a.load(a);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MonsterGui a = new MonsterGui(NOA);
                a.run(a);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PotionGui a = new PotionGui(NOA);
                a.run(a);
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Changeclass a = new Changeclass(NOA);
                a.run(a);
                JFrame cur = (JFrame) SwingUtilities.getWindowAncestor(panel);
                cur.dispose();
            }
        });
    }

    public void run(OptionGame ui) {
        JFrame frame = new JFrame("BladeFlameGame");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setContentPane(ui.panel);
        frame.setPreferredSize(new Dimension(640, 480));
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }
}
