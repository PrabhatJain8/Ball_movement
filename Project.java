import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code="Project.class" height=1000 width=1000>
</applet>*/

public class Project extends Applet implements MouseListener,MouseMotionListener{
int x;
int y;
int p=0;
int q=0;
public void init(){
addMouseListener(this);
addMouseMotionListener(this);
}

public void mouseClicked(MouseEvent me)
{
x=me.getX();
y=me.getY();


repaint();

}

public void mouseReleased(MouseEvent me){}
public void mouseEntered(MouseEvent me){}
public void mouseExited(MouseEvent me){}
public void mousePressed(MouseEvent me){}
public void mouseMoved(MouseEvent me){}
public void mouseDragged(MouseEvent me){}

public void paint(Graphics g){
setBackground(Color.BLACK);

g.fillOval(x,y,20,20);
setForeground(Color.RED);
}
}

