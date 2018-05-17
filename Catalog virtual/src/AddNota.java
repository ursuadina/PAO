import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class AddNota {
	

	
	public AddNota() {
		JFrame frame = new JFrame("Catalog virtual");
		frame.setBounds(100, 100, 616, 421);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNume = new JLabel("Id elev");
		lblNume.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		lblNume.setBounds(138, 112, 90, 17);
		panel.add(lblNume);
		
		JLabel lblPrenume = new JLabel("Nota");
		lblPrenume.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		lblPrenume.setBounds(138, 181, 114, 36);
		panel.add(lblPrenume);
		
		
		
		
		JTextField idElev = new JTextField();
		idElev.setBounds(302, 112, 131, 25);
		panel.add(idElev);
		idElev.setColumns(10);
		
		JTextField nota = new JTextField();
		nota.setBounds(302, 192, 131, 25);
		panel.add(nota);
		nota.setColumns(10);
		
		JButton addNota = new JButton("Adauga");
		addNota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// adauga la baza de date
				// citire texte
				// generare username
				frame.dispose();
				
				PaginaProfesor p=new PaginaProfesor();
			}
		});
		addNota.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		addNota.setBounds(106, 274, 142, 36);
		panel.add(addNota);
		
		JButton renunta = new JButton("Renunta");
		renunta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				PaginaProfesor p=new PaginaProfesor();
				
			}
		});
		renunta.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		renunta.setBounds(362, 274, 142, 36);
		panel.add(renunta);
		
		JLabel lblAdaugaProfesor = new JLabel("Adauga nota");
		lblAdaugaProfesor.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		lblAdaugaProfesor.setBounds(187, 32, 219, 36);
		panel.add(lblAdaugaProfesor);
		panel.revalidate();
		panel.repaint();
	}
	

}
