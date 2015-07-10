import java.applet.Applet;
import java.awt.*;
import java.util.*;

public class Linechart extends Applet{

    int pa[], count;
   
   public void init () {
    setBackground(new Color(60, 170, 60));
     StringTokenizer data = new StringTokenizer(getParameter("data"));
    count=data.countTokens();
    pa=new int[count];
    for (int i=0; i<count; i++){
      pa[i]=Integer.parseInt(data.nextToken());
    }
  }
   
     public void paint(Graphics g) { 

        int i;
        g.setColor(Color.white); 
         g.drawLine(50, 33, 50, 283);
         g.drawLine(50, 283, 340, 283);


         for(i=0;i<6;i++){
            g.drawString(i*50+"", 12, 283-i*50);
            g.drawLine(50, 283-i*50, 330, 283-i*50);
         }
        for(i=0;i<9;i++){
            g.drawString(i+1+"",68+i*30,297);
        }
            
        for(i=0;i<count;i++){
         g.setColor(new Color(i*24, i*i-9*i+70 , 250-i*22));
         BasicStroke stroke;
         Graphics2D g2 = (Graphics2D)g;
           stroke = new BasicStroke(2.5f); 
            g2.setStroke(stroke);
              g2.drawLine(70+i*30, 285-pa[i], 100+i*30, 285-pa[i+1]);  
        }
    }   
}
 
         


