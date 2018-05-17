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

public class PaginaProfesor extends JFrame {

	public PaginaProfesor() {
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
		
		JButton addNote = new JButton("Adauga Note");
		addNote.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AddNota p=new AddNota();
			}
		});
		addNote.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		addNote.setBounds(182, 89, 214, 36);
		panel.add(addNote);
		
		JButton addAbsente = new JButton("Adauga Absente");
		addAbsente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AddAbsente p=new AddAbsente();
			}
		});
		addAbsente.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		addAbsente.setBounds(182, 167, 214, 36);
		panel.add(addAbsente);
		
		
		JButton veziElev = new JButton("Vezi Elevi");
		veziElev.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		veziElev.setBounds(182, 240, 214, 36);
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
