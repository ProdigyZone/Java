import java.applet.Applet;
import java.awt.*;
import java.util.*;

public class BarGraph extends Applet{
  int pa[], count;
	 public void init() {
    setBackground(new Color(10,10,200));
    StringTokenizer data = new StringTokenizer(getParameter("data"));
    count=data.countTokens();
    pa=new int[count];
    for (int i=0; i<count; i ++){
      pa[i]=Integer.parseInt(data.nextToken());
    }
   }
	public void paint(Graphics g){
    int i;
		g.setColor(Color.white); 
         g.drawLine(50, 25, 50, 240);
         g.drawLine(50, 240, 340, 240);
           for(i=0;i<5;i++){
            g.drawString(i*50+"", 12, 240-i*50);
            g.drawLine(50,240-i*50, 330,240-i*50);
         }
        for(i=0;i<9;i++){
            g.drawString(i+1+"", 68+i*30, 260);
        }
        for(i=0;i<count;i++){

           g.setColor(new Color(255, 129, 25));
          g.fillRect(65+i*30, 240-pa[i], 10, pa[i]);

            g.setColor(new Color(233, 107, 5));
          int x1[]={63+i*30, 73+i*30, 79+i*30, 69+i*30};
          int y1[]={240-pa[i], 240-pa[i], 235-pa[i], 235-pa[i]};
          g.fillPolygon(x1, y1, 4);

            g.setColor(new Color(230, 102, 0));
          int x2[]={73+i*30, 79+i*30, 79+i*30, 73+i*30};
          int y2[]={240-pa[i], 235-pa[i], 235, 240};
          g.fillPolygon(x2, y2, 4);

        }

	}
}
