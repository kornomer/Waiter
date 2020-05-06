package projee;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;


public class progress extends JFrame {
    
    
	static JFrame f;
	static JProgressBar b;
	static JPanel p;
       
	public static void main(String[] args) {
            
                
		// TODO Auto-generated method stub
		f = new JFrame("Welcome...");   
               
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(200, 200, 900, 600);
		p = new JPanel();
		p.setBorder(new EmptyBorder(5, 5, 5, 5));
		f.setContentPane(p);
		f.setLayout(null);
		
		//Resim labeli
		JLabel label = new JLabel("");
                
                
		//setBounds(x,y,picX,picY) x ve ye jframe deki pozisyon; picX ve picY resimin boyutu.
		label.setBounds(0, 0, 900, 600);
		p.add(label);
		setImg(label, "imagess.png",900,600 );
		
		b = new JProgressBar();
		b.setBounds(320,200,300,70);
        b.setValue(0); 
        b.setStringPainted(true);
        p.add(b); 
        //f.add(p);
        //f.setSize(500, 500); 
        f.setVisible(true); 
        fill();
	}
        
	public static void fill(){
		try{
                     RegisterLogin gecis=new RegisterLogin();
                    
                     
			int i=0;
			while(i<=100){
				b.setValue(i + 15);
				Thread.sleep(150);
				i=i+10;
                                if(i==100){
                       
                       f.setVisible(false);
                        gecis.setVisible(true);
                        
                        
                       }
			}
                       
		}catch(Exception e){
			
		}
	}
	public static void setImg(JLabel lab, String url, int size, int size1){
		ImageIcon icon = new ImageIcon(url);
		 Image image = icon.getImage().getScaledInstance(size, size1, Image.SCALE_SMOOTH);
		   icon.setImage(image);
		   lab.setIcon(icon);
		   lab.setText("");
                   
                   

    }

  
    
  
  
 
}

      

