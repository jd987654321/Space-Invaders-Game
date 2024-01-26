import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;


  //enemy class
public class Mongrel{
  //A.k.a. the Aliens of space invaders, this class holds all 
  //the values of the aliens
  //Alien PNGs edited by Yousef Al-wahami
  
  private int x, y;
  private int value;
  private int speed;
  private int frame = 0;
  Image[] mongrelFrame = new Image[2];
  Image explosion;
  delayTimer explosionTimer;
  
  //position, score value, speed
  public Mongrel(int xx, int yy, int givenValue, int image, int speedd){
    x = xx;
    y = yy;
    speed = speedd;
    value = givenValue;
    explosionTimer = new delayTimer();
    
    mongrelFrame[0] = new ImageIcon("Enemy" + image + ",1.png").getImage();
    mongrelFrame[1] = new ImageIcon("Enemy" + image + ",2.png").getImage();
    
    explosion = new ImageIcon("explosiiion.png").getImage();
  }
    
  public void draw(Graphics g){
    g.setColor(new Color(0,255,255));
    g.drawImage(mongrelFrame[frame],x,y,25,20, null);
    //g.drawImage(explosion,50,50,null);
  }

  //cycles between frames to animate enemies
  public void switchFrame(){
    if(frame == 0){
      frame = 1;
    }
    else if(frame == 1){
      frame = 0;
    }
  }
   
  //used to determine added score per kill
  public int returnValue(){
    return value;    
  }
  
  //methods used to move aliens
  public void moveRight(){
    x += speed;
    switchFrame();
  }
  public void moveLeft(){
    x -= speed;
    switchFrame();
  }
  public void moveDown(){
    y += 30;
    switchFrame();
  }
  
  
  public int getx(){
    return x;
  }
  public int gety(){
    return y;
  }
    
  public Rectangle hitbox(){
   return new Rectangle(x,y, 25,20);
  }
}