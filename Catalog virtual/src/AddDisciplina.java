import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddDisciplina {
	private JTextField nume;
	private JTextField idProf;
	public AddDisciplina() {
		JFrame frame = new JFrame("Catalog virtual");
		frame.setBounds(100, 100, 616, 421);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Nume = new JLabel("Nume");
		Nume.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		Nume.setBounds(120, 111, 90, 17);
		panel.add(Nume);
		
		JLabel ldProfL = new JLabel("Id profesor");
		ldProfL.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		ldProfL.setBounds(120, 181, 144, 36);
		panel.add(ldProfL);
		
		nume = new JTextField();
		nume.setBounds(302, 112, 131, 25);
		panel.add(nume);
		nume.setColumns(10);
		
		idProf = new JTextField();
		idProf.setBounds(302, 192, 131, 25);
		panel.add(idProf);
		idProf.setColumns(10);
		
		JButton addDisciplina = new JButton("Adauga");
		addDisciplina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// adauga la baza de date
				// citire texte
				// 
				frame.dispose();
				
				PaginaDirector p=new PaginaDirector();
			}
		});
		addDisciplina.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		addDisciplina.setBounds(108, 288, 142, 36);
		panel.add(addDisciplina);
		
		JButton renunta = new JButton("Renunta");
		renunta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				PaginaDirector p=new PaginaDirector();
				
			}
		});
		renunta.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		renunta.setBounds(364, 288, 142, 36);
		panel.add(renunta);
		
		JLabel lblAdaugaProfesor = new JLabel("Adauga disciplina");
		lblAdaugaProfesor.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		lblAdaugaProfesor.setBounds(187, 32, 219, 36);
		panel.add(lblAdaugaProfesor);
		panel.revalidate();
		panel.repaint();
	}


}
