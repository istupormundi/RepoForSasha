package task1;

import java.lang.Math;

public class Point {

    private double x;
    private double y;

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    private double square(double num){
        return num*num;
    }

    public double getX(){
        return x;
    }

    public void setX(double new_x){
        this.x = new_x;
    }

    public double getY(){
        return y;
    }

    public void setY(double new_y){
        this.y = new_y;
    }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    public final double distance(Point point){
        return Math.sqrt(square(point.x - this.getX()) + square(point.y - this.getY()));
    }

    public Point translate(double deltaX, double deltaY){
        return new Point(getX() + deltaX, getY() + deltaY);
    }

    public Point scale(double koef){
        return new Point(getX()*koef, getY()*koef);
    }
}
