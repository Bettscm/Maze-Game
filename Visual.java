package maze;


import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Visual {
	public static JLabel label;
	public static JLabel label2;
	public static JLabel label3;

	
	public Visual(JLayeredPane frame, String[][]Current)
	{
		
		for (int i = 0; i<Current.length; i++) 
	     {
	       for (int x = 0; x<Current[0].length; x++)
	       {
	    	   if ((Current[i][x].equals("#")))
	    	   {
	    		   label = new JLabel();
	    		   label.setBackground(Color.BLACK);
	    		   label.setVisible(true);
	    		   label.setOpaque(true);
	    		   frame.add(label,0);
	    		   label.setBounds(x*20, i*20, 20, 20);
	    		   frame.repaint();
	    	   }
	    	 	    	    
	    	   
	    	   if (Current[i][x].equals("@"))
	    	   {
	    		   label2 =  new JLabel();
	    		   if (Movement.getRed() == true) 
		    		   label2.setBackground(Color.RED);    		   
	    		   else
		    		   label2.setBackground(Color.GREEN);    		   

	    			   
	    		   label2.setVisible(true);
	    		   label2.setOpaque(true);
	    		   frame.add(label2,1);
	    		   label2.setBounds(x*20, i*20, 20, 20);
	    		   frame.repaint();
	    		
	    	   }
	    	   
	    	   
	    	   if (Current[i][x].equals(" "))
	    	   {
	    		   label3 = new JLabel();
	    		   label3.setBackground(Color.WHITE);
	    		   label3.setVisible(true);
	    		   label3.setOpaque(true);
	    		   frame.add(label3,2);
	    		   label3.setBounds(x*20, i*20, 20, 20);
	    		   frame.repaint();
	    		
	    	   }
	    	  
	    }
	    	   
	    	  
	    	   
	       }
	       
	   
	    }
	
	public static void Reprint(JLayeredPane frame, String key,int X_position, int Y_position)
	{
		
		int x = X_position;
		int y = Y_position;
		JLabel first = new JLabel();
		JLabel second = new JLabel();
		
		
		first.setBackground(Color.WHITE);
		first.setVisible(true);
		first.setOpaque(true);
		   frame.add(first,3);
		   first.setBounds(X_position*20, Y_position*20, 20, 20);


		if (key.equals("w"))
			y = Y_position -1;
		if (key.equals("s"))
			y = Y_position +1;
		if (key.equals("a"))
			x = X_position -1;
		if (key.equals("d"))
			x = X_position +1;

		 if (Movement.getRed() == true) 
  		   second.setBackground(Color.RED);    		   
		 else
  		   second.setBackground(Color.GREEN);   	
		   second.setVisible(true);
		   second.setOpaque(true);
		   frame.add(second,4);
		   second.setBounds(x*20, y*20, 20, 20);
	}

	}
