import processing.core.*; 
import processing.xml.*; 

import fullscreen.*; 
import controlP5.*; 

import java.applet.*; 
import java.awt.Dimension; 
import java.awt.Frame; 
import java.awt.event.MouseEvent; 
import java.awt.event.KeyEvent; 
import java.awt.event.FocusEvent; 
import java.awt.Image; 
import java.io.*; 
import java.net.*; 
import java.text.*; 
import java.util.*; 
import java.util.zip.*; 
import java.util.regex.*; 

public class poem extends PApplet {

 


FullScreen fs;
ControlP5 cp5;

PFont fontA;

float loadCounterOne, loadCounterTwo, loadCounterThree,
      loadCounterFour, loadCounterFive;
      
//int loaderOne, 
int loaderOne, loaderTwo, loaderThree, loaderFour, loaderFive; // variables for selection of random words from each line of poem

float a,b,c,d, f, g, h, j, e, k, l, o, p, q;// varaibles for cordinates from random word's float value


String[] lineOne, lineTwo, lineThree, lineFour, lineFive;

public void setup()
{
  size(1350, 700);
  background(255);
  //************** fulscreen mode
  fs = new FullScreen(this);
  fs.enter();
  //************** fullscreen mode done
  
  //*********control panel background
  noStroke();
  fill(100, 100, 100, 50);
  rect(0, 0, 300, 300);
  //*********
  
  //****** load button with ControlP5
  cp5 = new ControlP5(this);
  
  //***********reate load button
  cp5.addButton("Load_Poem")
     .setValue(0)
     .setPosition(30, 20)
     .setSize(60, 50)
     ;
   //*********button finished
   
  cp5.addButton("Create_Vizualization")
  .setValue(0)
  .setPosition(100, 20)
  
  .setSize(100, 50)
  ;
  
   
   fontA = loadFont("SansSerif.plain-13.vlw"); 
   textFont(fontA, 13);
   //....................
   //converting the random values into integers
   loadCounterOne = random(0, 3);
   loaderOne = PApplet.parseInt(loadCounterOne);
   
   loadCounterTwo = random(0, 1);
   loaderTwo = PApplet.parseInt(loadCounterTwo);
   
   loadCounterThree = random(0, 1);
   loaderThree = PApplet.parseInt(loadCounterThree);
   
   loadCounterFour = random(0, 2);
   loaderFour = PApplet.parseInt(loadCounterFour);
   
   loadCounterFive = random(0, 1);
   loaderFive = PApplet.parseInt(loadCounterFive);
   
 }

public void draw()
{
      
    
}

