package es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;
     public  MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
         this.center = new MovablePoint(1,1,2,2);
         this. radius =radius;
     }
    @Override
    public void moveUp(){
        center.y += center.ySpeed;
    }
    @Override
    public void moveDown(){
        center.y -= center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= center.xSpeed;
    }
    @Override
    public void moveRight(){
        center.x += center.xSpeed;
    }
    public String toString(){
        return "("+center.x+","+center.y+"), speed=("+center.x+","+center.y+"), radius="+radius;
    }
}
