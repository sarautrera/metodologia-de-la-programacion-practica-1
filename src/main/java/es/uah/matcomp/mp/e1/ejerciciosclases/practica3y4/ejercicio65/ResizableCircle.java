package es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4.ejercicio65;

public class ResizableCircle extends Circle implements Resizable{
    public ResizableCircle(double radius){
        super(radius);
    }
    public String toString(){
        return "ResizableCircle["+super.toString()+"]";
    }
    @Override
    public void resize(int percent){
        radius*=percent/100.0;
    }
}
