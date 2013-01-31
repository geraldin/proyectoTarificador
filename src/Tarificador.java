import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;


public class Tarificador {

	private JFrame frmSesion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tarificador window = new Tarificador();
					window.frmSesion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tarificador() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSesion = new JFrame();
		frmSesion.setTitle("Sesion");
		frmSesion.setBounds(100, 100, 450, 300);
		frmSesion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSesion.getContentPane().setLayout(null);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		btnAceptar.setBounds(276, 236, 91, 28);
		frmSesion.getContentPane().add(btnAceptar);
		
		JLabel label = new JLabel("");
		label.setBounds(10, 233, 46, 14);
		frmSesion.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("Imagenes"+File.separator+"tarificador.jpg"));
		lblNewLabel.setBounds(10, 125, 185,139);
		frmSesion.getContentPane().add(lblNewLabel);
		
		JLabel lblTarificadorSa = new JLabel("Tarificador SA");
		lblTarificadorSa.setHorizontalAlignment(SwingConstants.CENTER);
		lblTarificadorSa.setBounds(196, 11, 102, 14);
		frmSesion.getContentPane().add(lblTarificadorSa);
		
		JButton btnIniciarSesion = new JButton("Iniciar sesion");
		btnIniciarSesion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnIniciarSesion.setBackground(Color.LIGHT_GRAY);
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sesion miSesion = new sesion ();
				miSesion.setVisible(true);
				miSesion.setDefaultCloseOperation(1);
			}
		});
		btnIniciarSesion.setBounds(253, 57, 134, 23);
		frmSesion.getContentPane().add(btnIniciarSesion);
		
		JButton btnAbandonarSistema = new JButton("Abandonar sistema");
		btnAbandonarSistema.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				
			}
		});
		btnAbandonarSistema.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAbandonarSistema.setBackground(Color.LIGHT_GRAY);
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnAbandonarSistema.setBounds(250, 153, 137, 23);
		frmSesion.getContentPane().add(btnAbandonarSistema);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBackground(Color.LIGHT_GRAY);
		btnRegistrarse.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnRegistrarse.setBounds(265, 105, 108, 23);
		frmSesion.getContentPane().add(btnRegistrarse);
		
	}
}
