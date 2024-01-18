package oop;

import java.util.Arrays;

public class PointDriver {

	public static void main(String[] args) {
		
		
		/*
		Point p ;
		
		p = new Point();


		System.out.println(p);
		
		p.setY(2.1);
		
		System.out.println(p);
		p.translate(-10, 10);
		System.out.println(p);
		
		
		Point[] points = new Point[5];
		System.out.println(Arrays.toString(points));
		for (int i = 0; i< points.length; i++) {
			points[i] = new Point(i, i);
		}
		
		
		System.out.println(Arrays.toString(points));
		*/
		
		
		Point a = new Point(1,1);
		System.out.println(a.distanceFromOrigin());
		
		
	}

}
