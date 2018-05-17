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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class AddElev {


	
	public AddElev() {
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
		lblNume.setBounds(53, 111, 90, 17);
		panel.add(lblNume);
		
		JLabel lblPrenume = new JLabel("Prenume");
		lblPrenume.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		lblPrenume.setBounds(302, 101, 114, 36);
		panel.add(lblPrenume);
		
		JTextField nume = new JTextField();
		nume.setBounds(138, 112, 131, 25);
		panel.add(nume);
		nume.setColumns(10);
		
		JTextField prenume = new JTextField();
		prenume.setBounds(423, 112, 131, 25);
		panel.add(prenume);
		prenume.setColumns(10);
		
		JButton addElev = new JButton("Adauga");
		addElev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// adauga la baza de date
				// citire texte
				// generare username
				frame.dispose();
				
				PaginaDirector p=new PaginaDirector();
			}
		});
		addElev.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		addElev.setBounds(107, 320, 142, 36);
		panel.add(addElev);
		
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
		
		JLabel lblAdaugaProfesor = new JLabel("Adauga elev");
		lblAdaugaProfesor.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		lblAdaugaProfesor.setBounds(187, 32, 219, 36);
		panel.add(lblAdaugaProfesor);
		
		JLabel lblUsername = new JLabel("Selecteaza discipline");
		lblUsername.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		lblUsername.setBounds(53, 183, 216, 25);
		panel.add(lblUsername);
		
		JList list = new JList();
		list.setBackground(Color.WHITE);
		list.setForeground(Color.BLACK);
		list.setToolTipText("");
		list.setVisibleRowCount(10);
		list.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Matematica", "Informatica", "Istorie", "Geografie", "Limba Romana", "Sport", "Chimie", "Biologie", "Fizica", "Limba Engleza", "Limba Franceza\t", "Limba Latina", "Economie", "Filozofie", "Muzica", "Desen", "Religie"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setSelectedIndex(1);
		list.setBounds(350, 180, 100, 100);
		//panel.add(list);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(347, 173, 190, 100);
	//	scrollPane.add(list);
		scrollPane.setViewportView(list);
		panel.add(scrollPane);
		panel.revalidate();
		panel.repaint();
		scrollPane.revalidate();
		scrollPane.repaint();
	}
}
