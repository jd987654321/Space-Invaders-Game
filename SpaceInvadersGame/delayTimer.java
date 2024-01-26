//delayTimer
//Handy timer class

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;


class delayTimer{
  //A useful timer class used to set delays 
 
  private long time;
    
  public delayTimer(){
    time = System.currentTimeMillis();
  }
    
  public boolean delay(int d){
    long newTime = System.currentTimeMillis();
    if(newTime - d > time){
      time = newTime;
        return true;
      }
      else{
        return false;      
      }
   }
}