
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class caseTwo extends Applet implements ActionListener {	
	Button btnPlus = new Button("+");
	Button btnMinus = new Button("-");
	Button btnTimes = new Button("x");
	Button btnDivide = new Button("/");
	Button btnEquals = new Button("=");
	Button btnOff = new Button("OFF");
	Button btnOn = new Button("ON");
	Button btnClear = new Button("CLEAR");
	
	TextField txtIn1 = new TextField("",5);
	TextField txtIn2 = new TextField("", 5);	
	TextField txtResult = new TextField("", 5);
	
	GridLayout G1 = new GridLayout(6, 1, 10, 10);
	
	
	//GridLayout G2 = new GridLayout(1, 4, 10, 10);
	FlowLayout G2 = new FlowLayout();
	
	//GridLayout G3 = new GridLayout(1, 3, 10, 10);
	
	Panel P1 = new Panel();
	Panel P3 = new Panel();
	Panel P2 = new Panel();
	
	float num1, num2, result;
	
	public void init() {
		//Grid Layout
		setLayout(G1); 
		//INPUT 1
		txtResult.setText("");
		add(txtIn1); 
		
		//Operators
		P1.setLayout(G2); 
		btnPlus.setEnabled(false);
		P1.add(btnPlus); 
		btnMinus.setEnabled(false);
		P1.add(btnMinus); 
		btnTimes.setEnabled(false);
		P1.add(btnTimes); 
		btnDivide.setEnabled(false);
		P1.add(btnDivide); 
		add(P1); 
		
		
		add(txtIn2); 
		
		//Equals Button
		P3.setLayout(G2);
		btnEquals.setEnabled(false);
		P3.add(btnEquals); 
		add(P3); 
		
		//TextField for Result
		txtResult.setEditable(false);
		add(txtResult); 
		
		P2.setLayout(G2);
		btnOff.setEnabled(false);
		P2.add(btnOff);
		btnOn.setEnabled(true);
		P2.add(btnOn);
		btnClear.setEnabled(false);
		P2.add(btnClear);
		add(P2);
		
		btnPlus.addActionListener(this);
		btnMinus.addActionListener(this);
		btnTimes.addActionListener(this);
		btnDivide.addActionListener(this);
		btnEquals.addActionListener(this);
		btnOff.addActionListener(this);
		btnOn.addActionListener(this);
		btnClear.addActionListener(this);
		
	}//end of void init()
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnOn) {
			btnOn.setEnabled(false);
			btnPlus.setEnabled(true);
			btnMinus.setEnabled(true);
			btnTimes.setEnabled(true);
			btnDivide.setEnabled(true);
			btnEquals.setEnabled(true);
			btnOff.setEnabled(true);
			btnClear.setEnabled(true);
		} if(e.getSource() == btnClear) {
			txtIn1.setText("");
			txtIn2.setText("");
		} if(e.getSource() == btnOff) {
			init();
		} if(e.getSource() == btnPlus) {			
			convert(txtIn1.getText(), txtIn2.getText());
			result = num1 + num2;	
		} if(e.getSource() == btnMinus) {			
			convert(txtIn1.getText(), txtIn2.getText());
			result = num1 - num2;
		} if(e.getSource() == btnTimes) {			
			convert(txtIn1.getText(), txtIn2.getText());
			result = num1 * num2;
		} if(e.getSource() == btnDivide) {			
			convert(txtIn1.getText(), txtIn2.getText());
			result = num1 / num2;
		} if(e.getSource() == btnEquals) {
			if(txtIn1.getText().equals("") && txtIn2.getText().equals(""))  
				result = 0;
			
			txtResult.setText(Float.toString(result));
		} 
		
	}
		
	private void convert(String val1, String val2) {
		if(!(txtIn1.getText().equals("")) && !(txtIn2.getText().equals(""))){
			num1 = Float.parseFloat(txtIn1.getText());
			num2 = Float.parseFloat(txtIn2.getText());
		} else {
			if(txtIn1.getText().equals("")) {
				num1 = 0;
				num2 = Float.parseFloat(txtIn2.getText());	
			} if(txtIn2.getText().equals("")) {
				num1 = Float.parseFloat(txtIn1.getText());
				num2 = 0;
			}
		}
	}
	
	
}