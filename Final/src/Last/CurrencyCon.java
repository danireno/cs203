package Last;


/*
 * @ daniel 
 */

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;




import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class CurrencyCon extends JFrame implements ActionListener{

	
	private static Map<String, Double> paired= new HashMap<String,Double>();
	
	JLabel lblTitle;
	JLabel lblFrom;
	JLabel lblTo;
	JLabel lblAmount;
	JLabel lblRate;
	
	
	
	
	JTextField txtAmount;
	JTextField txtRate;
	
	static JComboBox comboCountryFrom;
	static JComboBox comboCountryTo;
	
	JButton btnConvert;
	JButton btnUpdate;
	
	
	CurrencyCon(){
		
		setTitle("Currency Convertor");
		setSize(700,500);
		setLayout(null);
		
		lblTitle=new JLabel("Currency Convertor");
		lblTitle.setBounds(190, 50, 200, 20);
		lblFrom=new JLabel("From");
		lblFrom.setBounds(190, 130, 30, 20);
		lblTo=new JLabel("To");
		lblTo.setBounds(190, 210, 150, 20);
		lblAmount=new JLabel("Amount");
		lblAmount.setBounds(40, 180, 50, 20);
		lblRate=new JLabel("Rate");
		lblRate.setBounds(450, 180, 50, 20);
		
		
		txtAmount=new JTextField();
		txtAmount.setBounds(40, 200, 70, 20);
		txtRate=new JTextField();
		txtRate.setBounds(450, 200, 70, 20);
		
		comboCountryFrom=new JComboBox();
		comboCountryFrom.setForeground(Color.DARK_GRAY);
		comboCountryFrom.setBackground(Color.WHITE);
			
		comboCountryFrom.setBounds(190, 150, 150, 20);
		
		comboCountryTo=new JComboBox();
		comboCountryTo.setForeground(Color.DARK_GRAY);
		comboCountryTo.setBackground(Color.WHITE);
		comboCountryTo.setBounds(190, 230, 150, 20);
		
		btnConvert=new JButton("Convert");
		btnConvert.setBounds(190, 300, 100, 20);
		btnUpdate=new JButton("Update");
		btnUpdate.setBounds(350, 300, 100, 20);
		
	
		
		
		add(lblTitle);
		add(lblFrom);
		add(lblTo);
		add(lblRate);
		
		add(txtAmount);
		add(lblAmount);
		add(txtRate);
		
		add(comboCountryFrom);
		add(comboCountryTo);
		
		add(btnConvert);
		add(btnUpdate);
		
		
		
		
		btnConvert.addActionListener(this);
		btnUpdate.addActionListener(this);
		
		}
	
	
		
	public static void main(String[] args) {
		
		
		CurrencyCon form=new CurrencyCon();
		form.setVisible(true);
		
		
		HashMap<String,Double> cr= new HashMap<>();
		cr.put("Ethiopian Birr", 20.2955);
		cr.put("chinese Yuan", 6.23);
		cr.put("Euro", 0.94);
		cr.put("canadian Dollar ", 1.28);
		cr.put("Sudanese pound",5.69);
		cr.put("United Arab emirates Dirham",5.69);
		cr.put("Dirham", 3.19);
		cr.put("Rwandan francs", 690.50);
		cr.put("Swiss franc",1.00);
		cr.put("Norwigian Krone",8.38);
		cr.put("Indian Rupee", 62.74);
		cr.put("Djibouti Franc",177.87);
		cr.put("Danish kroner",7.02);
		cr.put("Pound Sterling",0.68);
		cr.put("Eritrean Nakifa", 15.28);
		
		
		
		


		
		Set set = cr.entrySet();
		//Get an iterator
		 Iterator i = set.iterator(); // Display elements
	      while(i.hasNext()) {
	        Map.Entry me = (Map.Entry)i.next();
	        comboCountryTo.addItem(me.getKey());
	      
	       
	        paired.put((String)me.getKey(), (Double)me.getValue());
	      }
	      comboCountryFrom.addItem("USD");
	      //comboCountryFrom.addItem("Birr");
				
			
			
		
				
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()==btnConvert){
				if (txtAmount.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please Enter the Amount you want to convert " , "Reminder", JOptionPane.PLAIN_MESSAGE);
				}
				
				else if(comboCountryFrom.getSelectedItem().equals("USD") && Double.parseDouble(txtAmount.getText())==1){
					String to = (String) comboCountryTo.getSelectedItem();
					
					Double val=paired.get(to);
					JOptionPane.showMessageDialog( null,val.toString());
					}
				else if((comboCountryFrom.getSelectedItem().equals("USD") && Double.parseDouble(txtAmount.getText())!=1)){
					String to = (String) comboCountryTo.getSelectedItem();
					Double val=paired.get(to)*(Double.parseDouble(txtAmount.getText()));
					JOptionPane.showMessageDialog(null, "The converted amount is: " + val.toString());
					
					}
				
				
				
				
				}
			else if(e.getSource()==btnUpdate){
				if(txtRate.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please Enter complete information " , "Reminder", JOptionPane.PLAIN_MESSAGE);
				}
				else{	
			
				String toCurr=(String) comboCountryTo.getSelectedItem();
				
				Double rate=Double.parseDouble(txtRate.getText());
						paired.put(toCurr,rate);
						JOptionPane.showMessageDialog(null,"the rating value is updated to:"+ rate);
				}
			
	}

	}
	}

