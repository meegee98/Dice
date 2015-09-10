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
	size(1000, 850);
	noLoop();
}
public void draw()
{
	background(95, 158, 160);
	int sum =0;
	for(int y=10; y<=770; y+=60)
	{
		for(int x=10; x<=950; x+=60)
		{
			theDie= new Die(x, y);
			theDie.roll();
			theDie.show();
			if(theDie.dots<=6) //must be in for loop
			{
				sum= sum+ theDie.dots;//your code here
			}
		}
	}
	fill(0);
	textSize(35);
	text("Total Die=208", 700, 820);
	text("Total Rolled=" + sum, 100, 820);
}
	
public void mousePressed()
{
	redraw();
}

class Die //models one single dice cube
{
	int dots;
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
				dots= (int)(Math.random()*6)+1;
		//your code here
	}
	public void show()
	{
		stroke(0); //your code here
		
		if(dots==1)
		{
			fill(221, 160, 221);
			rect(myX, myY, 60, 60);
			noStroke();
			fill(0, 0, 0, 100);
			ellipse(myX+30, myY+30, 10, 10);
		}
		if(dots==2)
		{
			fill(219, 112, 147);
			rect(myX, myY, 60, 60);
			noStroke();
			fill(0, 0, 0, 100);
			ellipse(myX+15, myY+15, 10, 10);
			ellipse(myX+45, myY+45, 10, 10);
		}
		if(dots==3)
		{
			fill(100, 149, 237);
			rect(myX, myY, 60, 60);
			noStroke();
			fill(0, 0, 0, 100);
			ellipse(myX+10, myY+10, 10, 10);
			ellipse(myX+30, myY+30, 10, 10);
			ellipse(myX+50, myY+50, 10, 10);
		}
		if(dots==4)
		{
			fill(123, 104, 238);
			rect(myX, myY, 60, 60);
			noStroke();
			fill(0, 0, 0, 100);
			ellipse(myX+15, myY+15, 10, 10);
			ellipse(myX+45, myY+15, 10, 10);
			ellipse(myX+15, myY+45, 10, 10);
			ellipse(myX+45, myY+45, 10, 10);
		}
		if(dots==5)
		{
			fill(0, 206, 209);
			rect(myX, myY, 60, 60);
			noStroke();
			fill(0, 0, 0, 100);
			ellipse(myX+15, myY+15, 10, 10);
			ellipse(myX+45, myY+15, 10, 10);
			ellipse(myX+30, myY+30, 10, 10);
			ellipse(myX+15, myY+45, 10, 10);
			ellipse(myX+45, myY+45, 10, 10);
		}
		if(dots==6)
		{
			fill(102, 205, 170);
			rect(myX, myY, 60, 60);
			noStroke();
			fill(0, 0, 0, 100);			
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
