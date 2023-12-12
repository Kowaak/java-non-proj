import javax.swing.*;
import java.awt.*;
public class form2 {
    public static void main(String[] args) {
        JFrame ramka = new JFrame();
        ramka.setSize(500, 450); // rozmiar okna
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.lightGray);
        panel.setPreferredSize(new Dimension(820,500));

        JTextArea moje_pole = new JTextArea(null,null,1,10);
        JTextArea moje_pole2 = new JTextArea(null,null,1,10);

        JButton oblicz = new JButton("Oblicz");

        moje_pole.setText("");
        moje_pole2.setText("");
        panel.add(new JLabel("Dzielenie: "));
        panel.add(moje_pole);
        panel.add(new JLabel("przez: "));
        panel.add(moje_pole2);
        panel.add(Box.createRigidArea(new Dimension(820,3 )));
        panel.add(oblicz);
        JLabel wynik = new JLabel();
        panel.add(wynik);
        oblicz.addActionListener(e -> {
            String a = moje_pole.getText();
            String b = moje_pole2.getText();
            try {
                float licz1 = Float.parseFloat(a);
                float licz2 = Float.parseFloat(b);
                /*if (licz1 == 0 || licz2 == 0){
                    wynik.setText("Błąd!");
                }*/
                wynik.setText(String.valueOf(licz1 / licz2));
            }catch (NumberFormatException ev){
                wynik.setText("Błąd!");
            }
        });
        panel.add(Box.createRigidArea(new Dimension(820,3 )));
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

        check1.addActionListener(e -> odp2.setText("Odp. A"));
        check2.addActionListener(e -> odp2.setText("Odp. B"));
        check3.addActionListener(e -> odp2.setText("Odp. C"));

        panel.add(check1);
        panel.add(check2);
        panel.add(check3);
        panel.add(Box.createRigidArea(new Dimension(820,3 )));
        panel.add(odp2);

        ramka.setVisible(true);
        ramka.add(panel);
    }
}
