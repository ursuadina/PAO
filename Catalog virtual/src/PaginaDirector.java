import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PaginaDirector extends JFrame {

	public PaginaDirector() {
		JFrame frame = new JFrame("Catalog virtual");
		frame.setBounds(100, 100, 616, 421);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel numeUser = new JLabel("Bine ai venit domnule");
		numeUser.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		numeUser.setBounds(10, 11, 498, 36);
		panel.add(numeUser);
		
		JButton addProf = new JButton("Adauga Profesori");
		addProf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AddProf p=new AddProf();
			}
		});
		addProf.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		addProf.setBounds(79, 91, 214, 36);
		panel.add(addProf);
		
		JButton addDisc = new JButton("Adauga Disciplina");
		addDisc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AddDisciplina p=new AddDisciplina();
			}
		});
		addDisc.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		addDisc.setBounds(79, 168, 214, 36);
		panel.add(addDisc);
		
		JButton addElev = new JButton("Adauga Elev");
		addElev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AddElev p=new AddElev();
			}
		});
		addElev.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		addElev.setBounds(79, 255, 214, 36);
		panel.add(addElev);
		
		JButton veziProf = new JButton("Vezi Profesori");
		veziProf.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		veziProf.setBounds(344, 88, 214, 36);
		panel.add(veziProf);
		
		JButton veziDisc = new JButton("Vezi Discipline");
		veziDisc.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		veziDisc.setBounds(344, 168, 214, 36);
		panel.add(veziDisc);
		
		JButton veziElev = new JButton("Vezi Elevi");
		veziElev.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		veziElev.setBounds(344, 255, 214, 36);
		panel.add(veziElev);
		
		JButton delogare = new JButton("Delogare");
		delogare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				//constructor login+clasa lansator cu constructor login+intoarcere in login
				Login l=new Login();
			}
		});
		delogare.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		delogare.setBounds(392, 335, 169, 36);
		panel.add(delogare);
		panel.revalidate();
		panel.repaint();
	}
}
