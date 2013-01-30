package proyecto1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Toolkit;
import javax.swing.JProgressBar;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.border.EtchedBorder;

public class tarificador {

	private JFrame frmTarificadorSa;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tarificador window = new tarificador();
					window.frmTarificadorSa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tarificador() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTarificadorSa = new JFrame();
		frmTarificadorSa.setBackground(Color.ORANGE);
		frmTarificadorSa.setIconImage(Toolkit.getDefaultToolkit().getImage(tarificador.class.getResource("/javax/swing/plaf/metal/icons/ocean/menu.gif")));
		frmTarificadorSa.setTitle("Tarificador SA");
		frmTarificadorSa.getContentPane().setBackground(Color.GRAY);
		frmTarificadorSa.setBounds(100, 100, 450, 300);
		frmTarificadorSa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTarificadorSa.getContentPane().setLayout(null);
		
		JLabel lblTarificadorSa = new JLabel("Tarificador sa");
		lblTarificadorSa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTarificadorSa.setBounds(166, 11, 134, 26);
		frmTarificadorSa.getContentPane().add(lblTarificadorSa);
		
		JLabel lblPorFavorDeslize = new JLabel("Por favor, Deslize su tarjeta por la ranura");
		lblPorFavorDeslize.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPorFavorDeslize.setBounds(110, 60, 282, 69);
		frmTarificadorSa.getContentPane().add(lblPorFavorDeslize);
		
		JLabel lblWwwtarificadorcom = new JLabel("www.tarificador.com\r\n");
		lblWwwtarificadorcom.setToolTipText("");
		lblWwwtarificadorcom.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblWwwtarificadorcom.setBounds(0, 259, 114, 14);
		frmTarificadorSa.getContentPane().add(lblWwwtarificadorcom);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("Imagenes//tarificador.jpg"));
		lblNewLabel.setSize(20, 20);
		lblNewLabel.setBounds(144, 106, 122, 122);
		frmTarificadorSa.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				toro miToro = new toro ();
				miToro.setVisible(true);
				miToro.setDefaultCloseOperation(1);
			}
		});
		btnNewButton.setBounds(175, 239, 91, 23);
		frmTarificadorSa.getContentPane().add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(58, 60, 334, 2);
		frmTarificadorSa.getContentPane().add(separator);
		
		table = new JTable();
		table.setBounds(293, 89, 163, 180);
		frmTarificadorSa.getContentPane().add(table);
		
	}

	protected void setDefaultCloseOperation(int i) {
		// TODO Auto-generated method stub
		
	}

	protected void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
