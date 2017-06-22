import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JCheckBox;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Restaurant {

	private JFrame frame;
	private JTextField jwine;
	private JTextField jbeer;
	private JTextField jwhisky;
	private JTextField jEnergy;
	private JTextField jwater;
	private JTextField jice;
	private JTextField jsnack;
	private JTextField jlemon;
	private JTextField jRecipt;
	private JTextField jqty;
	private JTextField jcountry;

	double firstnum;
	double secondnum;
	double result;
	String Opertions;
	String Answer;
	
	int ops ;
	
	double usa = 0.67;
	double india = 1;
	double germany= 0.30;
	double italy = 0.65;
	double canada = 0.34;
	double pakistan = 40;
	double bhutan = 100;
	double npal = 30;//USA", "INDIA", "GERMANY", "ITALY", "CANADA", "PAKISTAN", "BHUTAN", "NEPAL"
	private JTextField textField;
	private JTextField textField_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurant window = new Restaurant();
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
	public Restaurant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.setBounds(33, 76, 537, 216);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblWine = new JLabel("Wine");
		lblWine.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblWine.setBounds(31, 35, 46, 21);
		panel.add(lblWine);
		
		JLabel lblBeer = new JLabel("Beer");
		lblBeer.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblBeer.setBounds(31, 67, 46, 14);
		panel.add(lblBeer);
		
		JLabel lblWhisky = new JLabel("Whisky");
		lblWhisky.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblWhisky.setBounds(31, 92, 73, 21);
		panel.add(lblWhisky);
		
		JLabel lblEnergyDrink = new JLabel("Energy Drink");
		lblEnergyDrink.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEnergyDrink.setBounds(31, 124, 116, 21);
		panel.add(lblEnergyDrink);
		
		jwine = new JTextField("0");
		jwine.setBounds(149, 38, 86, 20);
		panel.add(jwine);
		jwine.setColumns(10);
		
		jbeer = new JTextField("0");
		jbeer.setBounds(149, 67, 86, 20);
		panel.add(jbeer);
		jbeer.setColumns(10);
		
		jwhisky = new JTextField("0");
		jwhisky.setBounds(149, 95, 86, 20);
		panel.add(jwhisky);
		jwhisky.setColumns(10);
		
		jEnergy = new JTextField("0");
		jEnergy.setBounds(149, 127, 86, 20);
		panel.add(jEnergy);
		jEnergy.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Water");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(311, 38, 73, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ice Cubes");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(311, 67, 97, 14);
		
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Snacks");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setBounds(311, 95, 97, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Lemon");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_3.setBounds(311, 127, 97, 14);
		panel.add(lblNewLabel_3);
		
		jwater = new JTextField("0");
		jwater.setBounds(394, 38, 86, 20);
		panel.add(jwater);
		jwater.setColumns(10);
		
		jice = new JTextField("0");
		jice.setBounds(394, 67, 86, 20);
		panel.add(jice);
		jice.setColumns(10);
		
		jsnack = new JTextField("0");
		jsnack.setBounds(394, 95, 86, 20);
		panel.add(jsnack);
		jsnack.setColumns(10);
		
		jlemon = new JTextField("0");
		jlemon.setBounds(394, 126, 86, 23);
		panel.add(jlemon);
		jlemon.setColumns(10);
		
		JLabel lblDrinks = new JLabel("Drinks");
		lblDrinks.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDrinks.setBounds(226, 11, 129, 21);
		panel.add(lblDrinks);
		
		JCheckBox jhome = new JCheckBox("Home Delivery");
		jhome.setBounds(397, 184, 97, 23);
		panel.add(jhome);
		
		JCheckBox jTax = new JCheckBox("Tax");
		jTax.setBounds(298, 185, 97, 21);
		panel.add(jTax);
		
		JComboBox jDDRR = new JComboBox();
		jDDRR.setModel(new DefaultComboBoxModel(new String[] {"Select here", "Pepsi", "Coca-Cola", "Mirinda", "Limca", "7-up", "Mountain Dew", "Nimboz"}));
		jDDRR.setBounds(31, 185, 116, 20);
		panel.add(jDDRR);
		
		jqty = new JTextField("0");
		jqty.setBounds(173, 185, 86, 20);
		panel.add(jqty);
		jqty.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("Cold Drink");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_18.setBounds(31, 156, 116, 14);
		panel.add(lblNewLabel_18);
		
		JLabel lblQty = new JLabel("Qty.");
		lblQty.setBounds(173, 170, 46, 14);
		panel.add(lblQty);
		
		JLabel lblSdf = new JLabel("Rs.80/P");
		lblSdf.setBounds(236, 41, 46, 14);
		panel.add(lblSdf);
		
		JLabel lblNewLabel_8 = new JLabel("Rs.99/P");
		lblNewLabel_8.setBounds(236, 70, 46, 14);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Rs.180/P");
		lblNewLabel_9.setBounds(236, 98, 65, 14);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Rs.22/P");
		lblNewLabel_10.setBounds(236, 130, 46, 14);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Rs.20/P");
		lblNewLabel_11.setBounds(481, 41, 46, 14);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_15 = new JLabel("Rs.55/P");
		lblNewLabel_15.setBounds(481, 70, 46, 14);
		panel.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Rs.65/P");
		lblNewLabel_16.setBounds(481, 98, 46, 14);
		panel.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Rs.95/P");
		lblNewLabel_17.setBounds(481, 130, 46, 14);
		panel.add(lblNewLabel_17);
		
		JPanel Jcodrink = new JPanel();
		Jcodrink.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		Jcodrink.setBounds(33, 303, 537, 177);
		frame.getContentPane().add(Jcodrink);
		Jcodrink.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Cost of Drink");
		lblNewLabel_4.setBounds(35, 30, 79, 14);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		Jcodrink.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Cost of Cold Drink");
		lblNewLabel_5.setBounds(35, 68, 112, 14);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		Jcodrink.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Cost of Delivery");
		lblNewLabel_6.setBounds(35, 104, 89, 14);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		Jcodrink.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Total");
		lblNewLabel_7.setBounds(35, 135, 79, 14);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		Jcodrink.add(lblNewLabel_7);
		
		JLabel jcodrink = new JLabel("0");
		jcodrink.setHorizontalAlignment(SwingConstants.RIGHT);
		jcodrink.setBounds(175, 20, 89, 24);
		jcodrink.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jcodrink.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		Jcodrink.add(jcodrink);
		
		JLabel jcDrink = new JLabel("0");
		jcDrink.setHorizontalAlignment(SwingConstants.RIGHT);
		jcDrink.setBounds(175, 58, 89, 24);
		jcDrink.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jcDrink.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		Jcodrink.add(jcDrink);
		
		JLabel jcod = new JLabel("0");
		jcod.setHorizontalAlignment(SwingConstants.RIGHT);
		jcod.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jcod.setBounds(175, 93, 89, 25);
		jcod.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		Jcodrink.add(jcod);
		
		JLabel JTOTAL = new JLabel("0");
		JTOTAL.setHorizontalAlignment(SwingConstants.RIGHT);
		JTOTAL.setFont(new Font("Tahoma", Font.BOLD, 18));
		JTOTAL.setBounds(175, 125, 89, 24);
		JTOTAL.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		Jcodrink.add(JTOTAL);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_2.setBounds(943, 76, 382, 405);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 27, 362, 367);
		panel_2.add(tabbedPane);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Recipt", null, panel_6, null);
		panel_6.setLayout(null);
		
		jRecipt = new JTextField();
		jRecipt.setBounds(0, 11, 357, 317);
		jRecipt.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_6.add(jRecipt);
		jRecipt.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_7, null);
		panel_7.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("<-");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String back=null;
				if(textField.getText().length()>0){
					StringBuilder ss = new StringBuilder(textField.getText());
					ss.deleteCharAt(textField.getText().length() -1);
					back = ss.toString();
					textField.setText(back);
				}
			}
		});
		btnNewButton_2.setBounds(25, 81, 50, 50);
		panel_7.add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(25, 27, 228, 43);
		panel_7.add(textField);
		textField.setColumns(10);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnC.setBounds(85, 81, 50, 50);
		panel_7.add(btnC);
		
		JButton button = new JButton("%");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				Opertions="%";
			}
		});
		button.setBounds(145, 81, 50, 50);
		panel_7.add(button);
		
		JButton button_1 = new JButton("+");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				Opertions="+";
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_1.setBounds(203, 81, 50, 50);
		panel_7.add(button_1);
		
		JButton button_3 = new JButton("9");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber= textField.getText() + button_3.getText();
				textField.setText(EnterNumber);
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_3.setForeground(Color.BLACK);
		button_3.setBounds(145, 131, 50, 50);
		panel_7.add(button_3);
		
		JButton button_4 = new JButton("8");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber= textField.getText() + button_4.getText();
				textField.setText(EnterNumber);
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_4.setBounds(85, 131, 50, 50);
		panel_7.add(button_4);
		
		JButton button_5 = new JButton("7");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				String EnterNumber= textField.getText() + button_5.getText();
				textField.setText(EnterNumber);
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_5.setBounds(25, 131, 50, 50);
		panel_7.add(button_5);
		
		JButton button_6 = new JButton("-");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				Opertions="-";
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_6.setBounds(203, 131, 50, 50);
		panel_7.add(button_6);
		
		JButton button_7 = new JButton("6");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber= textField.getText() + button_7.getText();
				textField.setText(EnterNumber);
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_7.setBounds(145, 180, 50, 50);
		panel_7.add(button_7);
		
		JButton button_8 = new JButton("5");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber= textField.getText() + button_8.getText();
				textField.setText(EnterNumber);
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_8.setBounds(85, 180, 50, 50);
		panel_7.add(button_8);
		
		JButton button_9 = new JButton("4");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber= textField.getText() + button_9.getText();
				textField.setText(EnterNumber);
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_9.setBounds(25, 180, 50, 50);
		panel_7.add(button_9);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				Opertions="*";
			}
		});
		btnX.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnX.setBounds(203, 180, 50, 50);
		panel_7.add(btnX);
		
		JButton button_11 = new JButton("3");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber= textField.getText() + button_11.getText();
				textField.setText(EnterNumber);
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_11.setBounds(145, 231, 50, 50);
		panel_7.add(button_11);
		
		JButton button_12 = new JButton("0");
		button_12.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber= textField.getText() + button_12.getText();
				textField.setText(EnterNumber);
			}
		});
		button_12.setBounds(25, 280, 50, 48);
		panel_7.add(button_12);
		
		JButton button_13 = new JButton(".");
		button_13.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_13.setBounds(85, 280, 50, 48);
		panel_7.add(button_13);
		
		JButton button_14 = new JButton("2");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber= textField.getText() + button_14.getText();
				textField.setText(EnterNumber);
			}
		});
		button_14.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_14.setBounds(85, 231, 50, 50);
		panel_7.add(button_14);
		
		JButton button_15 = new JButton("1");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber= textField.getText() + button_15.getText();
				textField.setText(EnterNumber);
			}
		});
		button_15.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_15.setBounds(25, 231, 50, 50);
		panel_7.add(button_15);
		
		JButton button_16 = new JButton("/");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				Opertions="/";
			}
		});
		button_16.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_16.setBounds(203, 231, 50, 50);
		panel_7.add(button_16);
		
		JButton button_17 = new JButton("=");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum = Double.parseDouble(textField.getText());
				if(Opertions=="+"){
					
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if(Opertions=="-"){
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if(Opertions=="*"){
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(Opertions=="/"){
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(Opertions=="%"){
					result = firstnum % secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		button_17.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_17.setBounds(203, 280, 50, 50);
		panel_7.add(button_17);
		
		JButton button_18 = new JButton("+ -");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(String.valueOf(textField.getText()));
				
				
				ops=ops*(-1);
			textField.setText(String.valueOf(ops));
			}
		});
		button_18.setBounds(145, 280, 50, 49);
		panel_7.add(button_18);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(580, 76, 353, 216);
		frame.getContentPane().add(panel_3);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_3.setLayout(null);
		
		
		
		JComboBox jchoose = new JComboBox();
		jchoose.setBounds(94, 48, 169, 44);
		jchoose.setFont(new Font("Tahoma", Font.PLAIN, 17));
		jchoose.setModel(new DefaultComboBoxModel(new String[] {"Choose", "USA", "INDIA", "GERMANY", "ITALY", "CANADA", "PAKISTAN", "BHUTAN", "NEPAL"}));
		panel_3.add(jchoose);
		
		
		
		
		JLabel jcountrys = new JLabel("");
		jcountrys.setBounds(131, 134, 87, 20);
		jcountrys.setFont(new Font("Tahoma", Font.PLAIN, 17));
		jcountrys.setHorizontalAlignment(SwingConstants.RIGHT);
		jcountrys.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		panel_3.add(jcountrys);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.setBounds(236, 163, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				jcountry.setText(null);
				jcountrys.setText(null);
				jchoose.setSelectedItem("Choose");
				
			}
		});
		panel_3.add(btnNewButton);
		
		
		jcountry = new JTextField();
		jcountry.setHorizontalAlignment(SwingConstants.RIGHT);
		jcountry.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jcountry.setBounds(132, 103, 86, 20);
		panel_3.add(jcountry);
		jcountry.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Convert");
		btnNewButton_1.setBounds(41, 163, 89, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				//USA", "INDIA", "GERMANY", "ITALY", "CANADA", "PAKISTAN", "BHUTAN", "NEPAL"
				double A= Double.parseDouble(jcountry.getText());
			if (jchoose.getSelectedItem().equals("USA"))
			{
				String usas = String.format("%.2f",usa*A );
				jcountrys.setText(usas);
			}
				
			
			if(jchoose.getSelectedItem().equals("INDIA"))
			{
				String indian = String.format("%.2f", A*india);
				jcountrys.setText(indian);
			}
			
			if(jchoose.getSelectedItem().equals("GERMANY"))
			{
				String geramn= String.format("%.2f", A*germany);
				jcountrys.setText(geramn);
			}
			
			if (jchoose.getSelectedItem().equals("ITALY"))
			{
				String ital = String.format("%.2f",italy*A );
				jcountrys.setText(ital);
			}
				
			
			if(jchoose.getSelectedItem().equals("CANADA"))
			{
				String cana = String.format("%.2f", A*canada);
				jcountrys.setText(cana);
			}
			
			if(jchoose.getSelectedItem().equals("PAKISTAN"))
			{
				String paki= String.format("%.2f", A*pakistan);
				jcountrys.setText(paki);
			}
			
			if(jchoose.getSelectedItem().equals("BHUTAN"))
			{
				String but= String.format("%.2f", A*bhutan);
				jcountrys.setText(but);
			}
			
			if(jchoose.getSelectedItem().equals("NEPAL")){
				String nep= String.format("%.2f",A* npal );
				jcountrys.setText(nep);
			}
			
			}
		});
		panel_3.add(btnNewButton_1);
		
		JLabel lblDollorToInr = new JLabel(" To INR");
		lblDollorToInr.setBounds(150, 23, 67, 14);
		lblDollorToInr.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_3.add(lblDollorToInr);
		
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(580, 303, 353, 177);
		frame.getContentPane().add(panel_4);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_12 = new JLabel(" Service TAX");
		lblNewLabel_12.setBounds(38, 45, 90, 14);
		panel_4.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Sub Total");
		lblNewLabel_13.setBounds(38, 87, 70, 14);
		panel_4.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Grand Total");
		lblNewLabel_14.setBounds(38, 125, 70, 14);
		panel_4.add(lblNewLabel_14);
		
		JLabel iTax = new JLabel("0");
		iTax.setFont(new Font("Tahoma", Font.PLAIN, 16));
		iTax.setHorizontalAlignment(SwingConstants.RIGHT);
		iTax.setBounds(205, 34, 123, 25);
		iTax.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		panel_4.add(iTax);
		
		JLabel iSub = new JLabel("0");
		iSub.setFont(new Font("Tahoma", Font.PLAIN, 16));
		iSub.setHorizontalAlignment(SwingConstants.RIGHT);
		iSub.setBounds(205, 76, 123, 25);
		iSub.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		panel_4.add(iSub);
		
		JLabel GTo = new JLabel("0");
		GTo.setFont(new Font("Tahoma", Font.BOLD, 18));
		GTo.setHorizontalAlignment(SwingConstants.RIGHT);
		GTo.setBounds(205, 112, 123, 27);
		GTo.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		panel_4.add(GTo);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_5.setBounds(33, 491, 1292, 149);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Wine= Double.parseDouble(jwine.getText()) ;
				double iWine = 80;
				double wine;
				wine= (Wine * iWine);
				String pWine = String.format("%.2f", wine);
				jcodrink.setText(pWine);
				
			    double Beer = Double.parseDouble(jbeer.getText());
			    double iBeer = 99;
			    double beer;
			    beer= (Beer * iBeer);
			    String pBeer = String.format("%.2f", wine+ beer);
			    jcodrink.setText(pBeer);
				
				double Whisky= Double.parseDouble(jwhisky.getText());
				double iWhisky=180;
				double whisky;
				whisky = (Whisky* iWhisky);
				String pWhisky = String.format("%.2f", wine+beer+whisky);
				jcodrink.setText(pWhisky);
				
				double Energy = Double.parseDouble(jEnergy.getText());
				double iEnergy = 22;
				double energy = (Energy*iEnergy );
				String pEnergy= String.format("%.2f", wine+beer+whisky +energy);
				jcodrink.setText(pEnergy);
				
				double Water=Double.parseDouble(jwater.getText());
				double iWater=20;
				double water = (Water*iWater);
				String pwater= String.format("%.2f", water+ energy +wine +beer +whisky);
				jcodrink.setText(pwater);

				double ice= Double.parseDouble(jice.getText());
				double iice= 55;
				double Ice=(ice*iice);
				String pIce= String.format("%.2f", Ice);
				jcodrink.setText(pIce);
			
				
				double Snak= Double.parseDouble(jsnack.getText());
				double iSnak = 65;
				double snak= (Snak*iSnak);
				String pSnak= String.format("%.2f", Ice+water+snak+ wine+beer+whisky+ energy);
				jcodrink.setText(pSnak);
				
				
				
				double Lemon = Double.parseDouble(jlemon.getText());
				double ilemon = 95;
				double lemon= (ilemon*Lemon);
				String pLemon= String.format("%.2f", Ice+energy +snak+wine+beer+whisky+water+lemon);
				jcodrink.setText(pLemon);
				
				double iDel= 70;
				if(jhome.isSelected()){
					String pDel= String.format("%.2f", iDel);
					jcod.setText(pDel);
				}
				else
				{
					jcod.setText("0");
				}
				
				
				double Drinks  = Double.parseDouble(jqty.getText());  
				double Peps=55*Drinks;
				double CocaCola= 50*Drinks;
				double Mirinda= 65*Drinks;
				double Limca= 95*Drinks;
				double up= 60*Drinks;
				double Mountain= 55*Drinks;
				double Nimboz= 20*Drinks;
				
				if(jDDRR.getSelectedItem().equals("Pepsi")){
					String pPep= String.format("%.2f", Peps);
					jcDrink.setText(pPep);
				}
				
				
				if(jDDRR.getSelectedItem().equals("Coca-Cola")){
							String pCoca= String.format("%.2f", CocaCola);
							jcDrink.setText(pCoca);
						}
				
		
					if(jDDRR.getSelectedItem().equals("Mirinda")){
					String pMir = String.format("%.2f", Mirinda);
					jcDrink.setText(pMir);
				}
				
					
				if(jDDRR.getSelectedItem().equals("Limca")){
					String pLim = String.format("%.2f", Limca);
					jcDrink.setText(pLim);
				}
				
				
				if(jDDRR.getSelectedItem().equals("7-up")){
					String pup= String.format("%.2f",up);
					jcDrink.setText(pup);
				}
				
				
				if(jDDRR.getSelectedItem().equals("Mountain Dew"));{				
					String pmoun= String.format("%.2f", Mountain);
					jcDrink.setText(pmoun);
				}			
				
							
				if(jDDRR.getSelectedItem().equals("Nimboz"))
			     {
					String pNim = String.format("  %.2f", Nimboz);
					jcDrink.setText(pNim);
				}
	
				if(jDDRR.getSelectedItem().equals("Select here")){
				jcDrink.setText("0");
				
				}
				
				
				//-------------------------------- TAx ------------------
				double c1 = Double.parseDouble(jcDrink.getText());
		     	double c2 = Double.parseDouble(jcodrink.getText());
				double c3 = Double.parseDouble(jcod.getText());
				double Total = c1+c2+c3;
				double allT = Total/100;
			    if(jTax.isSelected()){
					String iTo = String.format("%.2f", allT);
					iTax.setText(iTo);
			    }					
			//-------------------------------------------------------------
			    
			    
		//////////////////////////////////////////////// Totol///////////////////	    
			   String ctotal  = String.valueOf(Total);
			   JTOTAL.setText(ctotal);
			   
			   iSub.setText(ctotal);
			   
			   double G1= Double.parseDouble(iTax.getText());
			   double G2= Double.parseDouble(iSub.getText());
			   
			   double GTO = G1 +G2;
			   
			   String ss = String.format("%.2f", GTO);
			   GTo.setText(ss);
			   
			  
			}
			
		//////////////////////////////////////////////////////////////////////////	
		}	);
	btnTotal.setBounds(310, 52, 89, 23);
		panel_5.add(btnTotal);
		
		JButton btnNewButton_3 = new JButton("Recipt");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				double c1 = Double.parseDouble(jcDrink.getText());
		     	double c2 = Double.parseDouble(jcodrink.getText());
				double c3 = Double.parseDouble(jcod.getText());
				
				double Total = c1+c2+c3;
				double allT = Total/100;
				double Gto = allT+ Total;
				
				/*jRecipt.set("\nRestaurant Management system\n\n"); 
				 
				jRecipt.setText("\nCost of Drink: "+c1);
				jRecipt.setText("\n\nCost of Coldrink: "+c2);
						jRecipt.setText("\n\nCost of Delivery: "+c3);
								jRecipt.setText("\n\nService TAX Added:  "+allT);*/
										jRecipt.setText("\n\nYour Total is:\t\t "+Gto);
				
				
				
				
				
			}

			
			
		});
		btnNewButton_3.setBounds(465, 52, 89, 23);
		panel_5.add(btnNewButton_3);
	
		
