import java.awt.*;    
  
public class TempScreen {    
void TempScreenColor()
{   
  
   
    Frame f = new Frame ("Real Time Converter");  
    Label l1;    
    l1 = new Label ("Temperature Converter Selected !!!");   
    l1.setBounds(70, 100, 1000, 60);
    l1.setFont(new Font("Arial", Font.PLAIN, 50));    
    f.add(l1);   
    f.setSize(1000,300); 
    f.setBackground(Color.CYAN);   
    f.setLayout(null);    
    f.setVisible(true); 
    try{
      Thread.sleep(4000);
	}
    catch(InterruptedException e)
    {
	System.out.println(e);
    }
    f.dispose();   
}    
}    