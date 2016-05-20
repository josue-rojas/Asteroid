package asteroid;

import java.util.Random;

public class Star extends Circle{
	
	
	public Star(){
		super(pos(),size());
	}
	
	/**
	 * Method size: creates and returns a random radius for star
	 **/
	public static int size(){
		Random r = new Random();
		int size = r.nextInt(5);
		return size;
	}
	/**
	 *Method pos: creates and returns a random Point representing position of a star
	 **/
	public static Point pos(){
		Random r = new Random();
		int x = r.nextInt(Asteroids.w);
		int y = r.nextInt(Asteroids.h);
		Point pos = new Point(x,y);
		return pos;
	}
	/**
	 * Method starArray creates and returns an array of Star
	 * it takes an int to know how many should be creates.
	 **/
	public static Star[] starArray(int n){
		Star[] output = new Star[n];
		for(int i = 0; i < n; i++){
			output[i] = new Star();
		}
		return output;
	}

}
