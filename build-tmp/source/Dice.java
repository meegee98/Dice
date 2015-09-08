import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

public void setup()
{
	size(400, 400);
	noLoop();
	theDie= new Die(20, 20);
}
public void draw()
{
	
			
			//theDie.roll();
			theDie.show();//your code here
}
	
public void mousePressed()
{
	redraw();
}
class Die //models one single dice cube
{
	int dots= (int)(Math.random()*6)+1;
	int myX, myY;
	//variable declarations here
	//constructor
	Die(int x, int y) 
	{
		roll();
		myX=x;
		myY=y; //variable initializations here
	}
	public void roll()
	{
		//your code here
	}
	public void show()
	{
		stroke(0); //your code here
		fill(255);
		rect(myX, myY, 20, 20);
		

	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
