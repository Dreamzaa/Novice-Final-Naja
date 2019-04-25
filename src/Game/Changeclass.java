package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Changeclass
{
    private JPanel panel;
    private JPanel panel1;
    private JPanel panel2;
    private JButton berserkbutton;
    private JButton wizardbutton;
    private JLabel content;
    public NOVICS novics;

    public Changeclass(NOVICS NOR)
    {
        novics = NOR;
        panel = new JPanel();
        panel1 = new JPanel();
        panel2 = new JPanel();
        berserkbutton = new JButton();
        wizardbutton = new JButton();
        content = new JLabel();
        panel.setLayout(new GridLayout(3,1));
        content.setText("Select Class");
        content.setHorizontalAlignment(SwingConstants.CENTER);
        content.setVerticalAlignment(SwingConstants.CENTER);
        berserkbutton.setText("Berserk");
        wizardbutton.setText("Wizard");
        content.setFont(new Font("Courier New", Font.BOLD, 80));
        berserkbutton.setFont(new Font("Courier New", Font.BOLD, 60));
        wizardbutton.setFont(new Font("Courier New", Font.BOLD, 60));
        panel.add(content);
        panel1.add(berserkbutton);
        panel2.add(wizardbutton);
        panel.add(panel1);
        panel.add(panel2);

        berserkbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Berserk ber = new Berserk();
                OptionGame rt = new OptionGame(ber);
                rt.run(rt);
                JFrame cur = (JFrame) SwingUtilities.getWindowAncestor(panel);
                cur.dispose();
            }
        });

        wizardbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Wizard wi = new Wizard();
                OptionGame rt = new OptionGame(wi);
                rt.run(rt);
                JFrame cur = (JFrame) SwingUtilities.getWindowAncestor(panel);
                cur.dispose();
            }
        });

    }

    public void run(Changeclass mg){
        JFrame frame = new JFrame("BladeFlameGame");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setContentPane(mg.panel);
        frame.setPreferredSize(new Dimension(640, 480));
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }
}
