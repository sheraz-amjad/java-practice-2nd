import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NextGui extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public NextGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel FormSubmitted = new JLabel("Sucessfully Executed");
		FormSubmitted.setBackground(Color.BLACK);
		FormSubmitted.setFont(new Font("Tahoma", Font.BOLD, 25));
		FormSubmitted.setBounds(75, 89, 302, 79);
		panel.add(FormSubmitted);
		
		JButton btnreturn = new JButton("return");
		btnreturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				public void actionPerformed1(ActionEvent e) {
					GuiForm obj = new GuiForm ();
					obj.setVisible(true);
					setVisible(false);
			}
		});
		btnreturn.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnreturn.setBounds(10, 203, 89, 23);
		panel.add(btnreturn);
	}
}
