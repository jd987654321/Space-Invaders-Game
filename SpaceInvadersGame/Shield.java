import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.awt.image.BufferedImage;


public class Shield{
  //Basically just generates an array of rectangles in a shield shape
  
  //randint (dont mind this)
  static int randint(int low, int high){
    return(int)(Math.random() * (high-low+1)+low);
  }
  
  //ArrayList to keep all the rectangles
  private int x,y;
  private Rectangle generalHitbox;
  private ArrayList<Rectangle> hitboxes;
  
  //constructor to create all the rectangles based off of x and y coordinates
  public Shield(int xx, int yy){
    x = xx;
    y = yy;
    generalHitbox = new Rectangle(xx,yy, 180,150);
    hitboxes = new ArrayList<Rectangle>();
    
    
    //first row
    for(int p = 30; p < 149; p+=30){
      hitboxes.add(new Rectangle(x+p, y, 29,29));
    }
    //second to fourth row
    for(int j = 0; j < 179; j+=30){
      for(int t = 30; t < 119; t+=30){
        hitboxes.add(new Rectangle(x+j, y+t, 29,29));
      }
    }
    //fifth row
    for(int g = 0; g < 59; g+=30){
      hitboxes.add(new Rectangle(x+g, y+120, 29,29));
      hitboxes.add(new Rectangle(x+g+120, y+120, 29,29));
    } 
  }
  
  
  public boolean hitShield(Bullet bullet){
    //new ArrayList for removing shield chunks
    ArrayList<Rectangle> junkChunks = new ArrayList<Rectangle>();
    
    if(bullet.hitbox().intersects(generalHitbox)){
      for(Rectangle hitbox: hitboxes){
        if(bullet.hitbox().intersects(hitbox)){
          junkChunks.add(hitbox);
          break;
        }
      }
      hitboxes.removeAll(junkChunks);
      if(junkChunks.size() > 0){
        return true;
      }
      else{
        return false;
      }
    }
    else{
      return false;
    }
  }
  
  
  //for loop to draw all the shapes inside of the array
  public void draw(Graphics g){
    for(Rectangle hitbox: hitboxes){
      g.setColor(new Color(100,0,100));
      g.fillRect((int)hitbox.getX(), (int)hitbox.getY(),30,30);
    }
  }
}


