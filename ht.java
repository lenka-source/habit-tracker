/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ht
implements ItemListener {
    String[] items = new String[]{" ", "Java", "drawing", "creativity", "writing", "cleaning",
     "study", "guitar", "dopamin detox", "HTML", "going fo a walk", "friends", "hygene",
      "Eng", "Fr", "homework", "sport", "completing todo list", "got up early", "Ger"};
    static int[] points = new int[]{0, 4, 3, 5, 4, 5, 2, 4, 5, 4, 5, 5, 2, 5, 2, 3, 2, 4, 2, 5, 2, 3, 2, 4};
    static JFrame f;
    static JLabel l2;
    static JLabel l3;
    static JLabel l4;
    static JLabel l5;
    static JLabel l6;
    static JLabel l7;
    JPanel p;
    static JLabel sou;
    static Choice ch1;
    static Choice ch2;
    static Choice ch3;
    static Choice ch4;
    static Choice ch5;
    static Choice ch6;
    JButton b1 = new JButton("Add");
    JButton b2;

    ht() {
        int n;
        this.b1.addActionListener(new Action());
        this.b1.setBounds(20, 210, 90, 30);
        this.b2 = new JButton("Reset");
        this.b2.addActionListener(new Action2());
        this.b2.setBounds(20, 250, 90, 30);
        sou = new JLabel();
        sou.setBounds(130, 210, 90, 30);
        l2 = new JLabel();
        l2.setBounds(120, 25, 90, 30);
        l2.setText("0 p.");
        l3 = new JLabel();
        l3.setBounds(120, 55, 90, 30);
        l3.setText("0 p.");
        l4 = new JLabel();
        l4.setBounds(120, 85, 90, 30);
        l4.setText("0 p.");
        l5 = new JLabel();
        l5.setBounds(120, 115, 90, 30);
        l5.setText("0 p.");
        l6 = new JLabel();
        l6.setBounds(120, 145, 90, 30);
        l6.setText("0 p.");
        l7 = new JLabel();
        l7.setBounds(120, 175, 90, 30);
        l7.setText("0 p.");
        this.p = new JPanel();
        this.p.setLayout(null);
        ch1 = new Choice();
        for (n = 0; n < this.items.length; ++n) {
            ch1.add(this.items[n]);
        }
        ch1.addItemListener(this);
        ch2 = new Choice();
        for (n = 0; n < this.items.length; ++n) {
            ch2.add(this.items[n]);
        }
        ch2.addItemListener(this);
        ch3 = new Choice();
        for (n = 0; n < this.items.length; ++n) {
            ch3.add(this.items[n]);
        }
        ch3.addItemListener(this);
        ch4 = new Choice();
        for (n = 0; n < this.items.length; ++n) {
            ch4.add(this.items[n]);
        }
        ch4.addItemListener(this);
        ch5 = new Choice();
        for (n = 0; n < this.items.length; ++n) {
            ch5.add(this.items[n]);
        }
        ch5.addItemListener(this);
        ch6 = new Choice();
        for (n = 0; n < this.items.length; ++n) {
            ch6.add(this.items[n]);
        }
        ch6.addItemListener(this);
        ch1.setBounds(20, 30, 90, 30);
        ch2.setBounds(20, 60, 90, 30);
        ch3.setBounds(20, 90, 90, 30);
        ch4.setBounds(20, 120, 90, 30);
        ch5.setBounds(20, 150, 90, 30);
        ch6.setBounds(20, 180, 90, 30);
        this.p.add(ch1);
        this.p.add(ch2);
        this.p.add(ch3);
        this.p.add(ch4);
        this.p.add(ch5);
        this.p.add(ch6);
        this.p.add(l2);
        this.p.add(l3);
        this.p.add(l4);
        this.p.add(l5);
        this.p.add(l6);
        this.p.add(l7);
        this.p.add(sou);
        this.p.add(this.b1);
        this.p.add(this.b2);
        f = new JFrame();
        f.setVisible(true);
        f.setSize(240, 360);
        f.setDefaultCloseOperation(3);
        f.setResizable(false);
        f.add(this.p);
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        if (ch1.getSelectedItem() != null) {
            l2.setText(points[ch1.getSelectedIndex()] + " p.");
        }
        if (ch2.getSelectedItem() != null) {
            l3.setText(points[ch2.getSelectedIndex()] + " p.");
        }
        if (ch3.getSelectedItem() != null) {
            l4.setText(points[ch3.getSelectedIndex()] + " p.");
        }
        if (ch4.getSelectedItem() != null) {
            l5.setText(points[ch4.getSelectedIndex()] + " p.");
        }
        if (ch5.getSelectedItem() != null) {
            l6.setText(points[ch5.getSelectedIndex()] + " p.");
        }
        if (ch6.getSelectedItem() != null) {
            l7.setText(points[ch6.getSelectedIndex()] + " p.");
        }
    }

    public static void main(String[] stringArray) {
        new ht();
    }

    static class Action2
    implements ActionListener {
        Action2() {
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            l2.setText("0 p.");
            l3.setText("0 p.");
            l4.setText("0 p.");
            l5.setText("0 p.");
            l6.setText("0 p.");
            l7.setText("0 p.");
            sou.setText("");
            ch1.select(0);
            ch2.select(0);
            ch3.select(0);
            ch4.select(0);
            ch5.select(0);
            ch6.select(0);
        }
    }

    static class Action
    implements ActionListener {
        Action() {
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            sou.setText(points[ch1.getSelectedIndex()] + points[ch2.getSelectedIndex()] + points[ch3.getSelectedIndex()] + points[ch4.getSelectedIndex()] + points[ch5.getSelectedIndex()] + points[ch6.getSelectedIndex()] + " points");
        }
    }
}
