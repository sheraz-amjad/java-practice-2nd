import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class GuiForm extends JFrame {

	private JPanel contentPane;
	private JTextField txtEmail;
	private JTextField txtName;
	private JTextField txtLastName;
	private JPasswordField txtPassword;
	private JPasswordField txtConfirm;
	private JTextField textRoll;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiForm frame = new GuiForm();
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
	public GuiForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration Form");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(147, 11, 156, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(10, 71, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblName.setBounds(10, 96, 46, 14);
		contentPane.add(lblName);
		
		txtEmail = new JTextField();
		txtEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Email =txtEmail.getText();
			}
		});
		txtEmail.setBounds(90, 69, 179, 20);
		contentPane.add(txtEmail);
		
		txtName = new JTextField();
		txtName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Name =txtName.getText();
			}
		});
		txtName.setBounds(90, 94, 180, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JButton btnCreate = new JButton("Create Account");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NextGui obj = new NextGui();
				obj.setVisible(true);
				setVisible(false);
			}
		});
		btnCreate.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCreate.setBounds(90, 264, 135, 23);
		contentPane.add(btnCreate);
		
		JButton btnClear = new JButton("clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtEmail.setText(null);
				txtName.setText(null);
				textRoll.setText(null);
				txtPassword.setText(null);
				txtConfirm.setText(null);
				txtLastName.setText(null);
				clearNext wtf = new clearNext();
				wtf.setVisible(true);
				setVisible(false);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnClear.setBounds(267, 264, 89, 23);
		contentPane.add(btnClear);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLastName.setBounds(10, 121, 63, 14);
		contentPane.add(lblLastName);
		
		txtLastName = new JTextField();
		txtLastName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String LastName =txtLastName.getText();
			}
		});
		txtLastName.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtLastName.setBounds(90, 119, 179, 20);
		contentPane.add(txtLastName);
		txtLastName.setColumns(10);
		
		JLabel lblExpertise = new JLabel("Expertise");
		lblExpertise.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblExpertise.setBounds(10, 146, 70, 21);
		contentPane.add(lblExpertise);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Programming");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton.setBounds(90, 146, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Web");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnNewRadioButton_1.setBounds(201, 146, 70, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPassword.setBounds(10, 185, 63, 14);
		contentPane.add(lblPassword);
		
		txtPassword = new JPasswordField();
		txtPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char[] Password =txtPassword.getPassword();
			}
		});
		txtPassword.setBounds(90, 183, 179, 20);
		contentPane.add(txtPassword);
		
		JLabel lblConfirm = new JLabel("Confirm Password");
		lblConfirm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblConfirm.setBounds(10, 221, 79, 25);
		contentPane.add(lblConfirm);
		
		txtConfirm = new JPasswordField();
		txtConfirm.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtConfirm.setBounds(90, 224, 179, 20);
		contentPane.add(txtConfirm);
		
		JLabel lblRoll = new JLabel("RollNo");
		lblRoll.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRoll.setBounds(283, 72, 57, 14);
		contentPane.add(lblRoll);
		
		textRoll = new JTextField();
		textRoll.setFont(new Font("Tahoma", Font.BOLD, 11));
		textRoll.setBounds(355, 69, 79, 20);
		contentPane.add(textRoll);
		textRoll.setColumns(10);
		
		JLabel lblSemester = new JLabel("Semester");
		lblSemester.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSemester.setBounds(280, 97, 60, 14);
		contentPane.add(lblSemester);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGender.setBounds(279, 122, 46, 14);
		contentPane.add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		buttonGroup.add(rdbtnMale);
		rdbtnMale.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnMale.setBounds(325, 145, 89, 23);
		contentPane.add(rdbtnMale);
		
		JRadioButton rdbtnOther = new JRadioButton("Other");
		buttonGroup.add(rdbtnOther);
		rdbtnOther.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnOther.setBounds(325, 171, 89, 23);
		contentPane.add(rdbtnOther);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3"}));
		comboBox.setBounds(355, 93, 79, 22);
		contentPane.add(comboBox);
	}
}

