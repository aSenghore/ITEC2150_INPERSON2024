package MultiPoints;
import java.util.Scanner;

public class NamedMultipointTester {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		computeShortestDistance(enterPoints());
	}
	
	public static NamedPoint[] enterPoints(){
		NamedPoint[] points = new NamedPoint[6];
		System.out.println("Enter 6 points of x and y coordinates, each with a name: ");
		
		for(int i = 0; i < points.length; i++) {
			double x = input.nextDouble();
			double y = input.nextDouble();
			String name = input.next();
			points [i] = new NamedPoint(name,x,y);
		}
		
		return points;
	}
	
	public static void computeShortestDistance(NamedPoint[] points) {
		double shortestDistance = Double.MAX_VALUE;
		NamedPoint p1 = null;
		NamedPoint p2 = null;
		for(int i = 0; i < points.length; i++) {
			for(int j = i + 1; j < points.length; j++) {
				double dist = Point.distance(points[i],points[j]);
				if(dist < shortestDistance) {
					shortestDistance = dist;
					p1 = points[i];
					p2 = points[j];
				}
			}	
		}
		System.out.printf("The shortest distance of two points are %s(%.1f,%.1f) and %s(%.1f,%.1f), and their distance is %.1f"
				,p1.getName(), p1.getX(),p1.getY(), p2.getName(), p2.getX(),p2.getY(),shortestDistance);
	}
}
