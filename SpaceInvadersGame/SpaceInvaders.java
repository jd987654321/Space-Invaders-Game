// Jacob Dam
// ICS4U Simple Game Assignment
// Game Template Provided by Mr. Mckenzie
// Dec 01, 2021

// Space Frame is the main class that runs everything

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;



public class SpaceInvaders extends JFrame{
  GamePanel game = new GamePanel();
  
  
  public SpaceInvaders(){
    super("Space Invaders");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    add(game);
    pack();
    setVisible(true);
    setResizable(false);

  }
  
  public static void main(String [] arguments){
    SpaceInvaders Game = new SpaceInvaders();
  }
}

  

  
  
  
  

 
