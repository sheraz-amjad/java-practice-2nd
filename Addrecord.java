import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Addrecord {

	private JFrame frmMyProject;
	private JTextField textField;
	private JTextField textField1;
	private JTextField textField2;
	String phone;
	String Name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Addrecord window = new Addrecord();
					window.frmMyProject.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Addrecord() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMyProject = new JFrame();
		frmMyProject.setFont(new Font("Dialog", Font.BOLD, 16));
		frmMyProject.setTitle("MY PROJECT");
		frmMyProject.setBounds(100, 100, 320, 302);
		frmMyProject.setResizable(
);
		frmMyProject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMyProject.getContentPane().setLayout(null);
		
		JLabel lblphone = new JLabel("Phone");
		lblphone.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblphone.setBounds(10, 45, 62, 34);
		frmMyProject.getContentPane().add(lblphone);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblName.setBounds(10, 89, 62, 34);
		frmMyProject.getContentPane().add(lblName);
		
		JLabel lblshow = new JLabel("");
		lblshow.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblshow.setBounds(25, 204, 255, 28);
		frmMyProject.getContentPane().add(lblshow);
		
		JButton btnadd = new JButton("Add");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 phone = String.format(textField1.getText());
				 Name = String.format(textField2.getText());
				textField1.setText("");
				textField2.setText("");
				lblshow.setText("Record has been added successfuly !");
			}
		});
		btnadd.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnadd.setBounds(56, 134, 113, 28);
		frmMyProject.getContentPane().add(btnadd);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField1.setText(null);
				textField2.setText(null);
				lblshow.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnClear.setBounds(182, 134, 112, 27);
		frmMyProject.getContentPane().add(btnClear);
		
		textField1 = new JTextField();
		textField1.setBounds(82, 50, 194, 24);
		frmMyProject.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(82, 94, 194, 24);
		frmMyProject.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		
		
	
	}
}
