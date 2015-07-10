import java.applet.Applet;
import java.awt.*;
import java.util.*;

    public class Piechart extends Applet{

      int pa[], count;
      int sum = 0;

  public void init() {
    setBackground(new Color(210, 155, 0));
    StringTokenizer data = new StringTokenizer(getParameter("data"));
    count=data.countTokens();
    pa=new int[count];
    for (int i=0; i<count; i++){
      pa[i]=Integer.parseInt(data.nextToken());
    }
    int i;
    for (i=0;i<9;i++) {
      sum += pa[i];
      
    }
          
       }
 public void paint(Graphics g){
  int j, x, y;
  x = 78;
        g.setColor(Color.black);
        g.drawRect(330, 27, 86, 270);
        for(j=0;j<9;j++){
            g.drawString(pa[j]+"", 390, 30*j+43);
          }     
   for (j=0;j<count;j++){
    y = Math.round(360*pa[j]/sum);

    g.setColor(Color.black);
        g.drawOval(100, 55, 201, 201); 
        if(j<4){
    g.setColor(new Color(255-pa[j], 0, 240-pa[j]));
    g.fillRect(342, 32+j*30, 40, 12);
  }
      else  if (j<9) {
        g.setColor(new Color(0, pa[j], 240-pa[j]));
        g.fillRect(342, 32+j*30, 40, 12);  
        }
        

             g.fillArc(100, 55, 200, 200, x, y);
             x += y;
           }
             }            
                }
