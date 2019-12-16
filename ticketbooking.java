package ramess;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.event.*;
import java.sql.Date;
import java.text.DateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.text.DateFormat;
public class ticketbooking {

	
	private JFrame frame;
	private JTextField name;
	private JTextField tax;
	private JTextField subtotal;
	private JTextField total;
	private JTextField name1;
	private JTextField from;
	private JTextField to;
	private JTextField date;
	private JTextField time;
	private JTextField ticketno;
	private JTextField price;
	private JTextField route;
	private JTable table;
	private float a;
	private int tno=1221;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticketbooking window = new ticketbooking();
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
	public ticketbooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 984, 588);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(446, 64, 475, 339);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Ticket Booking", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblName_1.setBounds(10, 28, 111, 24);
		panel.add(lblName_1);
		
		name1 = new JTextField();
		name1.setBounds(131, 26, 149, 24);
		panel.add(name1);
		name1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("From");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(10, 89, 90, 24);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("To");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(10, 138, 90, 24);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Date");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(10, 192, 90, 24);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Time");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(10, 244, 90, 24);
		panel.add(lblNewLabel_6);
		
		from = new JTextField();
		from.setBounds(110, 89, 120, 24);
		panel.add(from);
		from.setColumns(10);
		
		to = new JTextField();
		to.setBounds(110, 136, 120, 24);
		panel.add(to);
		to.setColumns(10);
		
		date = new JTextField();
		date.setBounds(110, 190, 120, 24);
		panel.add(date);
		date.setColumns(10);
		
		time = new JTextField();
		time.setBounds(110, 242, 120, 24);
		panel.add(time);
		time.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Ticket No");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(283, 89, 103, 19);
		panel.add(lblNewLabel_7);
		
		ticketno = new JTextField();
		ticketno.setBounds(283, 113, 103, 24);
		panel.add(ticketno);
		ticketno.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Price");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(283, 143, 103, 24);
		panel.add(lblNewLabel_8);
		
		price = new JTextField();
		price.setBounds(283, 179, 103, 24);
		panel.add(price);
		price.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Route");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_9.setBounds(283, 214, 103, 24);
		panel.add(lblNewLabel_9);
		
		route = new JTextField();
		route.setBounds(283, 246, 103, 24);
		panel.add(route);
		route.setColumns(10);
		JComboBox combofrom = new JComboBox();
		combofrom.setFont(new Font("Tahoma", Font.PLAIN, 13));
		combofrom.setModel(new DefaultComboBoxModel(new String[] {"Thrissur", "Chalakkudy", "Eranakulam", "Kottayam", "Kollam"}));
		combofrom.setBounds(10, 229, 108, 20);
		frame.getContentPane().add(combofrom);
		
		JComboBox comboto = new JComboBox();
		comboto.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboto.setModel(new DefaultComboBoxModel(new String[] {"Thrissur", "Chalakkudy", "Eranakulam", "Kottayam", "Kollam"}));
		comboto.setBounds(129, 229, 111, 20);
		frame.getContentPane().add(comboto);
		
		JComboBox number = new JComboBox();
		number.setFont(new Font("Tahoma", Font.PLAIN, 14));
		number.setModel(new DefaultComboBoxModel(new String[] {"1","2","3","4","5"}));
		number.setBounds(266, 229, 109, 20);
		frame.getContentPane().add(number);
		
		JButton confirm = new JButton("Confirm");
		confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new String[]{
					name.getText(),
					ticketno.getText(),
					(String)combofrom.getSelectedItem(),
					(String)comboto.getSelectedItem(),
					(String)number.getSelectedItem(),
					time.getText(),
					date.getText(),
					null,
					price.getText()
				});
			}
			
		});
		confirm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		confirm.setBounds(191, 294, 111, 34);
		panel.add(confirm);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLUE);
		panel_1.setBounds(10, 424, 948, 115);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Booking No", "From", "To", "No:of Seats", "Time", "Date", "AC/NON AC", "Price"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 11, 928, 93);
		panel_1.add(table);
		
		JLabel label = new JLabel("");
		label.setBounds(194, 11, 46, 14);
		frame.getContentPane().add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(174, 11, 458, 51);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblTicketBorder = new JLabel("Ticket Booking");
		lblTicketBorder.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblTicketBorder.setHorizontalAlignment(SwingConstants.CENTER);
		lblTicketBorder.setBounds(41, 11, 379, 29);
		panel_2.add(lblTicketBorder);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblName.setBounds(10, 105, 108, 22);
		frame.getContentPane().add(lblName);
		
		name = new JTextField();
		name.setBounds(129, 105, 184, 24);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 149, 409, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBackground(Color.BLACK);
		separator_1.setForeground(Color.GRAY);
		separator_1.setBounds(429, 149, 1, 232);
		frame.getContentPane().add(separator_1);
		
		JRadioButton std = new JRadioButton("Standard");
		std.setFont(new Font("Tahoma", Font.PLAIN, 14));
		std.setBounds(9, 161, 109, 23);
		frame.getContentPane().add(std);
		
		JRadioButton st = new JRadioButton("Single Ticket");
		st.setFont(new Font("Tahoma", Font.PLAIN, 14));
		st.setBounds(131, 161, 109, 23);
		frame.getContentPane().add(st);
		
		JRadioButton adult = new JRadioButton("Adult");
		adult.setFont(new Font("Tahoma", Font.PLAIN, 14));
		adult.setBounds(249, 161, 109, 23);
		frame.getContentPane().add(adult);
		
		JRadioButton fc = new JRadioButton("First Class");
		fc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		fc.setBounds(10, 199, 109, 23);
		frame.getContentPane().add(fc);
		
		JRadioButton ac = new JRadioButton("A/c");
		ac.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ac.setBounds(131, 199, 61, 23);
		frame.getContentPane().add(ac);
		
		JRadioButton sleeper = new JRadioButton("Sleeper");
		sleeper.setFont(new Font("Tahoma", Font.PLAIN, 14));
		sleeper.setBounds(217, 200, 109, 23);
		frame.getContentPane().add(sleeper);
		
		JRadioButton child = new JRadioButton("Child");
		child.setFont(new Font("Tahoma", Font.PLAIN, 14));
		child.setBounds(338, 198, 89, 25);
		frame.getContentPane().add(child);
		ButtonGroup button=new ButtonGroup();
		button.add(st);
		button.add(adult);
		button.add(child);
		ButtonGroup group=new ButtonGroup();
		group.add(ac);
		group.add(sleeper);
		group.add(fc);
		group.add(std);
		
		
	
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 262, 409, 2);
		frame.getContentPane().add(separator_2);
		
		JLabel tf = new JLabel("Tax");
		tf.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tf.setBounds(10, 275, 108, 22);
		frame.getContentPane().add(tf);
		
		JLabel stotal = new JLabel("Sub Total");
		stotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		stotal.setBounds(10, 312, 108, 22);
		frame.getContentPane().add(stotal);
		
		JLabel lblNewLabel_2 = new JLabel("Total");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(10, 348, 108, 22);
		frame.getContentPane().add(lblNewLabel_2);
		
		tax = new JTextField();
		tax.setBounds(131, 275, 86, 20);
		frame.getContentPane().add(tax);
		tax.setColumns(10);
		
		subtotal = new JTextField();
		subtotal.setBounds(129, 313, 86, 20);
		frame.getContentPane().add(subtotal);
		subtotal.setColumns(10);
		
		total = new JTextField();
		total.setBounds(131, 349, 86, 20);
		frame.getContentPane().add(total);
		total.setColumns(10);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 375, 409, 2);
		frame.getContentPane().add(separator_3);
		
		JButton totalbutton = new JButton("Total");
		totalbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tax.setText("30");
			if(std.isSelected()&&adult.isSelected())
			{
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="Thrissur")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="Chalakkudy")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*30;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="Eranakulam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*60;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="Kottayam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*90;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*120;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="chalakkudy"&&comboto.getSelectedItem()=="Chalakkudy")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Chalakkudy"&&comboto.getSelectedItem()=="Eranakulam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*40;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Chalakkudy"&&comboto.getSelectedItem()=="Kottayam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*80;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Chalakkudy"&&comboto.getSelectedItem()=="Kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*110;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Eranakulam"&&comboto.getSelectedItem()=="Eranakulam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Eranakulam"&&comboto.getSelectedItem()=="Kottayam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*50;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Eranakulam"&&comboto.getSelectedItem()=="kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*100;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Kottayam"&&comboto.getSelectedItem()=="kottayam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Kottayam"&&comboto.getSelectedItem()=="kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*70;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Kollam"&&comboto.getSelectedItem()=="kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			}
			if(st.isSelected()&&child.isSelected())
			{
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="Thrissur")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="Chalakkudy")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*5;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="Eranakulam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*10;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="Kottayam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*15;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*20;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="chalakkudy"&&comboto.getSelectedItem()=="Chalakkudy")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Chalakkudy"&&comboto.getSelectedItem()=="Eranakulam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*5;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Chalakkudy"&&comboto.getSelectedItem()=="Kottayam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*10;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Chalakkudy"&&comboto.getSelectedItem()=="Kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*15;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Eranakulam"&&comboto.getSelectedItem()=="Eranakulam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Eranakulam"&&comboto.getSelectedItem()=="Kottayam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*5;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Eranakulam"&&comboto.getSelectedItem()=="kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*10;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Kottayam"&&comboto.getSelectedItem()=="kottayam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Kottayam"&&comboto.getSelectedItem()=="kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*5;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Kollam"&&comboto.getSelectedItem()=="kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			}
			if(fc.isSelected()&&adult.isSelected())
			{
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="Thrissur")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="Chalakkudy")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*40;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="Eranakulam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*80;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="Kottayam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*120;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*160;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="chalakkudy"&&comboto.getSelectedItem()=="Chalakkudy")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Chalakkudy"&&comboto.getSelectedItem()=="Eranakulam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*50;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Chalakkudy"&&comboto.getSelectedItem()=="Kottayam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*100;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Chalakkudy"&&comboto.getSelectedItem()=="Kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*150;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Eranakulam"&&comboto.getSelectedItem()=="Eranakulam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Eranakulam"&&comboto.getSelectedItem()=="Kottayam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*50;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Eranakulam"&&comboto.getSelectedItem()=="kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*100;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Kottayam"&&comboto.getSelectedItem()=="kottayam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Kottayam"&&comboto.getSelectedItem()=="kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*90;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Kollam"&&comboto.getSelectedItem()=="kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			}
			if(fc.isSelected()&&child.isSelected())
			{
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="Thrissur")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="Chalakkudy")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*5;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="Eranakulam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*10;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="Kottayam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*15;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*20;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="chalakkudy"&&comboto.getSelectedItem()=="Chalakkudy")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Chalakkudy"&&comboto.getSelectedItem()=="Eranakulam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*5;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Chalakkudy"&&comboto.getSelectedItem()=="Kottayam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*10;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Chalakkudy"&&comboto.getSelectedItem()=="Kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*15;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Eranakulam"&&comboto.getSelectedItem()=="Eranakulam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Eranakulam"&&comboto.getSelectedItem()=="Kottayam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*5;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Eranakulam"&&comboto.getSelectedItem()=="kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*10;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Kottayam"&&comboto.getSelectedItem()=="kottayam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Kottayam"&&comboto.getSelectedItem()=="kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*5;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Kollam"&&comboto.getSelectedItem()=="kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			}
			if(sleeper.isSelected()&&adult.isSelected())
			{
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="Thrissur")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="Chalakkudy")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*100;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="Eranakulam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*200;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="Kottayam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*300;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*400;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="chalakkudy"&&comboto.getSelectedItem()=="Chalakkudy")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Chalakkudy"&&comboto.getSelectedItem()=="Eranakulam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*100;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Chalakkudy"&&comboto.getSelectedItem()=="Kottayam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*200;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Chalakkudy"&&comboto.getSelectedItem()=="Kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*300;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Eranakulam"&&comboto.getSelectedItem()=="Eranakulam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Eranakulam"&&comboto.getSelectedItem()=="Kottayam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*100;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Eranakulam"&&comboto.getSelectedItem()=="kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*200;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Kottayam"&&comboto.getSelectedItem()=="kottayam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Kottayam"&&comboto.getSelectedItem()=="kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*100;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Kollam"&&comboto.getSelectedItem()=="kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			}
			if(sleeper.isSelected()&&child.isSelected())
			{
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="Thrissur")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="Chalakkudy")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*60;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="Eranakulam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*120;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="Kottayam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*180;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*240;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="chalakkudy"&&comboto.getSelectedItem()=="Chalakkudy")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Chalakkudy"&&comboto.getSelectedItem()=="Eranakulam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*60;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Chalakkudy"&&comboto.getSelectedItem()=="Kottayam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*120;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Chalakkudy"&&comboto.getSelectedItem()=="Kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*180;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Eranakulam"&&comboto.getSelectedItem()=="Eranakulam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Eranakulam"&&comboto.getSelectedItem()=="Kottayam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*60;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Eranakulam"&&comboto.getSelectedItem()=="kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*120;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Kottayam"&&comboto.getSelectedItem()=="kottayam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Kottayam"&&comboto.getSelectedItem()=="kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*60;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Kollam"&&comboto.getSelectedItem()=="kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			}
			if(ac.isSelected()&&child.isSelected())
			{
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="Thrissur")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="Chalakkudy")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*100;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="Eranakulam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*200;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="Kottayam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*300;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*400;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="chalakkudy"&&comboto.getSelectedItem()=="Chalakkudy")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Chalakkudy"&&comboto.getSelectedItem()=="Eranakulam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*100;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Chalakkudy"&&comboto.getSelectedItem()=="Kottayam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*200;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Chalakkudy"&&comboto.getSelectedItem()=="Kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*300;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Eranakulam"&&comboto.getSelectedItem()=="Eranakulam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Eranakulam"&&comboto.getSelectedItem()=="Kottayam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*100;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Eranakulam"&&comboto.getSelectedItem()=="kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*200;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Kottayam"&&comboto.getSelectedItem()=="kottayam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Kottayam"&&comboto.getSelectedItem()=="kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*100;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Kollam"&&comboto.getSelectedItem()=="kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			}
			if(ac.isSelected()&&adult.isSelected())
			{
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="Thrissur")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="Chalakkudy")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*200;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="Eranakulam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*400;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="Kottayam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*600;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Thrissur"&&comboto.getSelectedItem()=="kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*800;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="chalakkudy"&&comboto.getSelectedItem()=="Chalakkudy")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Chalakkudy"&&comboto.getSelectedItem()=="Eranakulam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*200;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Chalakkudy"&&comboto.getSelectedItem()=="Kottayam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*400;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Chalakkudy"&&comboto.getSelectedItem()=="Kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*600;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Eranakulam"&&comboto.getSelectedItem()=="Eranakulam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Eranakulam"&&comboto.getSelectedItem()=="Kottayam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*200;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Eranakulam"&&comboto.getSelectedItem()=="kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*400;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Kottayam"&&comboto.getSelectedItem()=="kottayam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Kottayam"&&comboto.getSelectedItem()=="kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*200;
			  subtotal.setText(String.valueOf(a));	
			}
			if(combofrom.getSelectedItem()=="Kollam"&&comboto.getSelectedItem()=="kollam")
			{
				String Str=(String)number.getSelectedItem();
				float b=Float.parseFloat(Str);
				a=b*0;
			  subtotal.setText(String.valueOf(a));	
			}
			}
           float x=Float.parseFloat(subtotal.getText());
           float y=Float.parseFloat(tax.getText());
           float z=x+y;
        		   total.setText(Float.toString(z));
			name1.setText(name.getText());
			from.setText((String)combofrom.getSelectedItem());
			to.setText((String)comboto.getSelectedItem());
			Date now=new Date(1);
			time.setText(DateFormat.getTimeInstance().format(now));
			date.setText(DateFormat.getInstance().format(now));
			ticketno.setText(String.valueOf(tno++));
			price.setText(total.getText());
			route.setText("Any");
			}
		});
		totalbutton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		totalbutton.setBounds(29, 390, 89, 23);
		frame.getContentPane().add(totalbutton);
		
		JButton reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name.setText(" ");
				combofrom.setSelectedItem("Thrissur");
				comboto.setSelectedItem("Thrissur");
				tax.setText(" ");
				subtotal.setText(" ");
				total.setText(" ");
				name1.setText(" ");
		       from.setText(" ");
		       to.setText(" ");
		       date.setText(" ");
		       time.setText(" ");
		       ticketno.setText( " ");
		       price.setText(" ");
		       route.setText(" ");
			}
		});
		reset.setFont(new Font("Tahoma", Font.PLAIN, 18));
		reset.setBounds(151, 390, 89, 23);
		frame.getContentPane().add(reset);
		
		JButton exit = new JButton("Exit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		exit.setBounds(286, 390, 89, 23);
		frame.getContentPane().add(exit);
		
		
		
	}
}
