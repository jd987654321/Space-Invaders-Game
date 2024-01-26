import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

//spaceship class
public class SpaceShip{
  //used only once, generates the ship object with 
  //all needed values and images
  
  delayTimer timer;
  public int x = 580, y = 700;
  public boolean canShoot = true;
  private int lives = 3;
  private Image ship;
  private boolean moving = false;
    
  public SpaceShip(){
    ship = new ImageIcon("SpaceShip.png").getImage();
    timer = new delayTimer();
  }
  
  //methods useful for interactions with the ships
  public void moveLeft(){
    x -= 5;
    moving = true;
  }
  public void moveRight(){
    x += 5;
    moving = true;
  }
  public void notMoving(){
    moving = false;
  }
  public void resetLives(){
    lives = 3;
  }
  public void loseLife(){
    lives--;
  }
  public int returnLives(){
    return lives;
  }
  public Rectangle hitbox(){
      return new Rectangle(x,y, 40,50);
  }
  public boolean shipAlive(){
    if(lives == 0){
      return false;
    }
    else{
      return true;
    }
  }
  
  
  public void draw(Graphics g){
    g.setColor(new Color(0,0,0));
    g.drawImage(ship, x,y,50,50, null);

    //flames are covered when ship is not moving
    if(moving == false){
      g.fillRect(x + 30, y + 40, 10,10);
      g.fillRect(x + 10, y + 40, 10,10);
    }
  }
}