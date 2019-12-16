package ramess;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class hotelmanagementsystem {

	private JFrame frame;
	private JTextField cb;
	private JTextField meal;
	private JTextField cheese;
	private JTextField qty;
	private JTextField convertf;
	private JTextField cd;
	private JTextField cm;
	private JTextField delivery;
	private JTextField taxtf;
	private JTextField subtotal;
	private JTextField totaltf;
	private JTextField screen;
	String sign;
	float a,b,sum=0,m=1,sub=0,d=1;
	int f=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hotelmanagementsystem window = new hotelmanagementsystem();
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
	public hotelmanagementsystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1129, 596);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hotel Management system");
		lblNewLabel.setBounds(151, 11, 607, 49);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		frame.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(432, 260, 1, 2);
		frame.getContentPane().add(separator);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 92, 436, 240);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Chicken burger");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 11, 152, 25);
		panel.add(lblNewLabel_1);
		
		cb = new JTextField();
		cb.setBounds(183, 11, 243, 25);
		panel.add(cb);
		cb.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Chicken Burger Meal");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(10, 47, 161, 25);
		panel.add(lblNewLabel_2);
		
		meal = new JTextField();
		meal.setBounds(183, 47, 243, 25);
		panel.add(meal);
		meal.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Cheese Burger");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(10, 83, 161, 25);
		panel.add(lblNewLabel_3);
		
		cheese = new JTextField();
		cheese.setBounds(183, 83, 243, 25);
		panel.add(cheese);
		cheese.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 124, 399, 2);
		panel.add(separator_1);
		
		JLabel lblNewLabel_4 = new JLabel("Drink");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(10, 134, 117, 25);
		panel.add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tea", "Juice", "Fresh Lime", "Milk Shake", "Cold Coffee"}));
		comboBox.setBounds(10, 165, 117, 25);
		panel.add(comboBox);
		
		JLabel lblNewLabel_5 = new JLabel("Qty");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(197, 134, 136, 25);
		panel.add(lblNewLabel_5);
		
		qty = new JTextField();
		qty.setBounds(194, 165, 139, 25);
		panel.add(qty);
		qty.setColumns(10);
		
		JRadioButton homedelivery = new JRadioButton("Home Delivery");
		homedelivery.setFont(new Font("Tahoma", Font.PLAIN, 18));
		homedelivery.setBounds(10, 210, 152, 23);
		panel.add(homedelivery);
		
		JRadioButton tax = new JRadioButton("Tax");
		tax.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tax.setBounds(197, 211, 109, 25);
		panel.add(tax);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(456, 92, 302, 240);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Currency Converter");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_6.setBounds(10, 11, 235, 26);
		panel_1.add(lblNewLabel_6);
		
		JComboBox convert = new JComboBox();
		convert.setModel(new DefaultComboBoxModel(new String[] {"Ruppee", "Euro", "Pound", "Yen"}));
		convert.setBounds(45, 51, 235, 26);
		panel_1.add(convert);
		
		convertf = new JTextField();
		convertf.setBounds(45, 113, 235, 26);
		panel_1.add(convertf);
		convertf.setColumns(10);
		
		JButton Convertbutton = new JButton("Convert");
		Convertbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(convert.getSelectedItem()=="Ruppee")
				{
					convertf.setText(Float.toString(Float.parseFloat(totaltf.getText())*71.63f));
				}
				if(convert.getSelectedItem()=="Euro")
					convertf.setText(Float.toString((Float.parseFloat(totaltf.getText())*0.91f))+" Euro");
				if(convert.getSelectedItem()=="Pound")
					convertf.setText(Float.toString((Float.parseFloat(totaltf.getText())*0.78f))+" Pound");
				if(convert.getSelectedItem()=="Yen")
					convertf.setText(Float.toString((Float.parseFloat(totaltf.getText())*109.00f))+" Yen");
			}
		});
		Convertbutton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Convertbutton.setBounds(29, 188, 93, 26);
		panel_1.add(Convertbutton);
		
		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				convertf.setText(" ");
			}
		});
		clear.setFont(new Font("Tahoma", Font.PLAIN, 18));
		clear.setBounds(191, 188, 89, 26);
		panel_1.add(clear);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 343, 461, 156);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("Cost of drinks");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(10, 11, 194, 21);
		panel_2.add(lblNewLabel_7);
		
		cd = new JTextField();
		cd.setBounds(256, 11, 135, 21);
		panel_2.add(cd);
		cd.setColumns(10);
		
		JLabel lblCostOfMeals = new JLabel("Cost of meals");
		lblCostOfMeals.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCostOfMeals.setBounds(10, 43, 194, 21);
		panel_2.add(lblCostOfMeals);
		
		cm = new JTextField();
		cm.setBounds(256, 43, 135, 21);
		panel_2.add(cm);
		cm.setColumns(10);
		
		JLabel lblCostOfDelivery = new JLabel("Cost of delivery");
		lblCostOfDelivery.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCostOfDelivery.setBounds(10, 79, 194, 21);
		panel_2.add(lblCostOfDelivery);
		
		delivery = new JTextField();
		delivery.setBounds(256, 81, 135, 21);
		panel_2.add(delivery);
		delivery.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(481, 343, 278, 156);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblTax.setBounds(10, 11, 106, 23);
		panel_3.add(lblTax);
		
		JLabel lblNewLabel_8 = new JLabel("Sub Total");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(10, 45, 106, 23);
		panel_3.add(lblNewLabel_8);
		
		JLabel total = new JLabel("Total");
		total.setFont(new Font("Tahoma", Font.PLAIN, 18));
		total.setBounds(10, 79, 106, 23);
		panel_3.add(total);
		
		taxtf = new JTextField();
		taxtf.setBounds(126, 11, 129, 23);
		panel_3.add(taxtf);
		taxtf.setColumns(10);
		
		subtotal = new JTextField();
		subtotal.setBounds(126, 45, 129, 23);
		panel_3.add(subtotal);
		subtotal.setColumns(10);
		
		totaltf = new JTextField();
		totaltf.setBounds(126, 79, 129, 23);
		panel_3.add(totaltf);
		totaltf.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 510, 1072, 48);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(cb.getText());
				int b=Integer.parseInt(meal.getText());
				int c=Integer.parseInt(cheese.getText());
				int q=Integer.parseInt(qty.getText());
			if(comboBox.getSelectedItem()=="Tea")
			{
				cd.setText(Float.toString(1.2f*q));
			}
			if(comboBox.getSelectedItem()=="Juice")
			{
			cd.setText(Float.toString(5*q));	
			}
			if(comboBox.getSelectedItem()=="Fresh Lime")
			{
			cd.setText(Float.toString(1.6f*q));	
			}
			if(comboBox.getSelectedItem()=="Milk Shake")
			{
			cd.setText(Float.toString(8*q));	
			}
			if(comboBox.getSelectedItem()=="Cold Coffee")
			{
			cd.setText(Float.toString(8*q));	
			}
			cm.setText(Float.toString((b*15)+(a*10)+(c*12)));
			if(homedelivery.isSelected())
			{
				delivery.setText("10");
			}
			else
				delivery.setText("0");
			subtotal.setText(Float.toString(Float.parseFloat(cd.getText())+Float.parseFloat(cm.getText())+Float.parseFloat(delivery.getText())));
			if(tax.isSelected())
				taxtf.setText(Float.toString((Float.parseFloat(subtotal.getText())*.15f)));
			else taxtf.setText("0");
			totaltf.setText(Float.toString(Float.parseFloat(taxtf.getText())+Float.parseFloat(subtotal.getText())));
			
		}});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(88, 11, 110, 23);
		panel_5.add(btnNewButton);
		
		
			
		JButton btnNewButton_3 = new JButton("Exit");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_3.setBounds(477, 11, 89, 26);
		panel_5.add(btnNewButton_3);
		
		JTabbedPane Calculator = new JTabbedPane(JTabbedPane.TOP);
		Calculator.setBounds(768, 92, 314, 407);
		Calculator.setToolTipText("Calculator");
		Calculator.setSelectedIndex(-1);
		frame.getContentPane().add(Calculator);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Calculator.addTab("Calculator", null, panel_4, null);
		
		screen = new JTextField();
		screen.setColumns(10);
		screen.setBounds(10, 11, 294, 37);
		panel_4.add(screen);
		
		JButton btnB = new JButton("B");
		btnB.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnB.setBounds(20, 79, 61, 37);
		panel_4.add(btnB);
		
		JButton bc = new JButton("C");
		bc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText(" ");
				f=0;
			}
		});
		bc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		bc.setBounds(91, 79, 55, 37);
		panel_4.add(bc);
		
		JButton button_2 = new JButton("...");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_2.setBounds(156, 79, 55, 37);
		panel_4.add(button_2);
		
		JButton ba = new JButton("+");
		ba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sign="+";
			 a=Float.parseFloat(screen.getText());
			 screen.setText(" ");
			 f=0;
			}
		});
		ba.setFont(new Font("Tahoma", Font.BOLD, 18));
		ba.setBounds(221, 79, 55, 37);
		panel_4.add(ba);
		
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText(screen.getText().concat(b7.getText()));
			}
		});
		b7.setFont(new Font("Tahoma", Font.BOLD, 18));
		b7.setBounds(20, 139, 61, 37);
		panel_4.add(b7);
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText(screen.getText().concat(b8.getText()));
			}
		});
		b8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		b8.setBounds(91, 139, 55, 37);
		panel_4.add(b8);
		
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText(screen.getText().concat(b8.getText()));
			}
		});
		b9.setFont(new Font("Tahoma", Font.BOLD, 18));
		b9.setBounds(156, 139, 55, 37);
		panel_4.add(b9);
		
		JButton bs = new JButton("-");
		bs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sign="-";
				a=Float.parseFloat(screen.getText());
				screen.setText(" ");
				f=0;
			}
		});
		bs.setFont(new Font("Tahoma", Font.BOLD, 18));
		bs.setBounds(221, 139, 55, 37);
		panel_4.add(bs);
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText(screen.getText().concat(b4.getText()));
			}
		});
		b4.setFont(new Font("Tahoma", Font.BOLD, 18));
		b4.setBounds(20, 206, 61, 37);
		panel_4.add(b4);
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText(screen.getText().concat(b5.getText()));
			}
		});
		b5.setFont(new Font("Tahoma", Font.BOLD, 18));
		b5.setBounds(91, 206, 55, 37);
		panel_4.add(b5);
		
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText(screen.getText().concat(b6.getText()));
			}
		});
		b6.setFont(new Font("Tahoma", Font.BOLD, 18));
		b6.setBounds(156, 206, 55, 37);
		panel_4.add(b6);
		
		JButton bm = new JButton("*");
		bm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sign="*";
				a=Float.parseFloat(screen.getText());
				screen.setText(" ");
				f=0;
			}
		});
		bm.setFont(new Font("Tahoma", Font.BOLD, 18));
		bm.setBounds(221, 206, 55, 37);
		panel_4.add(bm);
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText(screen.getText().concat(b1.getText()));
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 18));
		b1.setBounds(20, 267, 61, 37);
		panel_4.add(b1);
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText(screen.getText().concat(b2.getText()));
			}
		});
		b2.setFont(new Font("Tahoma", Font.BOLD, 18));
		b2.setBounds(91, 267, 55, 37);
		panel_4.add(b2);
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText(screen.getText().concat(b3.getText()));
			}
		});
		b3.setFont(new Font("Tahoma", Font.BOLD, 18));
		b3.setBounds(156, 267, 55, 37);
		panel_4.add(b3);
		
		JButton bd = new JButton("/");
		bd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sign="/";
				a=Float.parseFloat(screen.getText());
				screen.setText(" ");
				f=0;
			}
		});
		bd.setFont(new Font("Tahoma", Font.BOLD, 18));
		bd.setBounds(221, 267, 55, 37);
		panel_4.add(bd);
		
		JButton b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText(screen.getText().concat(b3.getText()));
			}
		});
		b0.setFont(new Font("Tahoma", Font.BOLD, 18));
		b0.setBounds(20, 335, 61, 37);
		panel_4.add(b0);
		
		JButton dot = new JButton(".");
		dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==0)
				screen.setText(screen.getText().concat(dot.getText()));
				f=1;
			}
		});
		dot.setFont(new Font("Tahoma", Font.BOLD, 18));
		dot.setBounds(91, 335, 55, 37);
		panel_4.add(dot);
		
		JButton button_18 = new JButton("...");
		button_18.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_18.setBounds(156, 335, 55, 37);
		panel_4.add(button_18);
		
		JButton be = new JButton("=");
		be.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(sign)
				{
				case "+":
					b=Float.parseFloat(screen.getText());
					sum=a+b;
					screen.setText(Float.toString(sum));
					break;
				case "-":
					b=Float.parseFloat(screen.getText());
					sub=a-b;
					screen.setText(Float.toString(sub));
					break;
				case "*":
					b=Float.parseFloat(screen.getText());
					m=a*b;
					screen.setText(Float.toString(m));
					break;
				case "/":
					b=Float.parseFloat(screen.getText());
					d=a/b;
					screen.setText(Float.toString(d));
					break;
					default:
						screen.setText("invalid operation");
				}
			}
		});
		be.setFont(new Font("Tahoma", Font.BOLD, 18));
		be.setBounds(221, 335, 55, 37);
		panel_4.add(be);
		
		JPanel panel_6 = new JPanel();
		Calculator.addTab("Receipt", null, panel_6, null);
		panel_6.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 0, 309, 379);
		panel_6.add(textArea);
		JButton btnNewButton_1 = new JButton("Receipt");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("Receipt \n"+
						"================= \n"
						+"Chicken Burger=\t"+cb.getText()+"\n"
						+"Chicken Burger meal=\t"+meal.getText()+"\n"
						+"cheese Burger=\t"+cheese.getText()+"\n"
						+"Cost of meals=\t"+cm.getText()+"\n"
						+"Cost of drinks=\t"+comboBox.getSelectedItem()+" * "+qty.getText()+"=\t"+cd.getText()+"\n"
						+"Home Delivery Charge=\t"+delivery.getText()+"\n"
						+"Tax=\t"+taxtf.getText()+"\n"
						+"Total=\t"+totaltf.getText());
			}
		});
		
		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cb.setText(" ");
				cm.setText(" ");
				cheese.setText(" ");
				qty.setText(" ");
				comboBox.setSelectedItem("Tea");
				cd.setText(" ");
				meal.setText(" ");
				delivery.setText(" ");
				taxtf.setText(" ");
				subtotal.setText(" ");
				totaltf.setText(" ");
				screen.setText(" ");
				textArea.setText(" ");
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_2.setBounds(347, 11, 89, 26);
		panel_5.add(btnNewButton_2);

		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(219, 11, 89, 26);
		panel_5.add(btnNewButton_1);
	}
}