//------------------- Reset---------------------------------
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				jcountry.setText("0");
				jwine.setText("0");
				jbeer.setText("0");
				jEnergy.setText("0");
				jice.setText("0");
				jlemon.setText("0");
				jsnack.setText("0");
				jwater.setText("0");
				jwhisky.setText("0");
				jqty.setText("0");
				jchoose.setSelectedItem("Choose");
				jDDRR.setSelectedItem("Selete here");
				iTax.setText("0");
				iSub.setText("0");
				GTo.setText("0");
				jcodrink.setText("0");
				jcDrink.setText("0");
				jcod.setText("0");
				JTOTAL.setText("0");
				jcountrys.setText("0");
				
			
				
			}
		});
		btnReset.setBounds(650, 52, 89, 23);
		panel_5.add(btnReset);
//-------------------------------------------------------------------------
		
//	------------------- For Exit Button ------------------	
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				System.exit(0);
			}
		});
		btnExit.setBounds(832, 52, 89, 23);
		panel_5.add(btnExit);
//  --------------------------------------------------------
		
		
		JLabel lblRestaurantManagementSystem = new JLabel("Restaurant Billing Management");
		lblRestaurantManagementSystem.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblRestaurantManagementSystem.setBounds(368, 11, 552, 54);
		frame.getContentPane().add(lblRestaurantManagementSystem);
		
		
		
	}
}
