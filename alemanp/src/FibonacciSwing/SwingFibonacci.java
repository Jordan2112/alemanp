package FibonacciSwing;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SwingFibonacci extends JFrame {

	private JPanel contentPane;
	private JTextField txtValor1;
	private JTextField txtValor2;
	private JTextField txtIteraciones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingFibonacci frame = new SwingFibonacci();
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
	public SwingFibonacci() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SERIE FIBONACCI");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 18));
		lblNewLabel.setBounds(128, 26, 188, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Valor 1");
		lblNewLabel_1.setBounds(51, 107, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Valor 2");
		lblNewLabel_2.setBounds(51, 151, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Iteraciones");
		lblNewLabel_3.setBounds(51, 197, 63, 14);
		contentPane.add(lblNewLabel_3);
		
		txtValor1 = new JTextField();
		txtValor1.setBounds(144, 104, 86, 20);
		contentPane.add(txtValor1);
		txtValor1.setColumns(10);
		
		txtValor2 = new JTextField();
		txtValor2.setBounds(144, 148, 86, 20);
		contentPane.add(txtValor2);
		txtValor2.setColumns(10);
		
		txtIteraciones = new JTextField();
		txtIteraciones.setBounds(144, 194, 86, 20);
		contentPane.add(txtIteraciones);
		txtIteraciones.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular Serie");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Cont = " ";
				
				boolean Inicio = true;
				
				int numero1 = Integer.parseInt(txtValor1.getText());
				
				int iteraciones = Integer.parseInt(txtIteraciones.getText());
				
				int numero2 = Integer.parseInt(txtValor2.getText());
				
				for(int x = 1; x <= iteraciones; x++)
				{
					
					
					if(Inicio == true)
					{
						
						Cont += numero1 + "  ||  " + numero2;
						
						Inicio = false;
						
					}
					
					Cont += "  ||  ";
					
					int numero3 = numero1+numero2;
					
					Cont += numero3;
					
					numero1 = numero2;
					numero2 = numero3;
				
				}
				
				
				
				JOptionPane.showInternalMessageDialog(null, "\nLa serie fibonacci es: \n" + Cont);
				
				
				
				
				
				
				
				
				
			}
		});
		btnCalcular.setBounds(276, 106, 106, 34);
		contentPane.add(btnCalcular);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
		
			}
		});
		btnSalir.setBounds(276, 151, 106, 38);
		contentPane.add(btnSalir);
	}
}
