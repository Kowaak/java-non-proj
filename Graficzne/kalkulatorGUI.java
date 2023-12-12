

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class calculator extends JFrame implements ActionListener {
	static JFrame f;
	static JTextField poletxt;
	String s0, s1, s2;
	calculator(){
		s0 = s1 = s2 = "";
	}
	public static void main(String args[])
	{
		f = new JFrame("Kalkulator - Autor: Filip Załęcki");
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
		calculator c = new calculator();
		poletxt = new JTextField(16);
		poletxt.setEditable(false);
		f.setIconImage(Toolkit.getDefaultToolkit().getImage("Graficzne\\logo.png"));
		JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, beq, beq1;
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		beq1 = new JButton("=");
		ba = new JButton("+");
		bs = new JButton("-");
		bd = new JButton("/");
		bm = new JButton("*");
		beq = new JButton("C");
		be = new JButton(".");
		bm.addActionListener(c);
		bd.addActionListener(c);
		bs.addActionListener(c);
		ba.addActionListener(c);
		b9.addActionListener(c);
		b8.addActionListener(c);
		b7.addActionListener(c);
		b6.addActionListener(c);
		b5.addActionListener(c);
		b4.addActionListener(c);
		b3.addActionListener(c);
		b2.addActionListener(c);
		b1.addActionListener(c);
		b0.addActionListener(c);
		be.addActionListener(c);
		beq.addActionListener(c);
		beq1.addActionListener(c);
		JPanel p = new JPanel();
		p.setBackground(Color.darkGray);
		Dimension buttonSize = new Dimension(65, 65);
		p.add(poletxt).setPreferredSize(new Dimension(350, 65));
		p.add(beq).setPreferredSize(buttonSize);
		p.add(Box.createRigidArea(new Dimension(820,5)));
		p.add(b1).setPreferredSize(buttonSize);
		p.add(b2).setPreferredSize(buttonSize);
		p.add(b3).setPreferredSize(buttonSize);
		p.add(ba).setPreferredSize(buttonSize);
		p.add(Box.createRigidArea(new Dimension(820,5)));
		p.add(b4).setPreferredSize(buttonSize);
		p.add(b5).setPreferredSize(buttonSize);
		p.add(b6).setPreferredSize(buttonSize);
		p.add(bs).setPreferredSize(buttonSize);
		p.add(Box.createRigidArea(new Dimension(820,5)));
		p.add(b7).setPreferredSize(buttonSize);
		p.add(b8).setPreferredSize(buttonSize);
		p.add(b9).setPreferredSize(buttonSize);
		p.add(bm).setPreferredSize(buttonSize);
		p.add(Box.createRigidArea(new Dimension(820,5)));
		p.add(bd).setPreferredSize(buttonSize);
		p.add(be).setPreferredSize(buttonSize);
		p.add(b0).setPreferredSize(buttonSize);
		p.add(beq1).setPreferredSize(buttonSize);

		p.setBackground(Color.darkGray);
		f.add(p);
		f.setResizable(false);
		f.setSize(400, 440);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s = e.getActionCommand();
		ImageIcon blad = new ImageIcon("Graficzne\\nerd.png");
		if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
			if (!s1.equals(""))
				s2 = s2 + s;
			else
				s0 = s0 + s;
		if(s0.contains(".") && s.contains("."))
		{
			JOptionPane.showMessageDialog(f, "Błąd: Liczba może zawierać tylko jedną kropkę", "Błąd", JOptionPane.ERROR_MESSAGE,blad);
			return;
		}
		poletxt.setText(s0 + s1 + s2);
		}
		else if (s.charAt(0) == 'C') {
			s0 = s1 = s2 = "";
			poletxt.setText(s0 + s1 + s2);
		}
		else if (s.charAt(0) == '=') {
			double te;
			if (s1.equals("+"))
				te = (Double.parseDouble(s0) + Double.parseDouble(s2));
			else if (s1.equals("-"))
				te = (Double.parseDouble(s0) - Double.parseDouble(s2));
				else if (s1.equals("/"))
					if(Double.parseDouble(s2) == 0){
						JOptionPane.showMessageDialog(f, "Błąd: Dzielenie przez 0", "Błąd", JOptionPane.ERROR_MESSAGE,blad);
						return;
					}
					else{
					te = (Double.parseDouble(s0) / Double.parseDouble(s2));
					}
				else
					te = (Double.parseDouble(s0) * Double.parseDouble(s2));
				poletxt.setText(s0 + s1 + s2 + "=" + te);
				s0 = Double.toString(te);
				s1 = s2 = "";
				}
				else {
					if (s1.equals("") || s2.equals(""))
					s1 = s;
				else {
					double te;

				if (s1.equals("+"))
					te = (Double.parseDouble(s0) + Double.parseDouble(s2));
				else if (s1.equals("-"))
					te = (Double.parseDouble(s0) - Double.parseDouble(s2));
				else if (s1.equals("/"))
					if(Double.parseDouble(s2) == 0){
						JOptionPane.showMessageDialog(f, "Błąd: Dzielenie przez 0", "Błąd", JOptionPane.ERROR_MESSAGE,blad);
						return;
					}
					else{
						te = (Double.parseDouble(s0) / Double.parseDouble(s2));
					}
				else
					te = (Double.parseDouble(s0) * Double.parseDouble(s2));
				s0 = Double.toString(te);
				s1 = s;
				s2 = "";
			}
			poletxt.setText(s0 + s1 + s2);
		}
	}
}
