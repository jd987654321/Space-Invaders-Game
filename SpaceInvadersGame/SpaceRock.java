import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.awt.image.BufferedImage;


//simple class to use in SpaceBackground 
//contains basic rectangle variables, move, draw and a outOfBounds method
public class SpaceRock{
  int x,size,speed;
  int y = -100;
  
  public SpaceRock(int xx, int sizee, int speedd){
    x = xx;
    size = sizee;
    speed = speedd;
  }
  
  public void move(){
    y+=speed;
  }
  
  public void draw(Graphics g){
    g.setColor(new Color(255,255,255));
    g.fillRect(x,y,size,size);
  }
  
  public boolean outOfBounds(){
    if(y > 1000){
      return true;
    }
    return false;
  }
  
}