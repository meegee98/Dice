void setup()
{
	size(400, 400);
	noLoop();
	theDie= new Die(20, 20);
}
void draw()
{
	
			
			//theDie.roll();
			theDie.show();//your code here
}
	
void mousePressed()
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
	void roll()
	{
		//your code here
	}
	void show()
	{
		stroke(0); //your code here
		fill(255);
		rect(myX, myY, 20, 20);
		

	}
}
