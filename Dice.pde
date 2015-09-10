Die theDie;
void setup()
{
	size(1000, 850);
	noLoop();
}
void draw()
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
	
void mousePressed()
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
	void roll()
	{
		dots= (int)(Math.random()*6)+1;
		//your code here
	}
	void show()
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
