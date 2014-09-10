// int startX, startY, endX, endY;
int startX=0;
int startY=150;
int endX=0;
int endY=150;

void setup()
{
	size(600,300);
	background(0,0,0);
	strokeWeight(0.25);
	frameRate(200);

}
void draw()
{
	stroke(0,startX,startY);
	if(startX<600)
	{
		endX=startX+(int)(Math.random()*10);
		endY=startY+(int)(Math.random()*15)-7;
		line(startX,startY,endX,endY);
		startX=endX;
		startY=endY;
		stroke(0,startX,startY);
	}
	fill(0,0,0,7);
	rect(0,0,600,300);

}

void mousePressed()
{
	startX=mouseX;
	startY=mouseY;
	endX=mouseX;
	endY=mouseY;
}

