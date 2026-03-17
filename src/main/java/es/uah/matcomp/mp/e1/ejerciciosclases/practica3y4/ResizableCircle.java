package es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4;

public class ResizableCircle extends Circle2 implements Resizable{
    public ResizableCircle(double radius){
        super(radius);
    }

    @Override
    public void resize(int percent){
        this.radius *= (percent / 100.0);
    }
    public String toString(){
        return "ResizableCircle["+super.toString()+"]";
    }
}
