package Game;

import Game.GUI.Mystatus;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import java.util.Random;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MonsterGui {
    private JPanel panel;
    private JPanel panel1;
    private JList MonsList;
    private JButton attack;
    private JLabel Monsname;
    private JLabel Monslevel;
    private JLabel MonsHp;
    private NOVICS novice;
    private ArrayList<Monster1> monslist = new ArrayList<Monster1>();
    private String[] monster_list;

    public MonsterGui(NOVICS as)
    {

        novice = as;
        panel = new JPanel();
        panel1 = new JPanel();
        MonsList = new JList<>();
        attack = new JButton("Attack!!!");
        Monsname = new JLabel();
        Monslevel = new JLabel();
        MonsHp = new JLabel();

        MonsList.setFont(new java.awt.Font("Sylfaen", 0, 18));
        Monster1 Poring = new Monster1("Poring", 1, 100);
        Monster1 Lunatic = new Monster1("Lunatic", 2, 130);
        Monster1 Tarou = new Monster1("Tarou", 3, 150);
        Monster1 ThiefBug = new Monster1("Thief Bug", 2, 120);
        Monster1 Baker = new Monster1("Baker", 6, 200);
        Monster1 Slayer = new Monster1("Slayer", 9, 550);
        Monster1 Reggar = new Monster1("Reggar",8,450);
        Monster1 Slideup = new Monster1("Slideup",5,250);
        Monster1 Mandragora = new Monster1("Mandragora", 5, 350);
        Monster1 Exnologear = new Monster1("Exnologear",8,500);
        Monster1 Medusa = new Monster1("Medusa",6,400);
        Monster1 Kraken = new Monster1("Kraken",7,450);
        Monster1 Chimera = new Monster1("Chimera",5,470);
        attack.setFont(new Font("Courier New", Font.BOLD, 15) );
        attack.setHorizontalAlignment(SwingConstants.CENTER);
        attack.setVerticalAlignment(SwingConstants.CENTER);
        monslist.add(Poring);
        monslist.add(Lunatic);
        monslist.add(Tarou);
        monslist.add(ThiefBug);
        monslist.add(Baker);
        monslist.add(Slayer);
        monslist.add(Reggar);
        monslist.add(Slideup);
        monslist.add(Mandragora);
        monslist.add(Exnologear);
        monslist.add(Medusa);
        monslist.add(Kraken);
        monslist.add(Chimera);
        monster_list = new String[monslist.size()];
        for (int i = 0; i < monslist.size(); i++) {
            if (monslist.get(i) != null) {
                monster_list[i] = monslist.get(i).getNameMons();
            }
        }

        MonsList.setListData(monster_list);

        MonsList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                String search = (String) MonsList.getSelectedValue();
                for (Monster1 d : monslist) {
                    if (d.getNameMons() != null && d.getNameMons().contains(search)) {
                        Monsname.setText("Name : " + d.getNameMons());
                        Monslevel.setText("Level : " + Integer.toString(d.getLevel()));
                        MonsHp.setText("Hp : " + Integer.toString(d.getHp()));
                    }
                }
            }
        });

        attack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String p = (String) MonsList.getSelectedValue();
                if (p != null) {
                    novice.fightmonster();
                    JFrame current = (JFrame) SwingUtilities.getWindowAncestor(panel);
                    current.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Choose  Monster", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        panel.setLayout(new GridLayout(1,3,10,20));
        panel.add(MonsList);
        panel.add(Monsname);
        panel.add(Monslevel);
        panel.add(MonsHp);
        panel1.add(attack);
        panel.add(panel1);
    }

    public void run(MonsterGui mg){
        JFrame frame = new JFrame("BladeFlameGame");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setContentPane(mg.panel);
        frame.setPreferredSize(new Dimension(640, 480));
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }
}
