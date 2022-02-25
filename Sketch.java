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

  // Sun
    ellipse(460, 50, 150, 150);
    fill(0, 0, 0);

  // House
    rect(120, 240, 220, 220);
    fill(222, 222, 222);

  // Windows
    rect(130, 290, 50, 50);
    fill(222, 222, 222);

    rect(200, 290, 50, 50);
    fill(222, 222, 222);

    rect(270, 290, 50, 50);
    fill(8, 242, 0);

  // Grass
    rect(0, 450, 500, 80);
    fill(216, 227, 148);

  // Pathway
    rect(200, 450, 70, 80);
    fill(44, 101, 156);

  // Roof
    triangle(80, 240, 250, 140, 380, 240);
    fill(246, 255, 0);
	
  }
  
  // define other methods down here.
}