import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.awt.image.BufferedImage;

// this class creates a background where random white squares
// are generated at the top and then move down to simulate
// moving down in space.

// props to Daud, heavily inspired by his version

public class SpaceBackground{
  
  //background size 
  private int x,y,width,height;
  
  //array of rocks
  ArrayList<SpaceRock> sr5;
  ArrayList<SpaceRock> sr10;
  ArrayList<SpaceRock> sr12;
  ArrayList<SpaceRock> sr17;
 
  //timer to move the rocks at a consistent rate
  //move every 50 milliseconds
  delayTimer rockTimer;
  
  //randint method
  static int randint(int low, int high){
    return(int)(Math.random() * (high-low+1)+low);
  }
  
  //constructor
  public SpaceBackground(int xx, int yy, int w, int h){
    x = xx;
    y = yy;
    width = w;
    height = h;
    rockTimer = new delayTimer();
    sr5 = new ArrayList<SpaceRock>();
    sr10 = new ArrayList<SpaceRock>();
    sr12 = new ArrayList<SpaceRock>();
    sr17 = new ArrayList<SpaceRock>();
  }
  
  //adds the rocks at random times
  public void addRocks(){
    if(sr5.size() < 12){
      sr5.add(new SpaceRock(randint(0,1200), 5, randint(10,65)));
    }
    if(sr10.size() < 12){
      sr10.add(new SpaceRock(randint(0,1200), 8, randint(10,55)));
    }
    if(sr12.size() < 12){
      sr12.add(new SpaceRock(randint(0,1200), 11, randint(10,55)));
    }
    if(sr17.size() < 12){
      sr17.add(new SpaceRock(randint(0,1200), 14, randint(20,65)));
    }
  }
  
  //moves all the rocks in the arrays, calls the addRocks method
  //also removes out of bound rocks
  public void moveAll(){
    //new ArrayList to remove the rocks
    ArrayList<SpaceRock> JunkRocks1 = new ArrayList<SpaceRock>();
    ArrayList<SpaceRock> JunkRocks2 = new ArrayList<SpaceRock>();
    ArrayList<SpaceRock> JunkRocks3 = new ArrayList<SpaceRock>();
    ArrayList<SpaceRock> JunkRocks4 = new ArrayList<SpaceRock>();

    
    addRocks();
    if(rockTimer.delay(50)){
      for(SpaceRock rock: sr5){
        rock.move();
        if(rock.outOfBounds()){
          JunkRocks1.add(rock);
        }
      }
      for(SpaceRock rock2: sr10){
        rock2.move();
        if(rock2.outOfBounds()){
          JunkRocks2.add(rock2);
        }
      }
      for(SpaceRock rock3: sr12){
        rock3.move();
        if(rock3.outOfBounds()){
          JunkRocks3.add(rock3);
        }
      }
      for(SpaceRock rock4: sr17){
        rock4.move();
        if(rock4.outOfBounds()){
          JunkRocks4.add(rock4);
        }
      }
    }
    
    sr5.removeAll(JunkRocks1);
    sr10.removeAll(JunkRocks2);
    sr12.removeAll(JunkRocks3);
    sr17.removeAll(JunkRocks4);
  }
  
  
  //draws all the rocks
  public void draw(Graphics g){
    g.setColor(new Color(0,0,0));
    g.fillRect(x,y,width,height);

    g.setColor(new Color(255,255,255));
      
    //draws all the rectangles
    for(SpaceRock rock: sr5){
      rock.draw(g);
    }
    for(SpaceRock rock: sr10){
      rock.draw(g);
    }
    for(SpaceRock rock: sr12){
      rock.draw(g);
    }
    for(SpaceRock rock: sr17){
      rock.draw(g);
    }
  }
}