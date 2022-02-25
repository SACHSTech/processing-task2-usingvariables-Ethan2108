import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    //Scaled Width and Height
    int sizeAdjustedWidth = width / 500;
    int sizeAdjustedHeight = height / 500;
    
    // Sun
    stroke(0);
    fill(246, 255, 0);
    ellipse(460 * sizeAdjustedWidth, 50 * sizeAdjustedHeight, 150 * sizeAdjustedWidth, 150);

    // House
    stroke(0);
    fill(0, 0, 0);
    rect(120 * sizeAdjustedWidth, 240 * sizeAdjustedHeight, 220 * sizeAdjustedWidth, 220 * sizeAdjustedHeight);
    
    // Window 1
    stroke(0);
    fill(222, 222, 222);
    rect(130 * sizeAdjustedWidth, 290 * sizeAdjustedHeight, 50 * sizeAdjustedWidth, 50 * sizeAdjustedHeight);

    // Window 2
    stroke(0);
    fill(222, 222, 222);
    rect(200 * sizeAdjustedWidth, 290 * sizeAdjustedHeight, 50 * sizeAdjustedWidth, 50 * sizeAdjustedHeight);

    // Window 3
    stroke(0);
    fill(222, 222, 222);
    rect(270 * sizeAdjustedWidth, 290 * sizeAdjustedHeight, 50 * sizeAdjustedWidth, 50 * sizeAdjustedHeight);

    // Grass
    stroke(0);
    fill(8, 242, 0);
    rect(0 * sizeAdjustedWidth, 450 * sizeAdjustedHeight, 500 * sizeAdjustedWidth, 80 * sizeAdjustedHeight);

    // Pathway
    stroke(0);
    fill(216, 227, 148);
    rect(200 * sizeAdjustedWidth, 450 * sizeAdjustedHeight, 70 * sizeAdjustedWidth, 80 * sizeAdjustedHeight);

    // Roof
    stroke(0);
    fill(44, 101, 156);
    triangle(80 * sizeAdjustedWidth, 240 * sizeAdjustedHeight, 250 * sizeAdjustedWidth, 140 * sizeAdjustedHeight, 380 * sizeAdjustedWidth, 240 * sizeAdjustedHeight);
	
  }
  
  // define other methods down here.
}