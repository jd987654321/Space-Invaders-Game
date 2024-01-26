import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;

//Code provided by Mr. Mackenzie
//used to get sound files

class SoundEffect{
    private Clip c;
    public SoundEffect(String filename){
        setClip(filename);
    }
    public void setClip(String filename){
        try{
            File f = new File(filename);
            c = AudioSystem.getClip();
            c.open(AudioSystem.getAudioInputStream(f));
        } catch(Exception e){ System.out.println("error"); }
    }
    public void play(){
        c.setFramePosition(0);
        c.start();
    }
    public void stop(){
        c.stop();
    }
}

