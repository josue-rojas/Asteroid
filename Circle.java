package asteroid;

import java.awt.Graphics;

public class Circle {
	
	public Point position;
	public int radius;
	
	public Circle(Point pos, int r){
		position = pos;
		radius = r;
		
	}
	
	
	
	public void paint(Graphics brush){
		brush.drawOval((int)position.x, (int)position.y, radius, radius);
		//brush.fillOval((int)position.x, (int)position.y, radius, radius);
	}
}
