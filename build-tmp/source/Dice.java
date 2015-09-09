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

Die theDie;
public void setup()
{
	size(400, 400);
	noLoop();
	}
public void draw()
{
	
			
			theDie= new Die(20, 20);
			theDie.roll();
			theDie.show();//your code here
}
	
public void mousePressed()
{
	redraw();
}
class Die //models one single dice cube
{
	int dots; //
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
		//dots=1;
		dots= (int)(Math.random()*6)+1;
		//your code here
	}
	public void show()
	{
		stroke(0); //your code here
		//fill((int)(Math.random()*255),(int)(Math.random()*255), (int)(Math.random()*255));
		//rect(myX, myY, 60, 60);
		if(dots==1)
		{
			fill(255);
			rect(myX, myY, 60, 60);
			fill(0);
			ellipse(myX+30, myY+30, 10, 10);
		}
		if(dots==2)
		{
			fill(255);
			rect(myX, myY, 60, 60);
			fill(0);
			ellipse(myX+15, myY+15, 10, 10);
			ellipse(myX+45, myY+45, 10, 10);
		}
		if(dots==3)
		{
			fill(255);
			rect(myX, myY, 60, 60);
			fill(0);
			ellipse(myX+10, myY+10, 10, 10);
			ellipse(myX+30, myY+30, 10, 10);
			ellipse(myX+50, myY+50, 10, 10);
		}
		if(dots==4)
		{
			fill(255);
			rect(myX, myY, 60, 60);
			fill(0);
			ellipse(myX+15, myY+15, 10, 10);
			ellipse(myX+45, myY+15, 10, 10);
			ellipse(myX+15, myY+45, 10, 10);
			ellipse(myX+45, myY+45, 10, 10);
		}
		if(dots==5)
		{
			fill(255);
			rect(myX, myY, 60, 60);
			fill(0);
			ellipse(myX+15, myY+15, 10, 10);
			ellipse(myX+45, myY+15, 10, 10);
			ellipse(myX+30, myY+30, 10, 10);
			ellipse(myX+15, myY+45, 10, 10);
			ellipse(myX+45, myY+45, 10, 10);
		}
		if(dots==6)
		{
			fill(255);
			rect(myX, myY, 60, 60);
			fill(0);
			ellipse(myX+15, myY+15, 10, 10);
			ellipse(myX+45, myY+15, 10, 10);
			ellipse(myX+15, myY+30, 10, 10);
			ellipse(myX+45, myY+30, 10, 10);
			ellipse(myX+15, myY+45, 10, 10);
			ellipse(myX+45, myY+45, 10, 10);

		}
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
