package task1;

import task1.Point;

public class Main {

    public static void main (String[] args){

        Point point1 = new Point(-4, -2);
        Point point2 = new Point(-2, -4);

        //distance()
        double distance = point1.distance(point2);
        System.out.println(distance);

        //translate()
        Point movedPoint1 = point1.translate(1,1);
        Point movedPoint2 = point2.translate(4, 0);
        System.out.println("moved point1(" + movedPoint1.getX() + ", " + movedPoint1.getY() + ")");
        System.out.println("moved point2(" + movedPoint2.getX() + ", " + movedPoint2.getY() + ")");

        //scale()
        Point scaledPoint = new Point(3,4).translate(1, 3).scale(2);
        System.out.println("scaled (" + scaledPoint.getX() + ", " + scaledPoint.getY() + ")");
    }
}
