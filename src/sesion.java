import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;


public class sesion extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sesion frame = new sesion();
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
	public sesion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar_1 = new JMenuBar();
		setJMenuBar(menuBar_1);
		
		JMenu mnNewMenu = new JMenu("Inicio");
		menuBar_1.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Recarga");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Registrar cliente");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmAaaa = new JMenuItem("nada");
		mnNewMenu.add(mntmAaaa);
		
		JMenu mnDdddd = new JMenu("Buscar Cliente");
		mnNewMenu.add(mnDdddd);
		
		JMenuItem mntmClaudia = new JMenuItem("por Cedula");
		mnDdddd.add(mntmClaudia);
		
		JMenuItem mntmKkk = new JMenuItem("Por Huella");
		mnDdddd.add(mntmKkk);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNmeroDeCedula = new JLabel("Nombre");
		lblNmeroDeCedula.setBounds(48, 66, 125, 14);
		contentPane.add(lblNmeroDeCedula);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(161, 60, 87, 20);
		contentPane.add(textPane);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.setBounds(48, 207, 91, 23);
		contentPane.add(btnAtras);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(266, 207, 91, 23);
		contentPane.add(btnAceptar);
		
		JLabel lblRegistrarse = new JLabel("Registrarse");
		lblRegistrarse.setBounds(10, 0, 73, 14);
		contentPane.add(lblRegistrarse);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(161, 91, 87, 20);
		contentPane.add(textPane_1);
		
		JLabel label = new JLabel("N\u00FAmero de cedula");
		label.setBounds(36, 97, 125, 14);
		contentPane.add(label);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(48, 122, 125, 14);
		contentPane.add(lblDireccion);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(161, 122, 87, 20);
		contentPane.add(textPane_2);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(48, 153, 125, 14);
		contentPane.add(lblTelefono);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setBounds(161, 147, 87, 20);
		contentPane.add(textPane_3);
		
		
	}
}
