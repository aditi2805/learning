package codes.basics;

public class Area {
    public int getAreaOfSquare(int side){
        return side * side;
    }

    public int getAreaOfRectangle(int length, int breadth){
        return length * breadth;
    }

    public double getAreaOfCircle(int radius){
        return Math.PI * radius * radius;
    }
}
