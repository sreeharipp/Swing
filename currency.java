package ramess;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.awt.event.*;
public class currency {

	private JFrame frame;
	private JTextField value;
	private JTextField outputvalue;
    private float a;
    private float b;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					currency window = new currency();
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
	public currency() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 535, 453);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label1 = new JLabel("Input");
		label1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label1.setBounds(29, 63, 113, 23);
		frame.getContentPane().add(label1);
		
		JComboBox inputcombo = new JComboBox();
		inputcombo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		inputcombo.setModel(new DefaultComboBoxModel(new String[] {"RUPPEE", "USD", "POUND", "DINAR"}));
		inputcombo.setBounds(233, 67, 137, 20);
		frame.getContentPane().add(inputcombo);
		
		JLabel lblEnterTheValue = new JLabel("Enter the value");
		lblEnterTheValue.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEnterTheValue.setBounds(29, 121, 137, 23);
		frame.getContentPane().add(lblEnterTheValue);
		
		value = new JTextField();
		value.setHorizontalAlignment(SwingConstants.RIGHT);
		value.setBounds(233, 121, 137, 24);
		frame.getContentPane().add(value);
		value.setColumns(10);
		
		JLabel lblOutput = new JLabel("Output");
		lblOutput.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblOutput.setBounds(29, 176, 113, 23);
		frame.getContentPane().add(lblOutput);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"RUPPEE", "USD", "POUND", "DINAR"}));
		comboBox.setBounds(233, 180, 137, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel lkjhg = new JLabel("Value");
		lkjhg.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lkjhg.setBounds(29, 236, 113, 23);
		frame.getContentPane().add(lkjhg);
		
		outputvalue = new JTextField();
		outputvalue.setHorizontalAlignment(SwingConstants.LEFT);
		outputvalue.setFont(new Font("Tahoma", Font.PLAIN, 18));
		outputvalue.setBounds(233, 236, 137, 24);
		frame.getContentPane().add(outputvalue);
		outputvalue.setColumns(10);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnExit.setBounds(103, 327, 102, 31);
		frame.getContentPane().add(btnExit);
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 a=Float.parseFloat(value.getText());
				if(inputcombo.getSelectedItem()=="USD")
					convertdollar();
			 if(inputcombo.getSelectedItem()=="RUPPEE")
				 convertruppee();
			if(inputcombo.getSelectedItem()=="POUND")
					convertpound();
			if(inputcombo.getSelectedItem()=="DINAR") 
			        convertdinar();
				
					
			}

			public void convertdinar() {
				if(comboBox.getSelectedItem()=="USD")
				{
					b=(float)(a*3.29);
					outputvalue.setText(String.valueOf(b));
				}
				 if(comboBox.getSelectedItem()=="POUND")
				{
					b=(float)(a*2.55);
					outputvalue.setText(Float.toString(b));
					
				}
				 if(comboBox.getSelectedItem()=="RUPPEE") 
				{
				 b=(float)(a*236.22);
					outputvalue.setText(Double.toString(b));
				}
				if(comboBox.getSelectedItem()=="DINAR")
				{
					outputvalue.setText(value.getText());
				}
			}

			public void convertpound() {
				// TODO Auto-generated method stub
				
				if(comboBox.getSelectedItem()=="USD")
				{
					 b=(float)(a*1.29);
					outputvalue.setText(Double.toString(b));
				}
				else if(comboBox.getSelectedItem()=="DINAR")
				{
					b=(float)(a*0.39);
					outputvalue.setText(Double.toString(b));
					
				}
				else if(comboBox.getSelectedItem()=="RUPPEE") 
				{
					 b=(float)(a*92.63);
					outputvalue.setText(Double.toString(b));
				}
				else 
				{
					outputvalue.setText(value.getText());
				}
			}

			public void convertruppee() {
				if(comboBox.getSelectedItem()=="USD")
				{
					b=(float)(a*0.014);
					outputvalue.setText(String.valueOf(b));
				}
				 if(comboBox.getSelectedItem()=="POUND")
				{
					b=(float)(a*0.011);
					outputvalue.setText(Double.toString(b));
					
				}
				 if(comboBox.getSelectedItem()=="DINAR") 
				{
				 b=(float)(a*0.0042);
					outputvalue.setText(Double.toString(b));
				}
				if(comboBox.getSelectedItem()=="RUPPEE")
				{
					outputvalue.setText(value.getText());
				}
			}

			public void convertdollar() {
				if(comboBox.getSelectedItem()=="DINAR")
				{
					b=(float)(a*0.30);
					outputvalue.setText(String.valueOf(b));
				}
				 if(comboBox.getSelectedItem()=="POUND")
				{
					b=(float)(a*0.77);
					outputvalue.setText(Double.toString(b));
					
				}
				 if(comboBox.getSelectedItem()=="RUPPEE") 
				{
				 b=(float)(a*71.74);
					outputvalue.setText(Double.toString(b));
				}
				if(comboBox.getSelectedItem()=="USD")
				{
					outputvalue.setText(value.getText());
				}
					
			}});
			
					
		
		btnNewButton.setBounds(252, 327, 102, 30);
		frame.getContentPane().add(btnNewButton);
	}
}
