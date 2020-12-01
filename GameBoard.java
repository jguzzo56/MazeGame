package MazeClass;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class GameBoard extends JFrame {

    private final JButton move;
    private final JButton turn_left;
    private final JButton turn_right;
    private final JLabel directions;
    private final JTextArea step1;
    private final JTextArea step2;
    private final JTextArea step3;
    private final JTextArea step4;
    private final JTextArea step5;
    private final JTextArea step6;
    private final JTextArea step7;
    private final JTextArea step8;
    private final JTextArea step9;
    private final JTextArea step10;
    private final JTextArea step11;
    private final JTextArea step12;
    private final JTextArea step13;
    private final JTextArea step14;
    private final JTextArea step15;
    private final JTextArea step16;
    private final JTextArea step17;
    private final JTextArea step18;
    private final JTextArea step19;
    private final JTextArea step20;
    private final JTextArea step21;
    private final JTextArea step22;
    private final JTextArea step23;
    private final JTextArea step24;
    private final JTextArea step25;
    private final JTextArea step26;
    private final JTextArea step27;
    private final JTextArea step28;
    private final JTextArea step29;
    private final JTextArea step30;
    private final JTextArea step31;
    private final JTextArea step32;
    private final JTextArea step33;
    private final JTextArea step34;
    private final JTextArea step35;
    private final JTextArea step36;
    private final JTextArea step37;
    private final JTextArea step38;
    private final JTextArea step39;
    private final JTextArea step40;
    private final JTextArea step41;
    private final JTextArea step42;
    private final JTextArea step43;
    private final JTextArea step44;
    private final JTextArea step45;
    private final JTextArea step46;
    private final JTextArea step47;
    private final JTextArea step48;
    private final JTextArea step49;
    private final JTextArea step50;

    public GameBoard() {
        super("Maze Game by Juicy");
        setLayout(new FlowLayout());
        directions = new JLabel("--You are facing north. You are at (0,0)--");
        add(directions);

        move = new JButton("Move");
        add(move);
        turn_left = new JButton("Turn Left");
        add(turn_left);
        turn_right = new JButton("Turn Right");
        add(turn_right);

        step1 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 x 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step1.setVisible(false);
        step1.setEditable(false);
        step1.setBackground(UIManager.getColor("Label.background"));
        add(step1);

        step2 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step2.setVisible(false);
        step2.setEditable(false);
        step2.setBackground(UIManager.getColor("Label.background"));
        add(step2);

        step3 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step3.setVisible(false);
        step3.setEditable(false);
        step3.setBackground(UIManager.getColor("Label.background"));
        add(step3);

        step4 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step4.setVisible(false);
        step4.setEditable(false);
        step4.setBackground(UIManager.getColor("Label.background"));
        add(step4);

        step5 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step5.setVisible(false);
        step5.setEditable(false);
        step5.setBackground(UIManager.getColor("Label.background"));
        add(step5);

        step6 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step6.setVisible(false);
        step6.setEditable(false);
        step6.setBackground(UIManager.getColor("Label.background"));
        add(step6);

        step7 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step7.setVisible(false);
        step7.setEditable(false);
        step7.setBackground(UIManager.getColor("Label.background"));
        add(step7);

        step8 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step8.setVisible(false);
        step8.setEditable(false);
        step8.setBackground(UIManager.getColor("Label.background"));
        add(step8);

        step9 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step9.setVisible(false);
        step9.setEditable(false);
        step9.setBackground(UIManager.getColor("Label.background"));
        add(step9);

        step10 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step10.setVisible(false);
        step10.setEditable(false);
        step10.setBackground(UIManager.getColor("Label.background"));
        add(step10);

        step11 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step11.setVisible(false);
        step11.setEditable(false);
        step11.setBackground(UIManager.getColor("Label.background"));
        add(step11);

        step12 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step12.setVisible(false);
        step12.setEditable(false);
        step12.setBackground(UIManager.getColor("Label.background"));
        add(step12);

        step13 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step13.setVisible(false);
        step13.setEditable(false);
        step13.setBackground(UIManager.getColor("Label.background"));
        add(step13);

        step14 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step14.setVisible(false);
        step14.setEditable(false);
        step14.setBackground(UIManager.getColor("Label.background"));
        add(step14);

        step15 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step15.setVisible(false);
        step15.setEditable(false);
        step15.setBackground(UIManager.getColor("Label.background"));
        add(step15);

        step16 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step16.setVisible(false);
        step16.setEditable(false);
        step16.setBackground(UIManager.getColor("Label.background"));
        add(step16);

        step17 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step17.setVisible(false);
        step17.setEditable(false);
        step17.setBackground(UIManager.getColor("Label.background"));
        add(step17);

        step18 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step18.setVisible(false);
        step18.setEditable(false);
        step18.setBackground(UIManager.getColor("Label.background"));
        add(step18);

        step19 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step19.setVisible(false);
        step19.setEditable(false);
        step19.setBackground(UIManager.getColor("Label.background"));
        add(step19);

        step20 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step20.setVisible(false);
        step20.setEditable(false);
        step20.setBackground(UIManager.getColor("Label.background"));
        add(step20);

        step21 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step21.setVisible(false);
        step21.setEditable(false);
        step21.setBackground(UIManager.getColor("Label.background"));
        add(step21);

        step22 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step22.setVisible(false);
        step22.setEditable(false);
        step22.setBackground(UIManager.getColor("Label.background"));
        add(step22);

        step23 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step23.setVisible(false);
        step23.setEditable(false);
        step23.setBackground(UIManager.getColor("Label.background"));
        add(step23);

        step24 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step24.setVisible(false);
        step24.setEditable(false);
        step24.setBackground(UIManager.getColor("Label.background"));
        add(step24);

        step25 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step25.setVisible(false);
        step25.setEditable(false);
        step25.setBackground(UIManager.getColor("Label.background"));
        add(step25);

        step26 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step26.setVisible(false);
        step26.setEditable(false);
        step26.setBackground(UIManager.getColor("Label.background"));
        add(step26);

        step27 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step27.setVisible(false);
        step27.setEditable(false);
        step27.setBackground(UIManager.getColor("Label.background"));
        add(step27);

        step28 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step28.setVisible(false);
        step28.setEditable(false);
        step28.setBackground(UIManager.getColor("Label.background"));
        add(step28);

        step29 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step29.setVisible(false);
        step29.setEditable(false);
        step29.setBackground(UIManager.getColor("Label.background"));
        add(step29);

        step30 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step30.setVisible(false);
        step30.setEditable(false);
        step30.setBackground(UIManager.getColor("Label.background"));
        add(step30);

        step31 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step31.setVisible(false);
        step31.setEditable(false);
        step31.setBackground(UIManager.getColor("Label.background"));
        add(step31);

        step32 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step32.setVisible(false);
        step32.setEditable(false);
        step32.setBackground(UIManager.getColor("Label.background"));
        add(step32);

        step33 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step33.setVisible(false);
        step33.setEditable(false);
        step33.setBackground(UIManager.getColor("Label.background"));
        add(step33);

        step34 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step34.setVisible(false);
        step34.setEditable(false);
        step34.setBackground(UIManager.getColor("Label.background"));
        add(step34);

        step35 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step35.setVisible(false);
        step35.setEditable(false);
        step35.setBackground(UIManager.getColor("Label.background"));
        add(step35);

        step36 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step36.setVisible(false);
        step36.setEditable(false);
        step36.setBackground(UIManager.getColor("Label.background"));
        add(step36);

        step37 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step37.setVisible(false);
        step37.setEditable(false);
        step37.setBackground(UIManager.getColor("Label.background"));
        add(step37);

        step38 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step38.setVisible(false);
        step38.setEditable(false);
        step38.setBackground(UIManager.getColor("Label.background"));
        add(step38);

        step39 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step39.setVisible(false);
        step39.setEditable(false);
        step39.setBackground(UIManager.getColor("Label.background"));
        add(step39);

        step40 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step40.setVisible(false);
        step40.setEditable(false);
        step40.setBackground(UIManager.getColor("Label.background"));
        add(step40);

        step41 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step41.setVisible(false);
        step41.setEditable(false);
        step41.setBackground(UIManager.getColor("Label.background"));
        add(step41);

        step42 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step42.setVisible(false);
        step42.setEditable(false);
        step42.setBackground(UIManager.getColor("Label.background"));
        add(step42);

        step43 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step43.setVisible(false);
        step43.setEditable(false);
        step43.setBackground(UIManager.getColor("Label.background"));
        add(step43);

        step44 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step44.setVisible(false);
        step44.setEditable(false);
        step44.setBackground(UIManager.getColor("Label.background"));
        add(step44);

        step45 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step45.setVisible(false);
        step45.setEditable(false);
        step45.setBackground(UIManager.getColor("Label.background"));
        add(step45);

        step46 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step46.setVisible(false);
        step46.setEditable(false);
        step46.setBackground(UIManager.getColor("Label.background"));
        add(step46);

        step47 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step47.setVisible(false);
        step47.setEditable(false);
        step47.setBackground(UIManager.getColor("Label.background"));
        add(step47);

        step48 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step48.setVisible(false);
        step48.setEditable(false);
        step48.setBackground(UIManager.getColor("Label.background"));
        add(step48);

        step49 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step49.setVisible(false);
        step49.setEditable(false);
        step49.setBackground(UIManager.getColor("Label.background"));
        add(step49);

        step50 = new JTextArea("0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0"
                + "\n0 0 0 0 0 0 0 0 0 0 0 0 0");

        step50.setVisible(false);
        step50.setEditable(false);
        step50.setBackground(UIManager.getColor("Label.background"));
        add(step50);

        listener listener = new listener();
        move.addActionListener(listener);
        turn_left.addActionListener(listener);
        turn_right.addActionListener(listener);

    }

    private class listener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            MazeClass player = new MazeClass(0, 0, 1, 4);

            if (event.getSource() == move) {
                step1.setVisible(true);
            } else if (event.getSource() == turn_left) {
                player.turnLeft();
            } else if (event.getSource() == turn_right) {
                player.turnRight();
            }

        }

    }
}
