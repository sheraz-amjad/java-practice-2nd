import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class FormSubmitted extends JFrame implements ActionListener {

	private Container c;
	private JLabel label1,label2,label3,label4,label5,lblMsg;
	JTextField 	txtName,txtPhone;
	JRadioButton rbMale,rbFemale;
	JComboBox 	cbDay,cbMonth,cbYear;
	JTextArea	taDetail,taAddress;
	JCheckBox 	cbTerms;
	JButton 	btnSubmit;
	ButtonGroup rbGroup;
	
	public FormSubmitted() {
		setTitle("Registration Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		c = getContentPane();
		c.setLayout(null);
		
		label1 = new JLabel("Name: ");
		label1.setBounds( 20,50,100,20);
		c.add(label1);
		
		txtName = new JTextField();
		txtName.setBounds(130,50,100,20);
		c.add(txtName);
		
		label2 = new JLabel("Phone: ");
		label2.setBounds( 20,100,100,20);
		c.add(label2);
		
		txtPhone = new JTextField();
		txtPhone.setBounds(130,100,100,20);
		c.add(txtPhone);
		
		label3 = new JLabel("Gender:");
		label3.setBounds(20,150,100,20);
		c.add(label3);
		
		rbMale = new JRadioButton("Male");
		rbMale.setBounds(130,150,80,20);
		c.add(rbMale);
		
		rbFemale = new JRadioButton("Female");
		rbFemale.setBounds(220,150,80, 20);
		c.add(rbFemale);
		
		rbGroup = new ButtonGroup();
		rbGroup.add(rbMale);
		rbGroup.add(rbFemale);
		
		label4 = new JLabel("DOB");
		label4.setBounds(20,200,100,20);
		c.add(label4);
		String[] days= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20",
				"21","22","23","24","25","26","27","28","29","30","31"};
		String[] months= {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		String[] years= {"2003","2022","2021","2020","2019","2018","2017","2016","2015","2014","2013","2012"};
		
		DefaultComboBoxModel<String> comboModelDays = new DefaultComboBoxModel<String>(days);
		cbDay = new JComboBox<>(comboModelDays);
		
		DefaultComboBoxModel<String> comboModelMonths = new DefaultComboBoxModel<String>(months);
		cbMonth = new JComboBox<>(comboModelMonths);
		
		DefaultComboBoxModel<String> comboModelYears = new DefaultComboBoxModel<String>(years);
		cbYear	= new JComboBox<>(comboModelYears);
		
		cbDay.setBounds(130,200,50,20);
		cbMonth.setBounds(190,200,50,20);
		cbYear.setBounds(250,200,60,20);
		
		c.add(cbDay);
		c.add(cbMonth);
		c.add(cbYear);
		
		label5 = new JLabel("Address:");
		label5.setBounds(20,250,100,20);
		c.add(label5);
		
		taAddress = new JTextArea();
		taAddress.setBounds(130,240,200,50);
		c.add(taAddress);
		
		cbTerms = new JCheckBox("Please Accecpt Terms and Conditions:");
		cbTerms.setBounds(50,300,250,20);
		c.add(cbTerms);
		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(150,350,80,20);
		c.add(btnSubmit);
		
		btnSubmit.addActionListener(this);
		
		taDetail = new JTextArea();
		taDetail.setBounds(350,50,300,300);
		c.add(taDetail);
		
		lblMsg = new JLabel();
		lblMsg.setBounds(20,400,250,20);
		c.add(lblMsg);	
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
			
		if(cbTerms.isSelected()) {
			
			String name =txtName.getText();
			String mobile = txtPhone.getText();
			String gender = "Male";
			if(rbFemale.isSelected()) {
				gender = "Female";
			}
			
			String dob = (String)cbDay.getSelectedItem()+"-"+ (String)cbMonth.getSelectedItem()+"-"+ (String)cbYear.getSelectedItem()   ;
			String address = taAddress.getText();
			
			taDetail.setText("Name: "+name+"\n\n Mobile: "+mobile+"\nGender: "+gender+"\nDob: "+dob+"\nAddress: "+address);

			lblMsg.setText("Registration Successfull..!");
		}else {
			lblMsg.setText("Please Accecpt Terms and Conditions..!");
		}		
	}
	
	public static void main(String[] args) {
		FormSubmitted fm = new FormSubmitted();
	}
}