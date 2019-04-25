package Game.GUI;

import Game.Berserk;
import Game.GUI.GUI;
import Game.NOVICS;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Mystatus {
    private JLabel Hp;
    private JLabel Mana;
    private JLabel Level;
    private JLabel Myattack;
    private JLabel Myarmor;
    private JLabel Status;
    private JLabel Class;
    private JLabel Kill;
    private NOVICS novics;
    private JPanel panel;

    public Mystatus(NOVICS nov)
    {

        novics = nov;
        Hp = new JLabel();
        Mana = new JLabel();
        Level = new JLabel();
        Myattack = new JLabel();
        Myarmor = new JLabel();
        Status = new JLabel();

        Class = new JLabel();
        Kill = new JLabel();
        panel = new JPanel();
        Status.setFont(new Font("Courier New", Font.BOLD, 20));
        Status.setText("Status ");
        Status.setHorizontalAlignment(SwingConstants.CENTER);
        Status.setVerticalAlignment(SwingConstants.CENTER);
        Hp.setFont(new Font("Courier New", Font.BOLD, 18));
        Hp.setText("My Hp: " + novics.gethpnovic());
        Hp.setHorizontalAlignment(SwingConstants.CENTER);
        Hp.setVerticalAlignment(SwingConstants.CENTER);
        Mana.setFont(new Font("Courier New", Font.BOLD, 18));
        Mana.setText("My Mana: " + novics.getMananovic());
        Mana.setHorizontalAlignment(SwingConstants.CENTER);
        Mana.setVerticalAlignment(SwingConstants.CENTER);
        Level.setFont(new Font("Courier New", Font.BOLD, 18));
        Level.setText("My Level: " + novics.getLvnovic());
        Level.setHorizontalAlignment(SwingConstants.CENTER);
        Level.setVerticalAlignment(SwingConstants.CENTER);
        Myattack.setFont(new Font("Courier New", Font.BOLD, 18));
        Myattack.setText("My Attack: " + novics.getNovicofattack());
        Myattack.setHorizontalAlignment(SwingConstants.CENTER);
        Myattack.setVerticalAlignment(SwingConstants.CENTER);
        Myarmor.setFont(new Font("Courier New", Font.BOLD, 18));
        Myarmor.setText("My Armor: " + novics.getNovicofarmor());
        Myarmor.setHorizontalAlignment(SwingConstants.CENTER);
        Myarmor.setVerticalAlignment(SwingConstants.CENTER);
        Kill.setFont(new Font("Courier New", Font.BOLD, 18));
        Kill.setText("Kill: " + novics.getKillmons());
        Kill.setHorizontalAlignment(SwingConstants.CENTER);
        Kill.setVerticalAlignment(SwingConstants.CENTER);
        panel.setLayout(new GridLayout(9,1,10,20));
        panel.add(Status);
        panel.add(Hp);
        panel.add(Mana);
        panel.add(Level);
        panel.add(Myattack);
        panel.add(Myarmor);

            if(novics.getName().equals("Berserk"))
            {
                Class.setFont(new Font("Courier New", Font.BOLD, 18));
                Class.setText("Class: Berserk");
                Class.setHorizontalAlignment(SwingConstants.CENTER);
                Class.setVerticalAlignment(SwingConstants.CENTER);
                panel.add(Class);
            }
            else if(novics.getName().equals("Wizard"))
            {
                Class.setFont(new Font("Courier New", Font.BOLD, 18));
                Class.setText("Class: Wizard");
                Class.setHorizontalAlignment(SwingConstants.CENTER);
                Class.setVerticalAlignment(SwingConstants.CENTER);
                panel.add(Class);
            }
        panel.add(Kill);
    }

    public void load(Mystatus ui) {
        JFrame frame = new JFrame("BladeFlameGame");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setContentPane(ui.panel);
        frame.setPreferredSize(new Dimension(640, 480));
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }

    public void update(){

        Status.setText("Status ");

        Hp.setText("My Hp: " + novics.gethpnovic());

        Mana.setText("My Mana: " + novics.getMananovic());

        Level.setText("My Level: " + novics.getLvnovic());

        Myattack.setText("My Attack: " + novics.getNovicofattack());

        Myarmor.setText("My Armor: " + novics.getNovicofarmor());

        Kill.setText("Kill: " + novics.killmons);
    }
}
