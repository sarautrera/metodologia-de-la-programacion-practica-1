package es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4;

public class LineSub extends Point {
    // A line needs two points: begin and end.
// The begin point is inherited from its superclass Point.
// Private variables
    Point end; // Ending point
    // Constructors
    public LineSub (int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY); // construct the begin Point
        this.end = new Point(endX, endY); // construct the end Point
    }
    public LineSub (Point begin, Point end) { // caller to construct the Points
        super(begin.getX(), begin.getY()); // need to reconstruct the begin Point
        this.end = end;
    }
    // Public methods
// Inherits methods getX() and getY() from superclass Point
    public String toString() {
        return "Línea de "+ super.toString() + "hasta"  + end.toString();
    }
    public Point getBegin() {
        return new Point(getX(),getY());
    }
    public Point getEnd() {
        return end;
    }
    public void setBegin(Point begin) {
        this.setX(begin.getX());
        this.setY(begin.getY());
    }
    public void setEnd(Point end) {
        this.end=end;
    }
    public float getBeginX() {
        return this.getX();
    }
    public float getBeginY() {
        return getY();
    }
    public float getEndX() {
        return end.getX();
    }
    public float getEndY() {
        return end.getY();
    }
    public void setBeginX(int x) {
        this.setX(x);
    }
    public void setBeginY(int y) {
        this.setY(y);
    }
    public void setBeginXY(int x, int y) {
        setXY(x,y);
    }
    public void setEndX(int x) {
        end.setX(x);
    }
    public void setEndY(int y) {
        end.setY(y);
    }
    public void setEndXY(int x, int y) {
        end.setXY(x,y);
    }
    public float getLength() {
        float difX=end.getX()-this.getX();
        float difY=end.getY()-this.getY();
        return (float)Math.sqrt(difX*difX+difY*difY);
    } // Length of the line
    public float getGradient() {
        float xDif = end.getX() - this.getX();
        float yDif = end.getY() - this.getY();
        return (float) Math.atan2(yDif, xDif);
    } // Gradient in radians
}

//en este caso es mejor composicion, pq una linea son dos puntos.