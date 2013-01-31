import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;


public class Resultado extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resultado frame = new Resultado();
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
	public Resultado() {
		sesion miSesion = new sesion ();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSuContraseaEs = new JLabel("Su contrase\u00F1a ha sido correcta");
		lblSuContraseaEs.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuContraseaEs.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSuContraseaEs.setBounds(110, 78, 222, 24);
		contentPane.add(lblSuContraseaEs);
		
		JLabel lblPuedeIngresarSin = new JLabel("puede ingresar sin ningun problema al sistema");
		lblPuedeIngresarSin.setHorizontalAlignment(SwingConstants.CENTER);
		lblPuedeIngresarSin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPuedeIngresarSin.setBounds(69, 130, 315, 14);
		contentPane.add(lblPuedeIngresarSin);
		
		JLabel lblTarificadorSa = new JLabel("Tarificador SA");
		lblTarificadorSa.setBounds(10, 0, 100, 14);
		contentPane.add(lblTarificadorSa);
	}

}
