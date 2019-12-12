package ramess;
import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class temperature {

	private JFrame frame;
	private JTextField input;
	private  String flag=" ";
	private String count=" ";
	private String str;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					temperature window = new temperature();
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
	public temperature() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 459);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblInput = new JLabel("Input");
		lblInput.setHorizontalAlignment(SwingConstants.CENTER);
		lblInput.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblInput.setBounds(46, 34, 120, 26);
		frame.getContentPane().add(lblInput);
		
		input = new JTextField();
		input.setBounds(176, 34, 196, 26);
		frame.getContentPane().add(input);
		input.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Input Scale");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 130, 120, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Output Scale");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(315, 130, 109, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton celcius = new JRadioButton("Celcius");
		celcius.setFont(new Font("Tahoma", Font.PLAIN, 18));
		celcius.setBounds(21, 181, 109, 23);
		frame.getContentPane().add(celcius);
		
		JRadioButton fheit = new JRadioButton("Fahrenheit");
		fheit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		fheit.setBounds(21, 241, 109, 23);
		frame.getContentPane().add(fheit);
		
		JRadioButton kelvin = new JRadioButton("Kelvin");
		kelvin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		kelvin.setBounds(21, 304, 109, 23);
		frame.getContentPane().add(kelvin);
		
		JRadioButton celcius1 = new JRadioButton("Celcius");
		celcius1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		celcius1.setBounds(315, 184, 109, 23);
		frame.getContentPane().add(celcius1);
		
		JRadioButton fheit1 = new JRadioButton("Fahrenheit");
		fheit1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		fheit1.setBounds(315, 244, 109, 23);
		frame.getContentPane().add(fheit1);
		
		JRadioButton kelvin1 = new JRadioButton("Kelvin");
		kelvin1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		kelvin1.setBounds(315, 307, 109, 23);
		frame.getContentPane().add(kelvin1);
		
		JLabel lblNewLabel_2 = new JLabel("Output");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(84, 365, 82, 26);
		frame.getContentPane().add(lblNewLabel_2);
		ButtonGroup button=new ButtonGroup();
		button.add(celcius);
		button.add(fheit);
		button.add(kelvin);
		ButtonGroup b=new ButtonGroup();
		b.add(celcius1);
		b.add(fheit1);
		b.add(kelvin1);
		
		JLabel label = new JLabel("");
		label.setBounds(176, 365, 196, 26);
		frame.getContentPane().add(label);
		kelvin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		{
			if(kelvin.isSelected())
			flag="k";
		}
		
	}});
		celcius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			{
				if(celcius.isSelected())
				flag="c";
			}
			
		}});
		fheit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			{
				if(fheit.isSelected())
				flag="f";	
			}
			
		}});
		kelvin1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			{
				if(kelvin1.isSelected())
				count="3";	
			}
			
		}});
		celcius1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			{
				if(celcius1.isSelected())
				count="1";	
			}
			
		}});
		fheit1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			{
				if(fheit1.isSelected())
				count="2";	
			}
			
			}});
		if(flag.equals("c")&&count.equals("3"))
		{
			float m=Float.parseFloat(input.getText());
			float j=(float)(m+273);
			str=Float.toString(j);
			label.setText(str);
			
		}
		if(flag.equals("c")&&count.equals("1"))
		{
			label.setText(input.getText());
		}
		if(flag.equals("c")&&count.equals("2"))
		{
			float m=Float.parseFloat(input.getText());
			float j=(float)((m-32)*0.5559);
			String str=Float.toString(j);
			label.setText(str);
			
		}
		if(flag.equals("k")&&count.equals("1"))
		{
			float m=Float.parseFloat(input.getText());
			float j=(float)(m-273);
			String str=Float.toString(j);
			label.setText(str);
			
		}
		if(flag.equals("k")&&count.equals("2"))
		{
			float m=Float.parseFloat(input.getText());
			float j=(float)(m*1.8-459.87);
			String str=Float.toString(j);
			label.setText(str);
			
		}
		if(flag.equals("k")&&count.equals("3"))
		{
			label.setText(input.getText());
			
		}
		if(flag.equals("f")&&count.equals("1"))
		{
			float m=Float.parseFloat(input.getText());
			float j=(float)(m*1.8+32);
			String str=Float.toString(j);
			label.setText(str);
			
		}
		if(flag.equals("f")&&count.equals("2"))
		{
			label.setText(input.getText());
			
		}
		if(flag.equals("f")&&count.equals("3"))
		{
			float m=Float.parseFloat(input.getText());
			float j=(float)(m-32*0.5559+273.15);
			String str=Float.toString(j);
			label.setText(str);
			
		}
}}
