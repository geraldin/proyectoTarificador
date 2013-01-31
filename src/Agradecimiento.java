import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;


public class Agradecimiento extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agradecimiento frame = new Agradecimiento();
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
	public Agradecimiento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblTarificadorSa = new JLabel("Tarificador SA");
		contentPane.add(lblTarificadorSa, BorderLayout.NORTH);
		
		JButton btnSalir = new JButton("salir");
		btnSalir.setBackground(Color.LIGHT_GRAY);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(btnSalir, BorderLayout.SOUTH);
		
		JLabel lblGraciasPorUtilizar = new JLabel("Gracias por utilizar nuestro servicio");
		lblGraciasPorUtilizar.setBackground(new Color(0, 191, 255));
		lblGraciasPorUtilizar.setHorizontalAlignment(SwingConstants.CENTER);
		lblGraciasPorUtilizar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblGraciasPorUtilizar, BorderLayout.CENTER);
	}

}
