import java.awt.*;
import java.applet.*;

public class caseTwo extends Applet {
	
	Label lbl1, lbl2, lbl3;
	TextField txt1, txt2;
	Button btn1, btn2, btnPlus, btnMinus, btnDivide, btnMultiply;
	public void getFrame() {
		setVisible(true);
		setSize(500,200);
	}
	
	public void init() {
		//setLayout(new FlowLayout(FlowLayout.CENTER));
		setLayout(null);
		
		TextField valueOne = new TextField("Value 2");  
		valueOne.setSize(50, 120);    
	    add(valueOne);        
	    
	    
	    TextField valueTwo = new TextField("Value 2"); 
	    valueTwo.setSize(50, 120);
	    add(valueTwo);             
	    
	    
	    Button off = new Button("OFF");     
	    Button on = new Button("ON");  
	    Button clear = new Button("CLEAR");  
	    add(off);
	    add(on);
	    add(clear);	    
	    
	}

	public void paint(Graphics g) {
		
		//g.drawString("Welco!!", 50, 60 );
		
	}
}