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

public class Lightning extends PApplet {

// int startX, startY, endX, endY;
int startX=0;
int startY=150;
int endX=0;
int endY=150;

public void setup()
{
	size(600,300);
	background(0,0,0);
	strokeWeight(0.25f);
	frameRate(200);

}
public void draw()
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
	if(startX>300)
	{
	fill(0,0,0,7);
	rect(0,0,600,300);
	}

}

public void mousePressed()
{
	startX=mouseX;
	startY=mouseY;
	endX=mouseX;
	endY=mouseY;
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
