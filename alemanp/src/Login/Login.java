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
import javax.swing.JPasswordField;

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
				
				String Nombre;
				String Password;
				//String Resultado;
				
				
				Nombre = txtNombre.getText();
				Password = new String(passwordField.getPassword());
				
				if(Nombre.equals("Jordan") && Password.equals("Aleman")) {
					
					JOptionPane.showMessageDialog(null, "Login Correcto");
					
				}else {
						
					JOptionPane.showMessageDialog(null, "Login Incorrecto");
					}
					
					
					
				}
				
				
			
		});
		
		btnIngresar.setBounds(286, 60, 89, 23);
		contentPane.add(btnIngresar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(286, 115, 89, 23);
		contentPane.add(btnCancelar);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(138, 116, 85, 20);
		contentPane.add(passwordField);
	}
}
