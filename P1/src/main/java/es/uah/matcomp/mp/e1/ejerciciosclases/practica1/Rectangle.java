package es.uah.matcomp.mp.e1.ejerciciosclases.practica1;

public class Rectangle {
    //Atributos
    private float lenght;
    private float width;
    //Contructores
    public Rectangle(){
        this.lenght =1.0f;
        this.width =1.0f;
    }
    public Rectangle(float lenght,float width){
        this.lenght=lenght;
        this.width=width;
    }
    public float getLength(){
        return lenght;
    }
    public void setLength(float lenght){
        this.lenght=lenght;
    }
    public float getWidth(){
        return width;
    }
    public void setWidth(float width){
        this.width=width;
    }
    public double getArea(){
        return lenght*width;
    }
    public double getPerimeter(){
        return 2*lenght+2*width;
    }
    public String toString(){
        return "rectangle [lenght= "+lenght+", width= "+width+"]";
    }




}
