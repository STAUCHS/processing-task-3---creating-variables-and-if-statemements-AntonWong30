import processing.core.PApplet;

import java.util.Random;

/*
  Description: A code that draws a basketball that randomly changes colours and shows time
  Author:@A. Wong
) */

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    // put your size call here
      size(800, 800);
    }
  
    /** 
     * Called once at the beginning of execution.  Add initial set up
     * values here i.e background, stroke, fill etc.
     */
    public void setup() {
      // Make background colour black
      background(0);

      // Define time variables
      int hr = hour();
      int min = minute();

      // Print time on screen
      fill(255, 0, 0);
      textSize(100);
      text(hr, 100, 150);
      text(min, 100, 225);
      
      // Define circle variables
      float fltCircleX = 400;
      float fltCircleY = 400;
      float fltCircleSize = 300;

      // Create random integer between 1 and 100
      Random colourRandom = new Random();
      int intRandom = colourRandom.nextInt(101);

      // If number is in certain range, draw and change colour of basketball
      if (intRandom > 75 && intRandom <= 100) {
        fill(0, 0, 255);
        stroke(0, 0, 0);
        circle(fltCircleX, fltCircleY, fltCircleSize);
      }
      else if (intRandom <= 75 && intRandom > 50) {
        fill(160, 32, 240);
        stroke(0, 0, 0);
        circle(fltCircleX, fltCircleY, fltCircleSize);
      }
      else if (intRandom <= 50 && intRandom > 25) {
        fill(255, 255, 0);
        stroke(0, 0, 0);
        circle(fltCircleX, fltCircleY, fltCircleSize);
      }
      else if (intRandom <= 25 && intRandom >= 0) {
        fill(255, 0, 0);
        stroke(0, 0, 0);
        circle(fltCircleX, fltCircleY, fltCircleSize);
      }
      
      // Create two arc lines on design of basketball in black colour
      stroke(0);
      noFill();
      circle(fltCircleX / 2, fltCircleY, fltCircleSize);
      circle((float)(fltCircleX * 1.5), fltCircleY, fltCircleSize);
  
      // Create two straight lines on design of basketball in black colour
      line(fltCircleX, fltCircleY * 0, fltCircleX, fltCircleY * 2);
      line(fltCircleX * 0, fltCircleY, fltCircleX * 2, fltCircleY);
    }
  
    /**
     * Called repeatedly, anything drawn to the screen goes here
     */
    public void draw() {

      

    }
    
    // define other methods down here.
  }