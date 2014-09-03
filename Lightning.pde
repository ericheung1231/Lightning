// int startX, startY, endX, endY;
int startX=0;
int startY=150;
int endX=0;
int endY=150;

void setup()
{
	size(300,300);
	background(0,0,0);
	strokeWeight(0.5);

}
void draw()
{
	stroke(0,startX,startX);
	while(endX<300)
	{
		endX=startX+(int)(Math.random()*10);
		endY=startY+(int)(Math.random()*20)-9;
		line(startX,startY,endX,endY);
		startX=endX;
		startY=endY;
		stroke(0,startX,startY);
	}

}

void mousePressed()
{
	startX=mouseX;
	startY=mouseY;
	endX=mouseX;
	endY=mouseY;
}

