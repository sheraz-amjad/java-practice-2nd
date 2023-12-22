package finalroject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class cs41 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cs41 window = new cs41();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public cs41() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 303, 318);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(175, 44, 91, 36);
		frame.getContentPane().add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(175, 120, 91, 40);
		frame.getContentPane().add(textArea_2);aa
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextArea textArea_3 = new JTextArea();
				textArea_3= textArea_1 + textArea_2;
			}
		});
		btnEqual.setBounds(53, 191, 41, 28);
		frame.getContentPane().add(btnEqual);
		
		textField = new JTextField();
		textField.setBounds(104, 191, 86, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSum = new JButton("+");
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btnSum.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSum.setBounds(39, 230, 55, 28);
		frame.getContentPane().add(btnSum);
		
		JButton btnMult = new JButton("*");
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMult.setBounds(124, 230, 55, 28);
		frame.getContentPane().add(btnMult);
		
		JLabel lblNewLabel = new JLabel("Enter 1st Value");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(26, 40, 137, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter 2nd Value");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(25, 125, 124, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ans");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 193, 41, 28);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
