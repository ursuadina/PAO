import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddProf {


	
	public AddProf() {
		JFrame frame = new JFrame("Catalog virtual");
		frame.setBounds(100, 100, 616, 421);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNume = new JLabel("Nume");
		lblNume.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		lblNume.setBounds(138, 112, 90, 17);
		panel.add(lblNume);
		
		JLabel lblPrenume = new JLabel("Prenume");
		lblPrenume.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		lblPrenume.setBounds(138, 181, 114, 36);
		panel.add(lblPrenume);
		
		JTextField nume = new JTextField();
		nume.setBounds(302, 112, 131, 25);
		panel.add(nume);
		nume.setColumns(10);
		
		JTextField prenume = new JTextField();
		prenume.setBounds(302, 192, 131, 25);
		panel.add(prenume);
		prenume.setColumns(10);
		
		JButton addProf = new JButton("Adauga");
		addProf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// adauga la baza de date
				// citire texte
				// generare username
				frame.dispose();
				
				PaginaDirector p=new PaginaDirector();
			}
		});
		addProf.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		addProf.setBounds(107, 320, 142, 36);
		panel.add(addProf);
		
		JButton renunta = new JButton("Renunta");
		renunta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				PaginaDirector p=new PaginaDirector();
				
			}
		});
		renunta.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		renunta.setBounds(363, 320, 142, 36);
		panel.add(renunta);
		
		JLabel lblAdaugaProfesor = new JLabel("Adauga profesor");
		lblAdaugaProfesor.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		lblAdaugaProfesor.setBounds(187, 32, 219, 36);
		panel.add(lblAdaugaProfesor);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		lblUsername.setBounds(66, 255, 119, 25);
		panel.add(lblUsername);
		
		JLabel lblParola = new JLabel("Parola");
		lblParola.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		lblParola.setBounds(350, 253, 124, 29);
		panel.add(lblParola);
		
		JTextField username = new JTextField();
		username.setEditable(false);
		username.setBounds(200, 255, 86, 25);
		panel.add(username);
		username.setColumns(10);
		
		JTextField parola = new JTextField();
		parola.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		parola.setText("123456");
		parola.setEditable(false);
		parola.setBounds(464, 253, 102, 25);
		panel.add(parola);
		parola.setColumns(10);
		panel.revalidate();
		panel.repaint();
	}
}
