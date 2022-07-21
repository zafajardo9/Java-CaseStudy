import java.awt.*;
import java.awt.event.*;

import javax.swing.BoxLayout;

import java.applet.*;
 
public class caseSecond extends Applet implements ActionListener   //ActionListener is used for buttons functioning
{
	String msg=" ";
	double v1,v2,result;                                 //Declaration of variables
	TextField t1;                                        //Textfield for input
	Button b[]=new Button[10];                           //Buttons for Numbers
	Button add,sub,mul,div,EQ;     //Buttons for operations
	char OP;
	public void init()                                   //Runs on initialization
	{
            
		setBackground(Color.red);                    //Background colour set to red
		t1=new TextField(10);                        //t1 declared as textfield
		t1.setBounds(140, 70, 200,30);
		//GridLayout gl=new GridLayout(5,4);           //Gridlines declared
		//setLayout(gl);                               //Gridline set
		
		 //BoxLayout bl=new BoxLayout(0,4);           //Gridlines declared
		//setLayout(bl);                               //Gridline set
		
		for(int i=0;i<10;i++)
		{
			b[i]=new Button(""+i);               //Declaration of array of b as buttons
		}

		add=new Button("+");                         //Declaration of + as button add
		sub=new Button("-");                         //Declaration of - as button sub
		mul=new Button("x");                         //Declaration of x as button mul
		div=new Button("/");                         //Declaration of / as button div
		EQ=new Button("=");                          //Declaration of = as button EQ
                 
         
                //Adding of buttons and textfields on output window
                
		add(t1);                                     //Addition of textfieild

		for(int i=0;i<10;i++)
		{
			add(b[i]);                           //Buttons for number added
		}
                                  //Button for decimal added
		add(add);                                    //Button for addition added
		add(sub);                                    //Button for subtraction added
		add(mul);                                    //Button for multiplication added    
		add(div);                                    //Button for division added
		add(EQ);                                     //Button for equals to added
		
                //Adding of action listener for buttons on Display window
                
                for(int i=0;i<10;i++)
		{
			b[i].addActionListener(this);
		}
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		EQ.addActionListener(this);
	}
 
      
	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();            //Gets the input of the action performed in the output window
		char ch=str.charAt(0);
		if ( Character.isDigit(ch)|| ch=='.')        //Checks if the entered digit is a digit or a decimal
		t1.setText(t1.getText()+str);                //If it is a digit,then it will accept another character and will keep on concatenating the string
		else
		if(str.equals("+"))                          //Checks if the entered character is "+"
		{
			v1=Double.parseDouble(t1.getText()); //Converts the entered String in Textview to Integer 
			OP='+';
			t1.setText("");                      //It sets the textfield to NULL
		}
		else if(str.equals("-"))                     //Checks if the entered character is "-"
		{
			v1=Double.parseDouble(t1.getText()); //Converts the entered String in Textview to Integer 
			OP='-';
			t1.setText("");                      //It sets the textfield to NULL
		}
		else if(str.equals("x"))                     //Checks if the entered character is "x"
		{
			v1=Double.parseDouble(t1.getText()); //Converts the entered String in Textview to Integer 
			OP='*';
			t1.setText("");                      //It sets the textfield to NULL
		}
		else if(str.equals("/"))                     //Checks if the entered character is "/"
		{
			v1=Double.parseDouble(t1.getText()); //Converts the entered String in Textview to Integer 
			OP='/';
			t1.setText("");                      //It sets the textfield to NULL
		}
		else if(str.equals("%"))                     //Checks if the entered character is "%"
		{
			v1=Double.parseDouble(t1.getText()); //Converts the entered String in Textview to Integer   
			OP='%';                     
			t1.setText("");                      //It sets the textfield to NULL
		}
                else if(str.equals("^"))                     //Checks if the entered character is "^"
		{
			v1=Double.parseDouble(t1.getText()); //Converts the entered String in Textview to Integer   
			OP='^';                     
			t1.setText("");                      //It sets the textfield to NULL
		}
		if(str.equals("="))                          //Checks if the entered character is "="
		{
			v2=Double.parseDouble(t1.getText()); //Converts the entered String in Textview to Integer and store it in another variable v2 
			if(OP=='+')                          //Checks for operator
				result=v1+v2;
			else if(OP=='-')
				result=v1-v2;
			else if(OP=='*')
				result=v1*v2;
			else if(OP=='/')
				result=v1/v2;
			else if(OP=='%')
				result=v1%v2;
                        else if(OP=='^')
				result=Math.pow(v1,v2);     //Use of power function
			t1.setText(""+result);              //Dispalys the result in textview
		}	
		if(str.equals("CLEAR"))                     //Checks if the entered character is "CLEAR"
		{
			t1.setText("");                     //It sets the textfield to NULL
		}
	}

}