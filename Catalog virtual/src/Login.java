

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login{

	public Login() {
		JFrame frame = new JFrame("Catalog virtual");
		frame.setBounds(100, 100, 616, 421);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		frame.getContentPane().add(panel);
		
		JLabel lblAutentificare = new JLabel("Autentificare");
		lblAutentificare.setBounds(202, 44, 174, 74);
		lblAutentificare.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(81, 135, 116, 29);
		lblUsername.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		
		JLabel lblParola = new JLabel("Parola");
		lblParola.setBounds(81, 205, 101, 29);
		lblParola.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		
		JTextField username = new JTextField();
		username.setBounds(237, 135, 223, 29);
		username.setColumns(10);
		
		JPasswordField parola = new JPasswordField();
		parola.setBounds(237, 205, 223, 29);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(93, 299, 127, 44);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*De facut partea de SQL: 
				 *1.La click pe buton (se conecteaza la baza de date).
				 *2. Cautam username si parola, daca exista treci la urm pagina, iar daca nu-->dialog box coresp.
				 *vezi part 4 tutorial youtube
				 */
				//PaginaDirector pd = new PaginaDirector();
				PaginaProfesor pd = new PaginaProfesor();
				frame.dispose();
				
			}
		});
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		
		JButton btnRenunta = new JButton("Renunta");
		btnRenunta.setBounds(346, 299, 127, 44);
		btnRenunta.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		btnRenunta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		panel.setLayout(null);
		panel.add(lblAutentificare);
		panel.add(lblUsername);
		panel.add(username);
		panel.add(lblParola);
		panel.add(parola);
		panel.add(btnLogin);
		panel.add(btnRenunta);
		
		panel.revalidate();
		panel.repaint();
		/*JPanel route=new JPanel();
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(3,2));
		frame.setContentPane(route);
		route.add(panel);
		JLabel user=new JLabel("User");
		JButton login=new JButton("Login");
		panel.add(user);
		JTextField userNume=new JTextField();
		panel.add(userNume); 
		JPasswordField parola=new JPasswordField();
		panel.add(new JLabel("Password"));
		panel.add(parola);
		panel.add(login);
		JButton cancel=new JButton("Cancel");
		panel.add(cancel);
		
		panel.revalidate();
		panel.repaint();
		
		panel.setPreferredSize(new Dimension(300,300));
		GridBagConstraints constraints=new GridBagConstraints();
		constraints.fill=GridBagConstraints.NONE;
		
		route.setLayout(new GridBagLayout());
		route.add(panel, constraints);
		
		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String nume=userNume.getText();
				panel.removeAll();
				panel.add(new JLabel("Bine ati venit "+nume+" !"));
				panel.revalidate();
				panel.repaint();//cand umblam la componentele unui container trebui apelate revalidate si repaint
			}});
	  cancel.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}});	*/
	}
}
