package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PotionGui {
    private JPanel panel;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JLabel label;
    private JButton button;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private NOVICS novics;
    public PotionGui(NOVICS nv)
    {
        novics = nv;
        panel = new JPanel();
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        label = new JLabel();
        button = new JButton();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        label.setFont(new Font("Courier New", Font.BOLD, 45));
        label.setText("Select Items");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        button.setFont(new Font("Courier New", Font.BOLD, 35));
        button.setText("Hp Potion");
        button.setHorizontalAlignment(SwingConstants.CENTER);
        button.setVerticalAlignment(SwingConstants.CENTER);
        button1.setFont(new Font("Courier New", Font.BOLD, 35));
        button1.setText("Mana Potion");
        button1.setHorizontalAlignment(SwingConstants.CENTER);
        button1.setVerticalAlignment(SwingConstants.CENTER);
        button2.setFont(new Font("Courier New", Font.BOLD, 35));
        button2.setText("Attack Potion");
        button2.setHorizontalAlignment(SwingConstants.CENTER);
        button2.setVerticalAlignment(SwingConstants.CENTER);
        button3.setFont(new Font("Courier New", Font.BOLD, 35));
        button3.setText("Armor Potion");
        button3.setHorizontalAlignment(SwingConstants.CENTER);
        button3.setVerticalAlignment(SwingConstants.CENTER);
        Potion Hp = new Potion("Hp potion",100);
        Potion Mana = new Potion("Mana potion",80);
        Potion Attack = new Potion("Attack potion",150);
        Potion Armor = new Potion("Armor potion",120);
        panel.setLayout(new GridLayout(5,1));
        panel1.add(button);
        panel2.add(button1);
        panel3.add(button2);
        panel4.add(button3);
        panel.add(label);
        panel.add(panel1);
        panel.add(panel2);
        panel.add(panel3);
        panel.add(panel4);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                novics.Hp += Hp.getStatus();
                JFrame cur = (JFrame) SwingUtilities.getWindowAncestor(panel);
                cur.dispose();
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                novics.Mana += Mana.getStatus();
                JFrame cur1 = (JFrame) SwingUtilities.getWindowAncestor(panel);
                cur1.dispose();
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                novics.novicofattack += Attack.getStatus();
                JFrame cur2 = (JFrame) SwingUtilities.getWindowAncestor(panel);
                cur2.dispose();
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                novics.novicofarmor += Armor.getStatus();
                JFrame cur3 = (JFrame) SwingUtilities.getWindowAncestor(panel);
                cur3.dispose();
            }
        });
    }

    public void run(PotionGui pg){
        JFrame frame = new JFrame("BladeFlameGame");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setContentPane(pg.panel);
        frame.setPreferredSize(new Dimension(640, 480));
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }
}
