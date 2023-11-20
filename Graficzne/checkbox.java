package Graficzne;
import javax.swing.*;
import java.awt.*;
public class form {
    public static void main(String[] args) {
        JFrame ramka = new JFrame();
        ramka.setSize(500, 450); // rozmiar okna
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.lightGray);
        panel.setPreferredSize(new Dimension(820,500));

        ButtonGroup radia = new ButtonGroup();
        JLabel odp1 = new JLabel();
        JRadioButton radio1 = new JRadioButton("A");
        JRadioButton radio2 = new JRadioButton("B");
        JRadioButton radio3 = new JRadioButton("C");

        radio1.addActionListener(e -> odp1.setText("Odp. A"));
        radio2.addActionListener(e -> odp1.setText("Odp. B"));
        radio3.addActionListener(e -> odp1.setText("Odp. C"));

        radia.add(radio1);
        radia.add(radio2);
        radia.add(radio3);

        panel.add(radio1);
        panel.add(radio2);
        panel.add(radio3);
        panel.add(Box.createRigidArea(new Dimension(820,3 )));
        panel.add(odp1);

        panel.add(Box.createRigidArea(new Dimension(820,3 )));

        JLabel odp2 = new JLabel();
        JCheckBox check1 = new JCheckBox("A");
        JCheckBox check2 = new JCheckBox("B");
        JCheckBox check3 = new JCheckBox("C");

        check1.addActionListener(e ->{ if (check1.isSelected()) odp2.setText(odp2.getText()+" Odp. A");  else{ String txt1 = odp2.getText(); odp2.setText(txt1.replace(" Odp. A",""));}});
        check2.addActionListener(e ->{ if (check2.isSelected()) odp2.setText(odp2.getText()+" Odp. B");  else{ String txt2 = odp2.getText(); odp2.setText(txt2.replace(" Odp. B",""));}});
        check3.addActionListener(e ->{ if (check3.isSelected()) odp2.setText(odp2.getText()+" Odp. C");  else{ String txt3 = odp2.getText(); odp2.setText(txt3.replace(" Odp. C",""));}});

        panel.add(check1);
        panel.add(check2);
        panel.add(check3);
        panel.add(Box.createRigidArea(new Dimension(820,3 )));
        panel.add(odp2);

        ramka.setVisible(true);
        ramka.add(panel);
    }
}