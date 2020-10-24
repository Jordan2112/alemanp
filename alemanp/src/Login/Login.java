package Login;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Color;





public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JPasswordField passwordField;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
		
		
		
		
		
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 208);
		contentPane = new JPanel();
		contentPane.setForeground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(54, 64, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1.setBounds(54, 119, 74, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(137, 61, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				ArrayList<String> nombre = new ArrayList<String>();
				ArrayList<String> password = new ArrayList<String>();
				
				nombre.add("Jordan");
				password.add("123");
				
				nombre.add("Rosalinda");
				password.add("1234");
				
				nombre.add("Jesus");
				password.add("12345");
				
				nombre.add("Karla");
				password.add("123456");
				
				nombre.add("Jose");
				password.add("1234567");
				
				//Variables
				
				String Nombre;
				String Password;
				
				
				
				Nombre = txtNombre.getText();
				Password = new String(passwordField.getPassword());
				
				
				boolean varNombreResul,varPasswordResul;
				
				varNombreResul = nombre.contains(Nombre);
				
				varPasswordResul = password.contains(Password);
				
				
				
				
				if(varNombreResul == true && varPasswordResul == true) {
					
					JOptionPane.showMessageDialog(null, "Login Correcto");
					txtNombre.setText(null);
					passwordField.setText(null);
					
					txtNombre.requestFocus();
					
					
					
				}else {
						
					JOptionPane.showMessageDialog(null, "Login Incorrecto");
					
					txtNombre.setText(null);
					passwordField.setText(null);
					
					txtNombre.requestFocus();
					
					
					
					}
					
					
					
				}
				
				
			
		});
		
		btnIngresar.setBounds(286, 60, 89, 23);
		contentPane.add(btnIngresar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addMouseListener (new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				System.exit(ABORT);
				
				
				
			}
			
			
			
			
			
		});
		btnCancelar.setBounds(286, 115, 89, 23);
		contentPane.add(btnCancelar);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(138, 116, 85, 20);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("INICIO DE SESION");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 19));
		lblNewLabel_2.setBounds(137, 11, 173, 27);
		contentPane.add(lblNewLabel_2);
	}
}