  public void Load_Poem(int theValue)
    { 
      String poem = selectInput();
      
      String[] poet = loadStrings(poem);
      
      println(poet[0]+ "," + poet[1]);
      //float f = float(c);
      //println(c + ":" + " " + f);
      
      //.......................
      
      lineOne = splitTokens(poet[0], " .;,-:!");

      for (int i = 0; i < lineOne.length; i++)
    {
      println(lineOne[i] + ": " + i);
      // converting words from a random loaction on each line into floats for co-ordinates
      e = PApplet.parseFloat(lineOne[loaderOne].charAt(loaderOne));
      println(e);
    }
    
    lineTwo = splitTokens(poet[1], " .;,-:!");
      for (int x = 0; x < lineTwo.length; x++)
    {
      println(lineTwo[x] + ": " + x);
      f = PApplet.parseFloat(lineTwo[loaderTwo].charAt(loaderTwo));
      println(f);
    }
    
    lineThree = splitTokens(poet[2], " .;,-:!");
      for (int y = 0; y < lineThree.length; y++)
    {
      println(lineThree[y] + ": " + y);
      g = PApplet.parseFloat(lineThree[loaderThree].charAt(loaderThree));
      println(g);
    }
    
    lineFour = splitTokens(poet[3], " .;,-:!");
      for (int z = 0; z < lineFour.length; z++)
    {
      println(lineFour[z] + ": " + z);
      h = PApplet.parseFloat(lineFour[loaderFour].charAt(loaderFour));
      println(h);
    }
    
    lineFive = splitTokens(poet[4], " .;,-:!");
      for (int m = 0; m < lineFive.length; m++)
    {
      println(lineFive[m] + ": " + m);
      j = PApplet.parseFloat(lineFive[loaderFive].charAt(loaderFive));
      println(j);
    }

   //.....................................

      background(255);
      fill(70, 70, 70);
      
      text(poet[0], 30, 130);
      text(poet[1], 30, 160);
      text(poet[2], 30, 190);
      text(poet[3], 30, 220);
      text(poet[4], 30, 250);
     }
      
public void Create_Vizualization(int theValue)
{
     /* noStroke();
      fill(255); 
      rect(480, 480, 450, 300);
      
      fill(0, 0, 0);
      text(e, 500, 500);
      text(f, 600, 500);
      text(g, 700, 500);
      text(h, 800, 500);
      text(j, 900, 500);
      
     k = random(100);
     l = random(100);
     o = random(100);
     p = random(100);
     q = random(100);
      
      text(k, 500, 600);
      text(l, 600, 600);
      text(o, 700, 600);
      text(p, 800, 600);
      text(q, 900, 600);*/
     //........
     
    /* fill(45, 37, 37);
     beginShape();
     vertex((width/2) + e*2, (height/2) + f*2);
     vertex((width/2) + k*2, (height/2) + l*2);
     vertex((width/2) + g*2, (height/2) + h*2);
     vertex((width/2) + o*2, (height/2) + p*2);
     vertex((width/2) + j*2, (height/2) + q*2);
     endShape();*/
    
    /* noStroke();
     smooth();
     fill(random(100), random(100), random(100), random(100));
     ellipse(width/2 + e*2, height/2 + k, f + random(200), l + random(200));
     ellipse(width/2 + f, height/2 + l*2, g + random(200), o + random(200));
     ellipse(width/2 + g*2, height/2 + o, h + random(200), p + random(200));
     ellipse(width/2 + h, height/2 + p*2, j + random(200), q + random(200));
     ellipse(width/2 + j*2, height/2 + q, e + random(200), k + random(200));*/
     
     float vizrandum = random(4);
     
    // if
     
     noStroke();
     smooth();
     fill(random(255), random(255), random(255), random(150));
     beginShape();
     vertex((width/2) + random(200) + 2*e, (200) + random(2 + random(100)) + 2*f);
     vertex((width/2) + random(100) + 3*k, (200) + random(78 +random(200)) + 3*l);
     vertex((width/2) + random(200) + 2.5f*g, (200) + random(255) + 2.5f*h);
     vertex((width/2) + random(234) + 4.3f*o, (200) + random(156) + 3.2f*q);
     vertex((width/2) + random(167) + 6.2f*j, (200) + random(100 + random(100)) + 3.2f*p);
     vertex((width/2) + random(200) + 2.5f*k, (200) + random(255) + 2.5f*p);
     //.....**********************************************************************.......//
     vertex((width/2) + random(200) + 2.5f*k, (400) + random(255) + 2.5f*p);
     vertex((width/2) + random(167) + 6.2f*j, (400) + random(100 + random(100)) + 3.2f*p);
     vertex((width/2) + random(234) + 4.3f*o, (400) + random(156) + 3.2f*q);
     vertex((width/2) + random(200) + 2.5f*g, (400) + random(255) + 2.5f*h);
     vertex((width/2) + random(100) + 3.8f*k, (400) + random(78 +random(200)) + 3*l);
     vertex((width/2) + random(200) + 2.7f*e, (400) + random(2 + random(100)) + 2*f);
     endShape();
     
    
     noStroke();
     smooth();
     fill(random(125), random(155), random(125), random(125));
     beginShape();
     vertex((width/2) + random(200) + 2*k, (400) + random(2 + random(100)) + 2*p);
     vertex((width/2) + random(100) + 3*e, (200) + random(78 +random(200)) + 3*q);
     vertex((width/2) + random(200) + 2.5f*j, (400) + random(255) + 2.5f*p);
     vertex((width/2) + random(234) + 4.3f*h, (200) + random(156) + 3.2f*l);
     vertex((width/2) + random(167) + 6.2f*g, (400) + random(100 + random(100)) + 3.2f*f);
     vertex((width/2) + random(200) + 2.5f*o, (200) + random(255) + 2.5f*h);
     //.....**********************************************************************.......//
     vertex((width/2) + random(200) + 2.5f*o, (200) + random(255) + 2.5f*h);
     vertex((width/2) + random(167) + 6.2f*g, (400) + random(100 + random(100)) + 3.2f*f);
     vertex((width/2) + random(234) + 4.3f*h, (200) + random(156) + 3.2f*l);
     vertex((width/2) + random(200) + 2.5f*j, (400) + random(255) + 2.5f*p);
     vertex((width/2) + random(100) + 3.8f*e, (200) + random(78 +random(200)) + 3*q);
     vertex((width/2) + random(200) + 2.7f*k, (400) + random(2 + random(100)) + 2*p);
     endShape();
     
     noStroke();
     smooth();
     fill(random(255), random(155), random(75), random(200));
     beginShape();
     vertex((width/2) + random(200) + 2*o, (100) + random(2 + random(100)) + 2*o);
     vertex((width/2) + random(100) + 3*h, (300) + random(78 +random(200)) + 3*h);
     vertex((width/2) + random(200) + 2.5f*e, (300) + random(255) + 2.5f*p);
     vertex((width/2) + random(234) + 4.3f*j, (100) + random(156) + 3.2f*h);
     vertex((width/2) + random(167) + 6.2f*k, (100) + random(100 + random(100)) + 3.2f*f);
     vertex((width/2) + random(200) + 2.5f*g, (300) + random(255) + 2.5f*l);
     //.....**********************************************************************.......//
     vertex((width/2) + random(200) + 2.5f*g, (300) + random(255) + 2.5f*h);
     vertex((width/2) + random(167) + 6.2f*k, (100) + random(100 + random(100)) + 3.2f*f);
     vertex((width/2) + random(234) + 4.3f*j, (100) + random(156) + 3.2f*l);
     vertex((width/2) + random(200) + 2.5f*e, (300) + random(255) + 2.5f*l);
     vertex((width/2) + random(100) + 3.8f*h, (300) + random(78 +random(200)) + 3*q);
     vertex((width/2) + random(200) + 2.7f*o, (100) + random(2 + random(100)) + 2*k);
     endShape();
 }

  static public void main(String args[]) {
    PApplet.main(new String[] { "--bgcolor=#F0F0F0", "poem" });
  }
}
