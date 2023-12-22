import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtUserName;
	private JPasswordField txtPassword;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbllogin = new JLabel("Student Login");
		lbllogin.setHorizontalAlignment(SwingConstants.CENTER);
		lbllogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbllogin.setBounds(49, 11, 313, 34);
		contentPane.add(lbllogin);
		
		JLabel lblId = new JLabel("Id");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblId.setHorizontalAlignment(SwingConstants.LEFT);
		lblId.setBounds(37, 75, 46, 14);
		contentPane.add(lblId);
		
		JLabel lblNewLabel_2 = new JLabel("UserName");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(37, 107, 72, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPassword.setBounds(37, 142, 61, 14);
		contentPane.add(lblPassword);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/lab5","root","");
					java.sql.Statement stmt = con.createStatement();
					System.out.println("Inserting Records");
					int id = Integer.parseInt(txtId.getText());
					String UserName = txtId.getText();
					String Password = txtPassword.getText();
					String sql = "insert into Lab5.Student(Id,Password) values("+id+",'"+UserName+",'"+Password+"')";
			System.out.println(sql);
			stmt.executeUpdate(sql);
			con.close();
			System.out.println("Record Inserted");}
				catch(Exception err) {System.out.println("Record Inserted");}

			}
		});
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSave.setBounds(85, 200, 89, 23);
		contentPane.add(btnSave);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnClear.setBounds(229, 200, 89, 23);
		contentPane.add(btnClear);
		
		txtId = new JTextField();
		txtId.setBounds(135, 72, 160, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		txtUserName = new JTextField();
		txtUserName.setBounds(135, 104, 160, 20);
		contentPane.add(txtUserName);
		txtUserName.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(135, 139, 160, 20);
		contentPane.add(txtPassword);
	}
}
