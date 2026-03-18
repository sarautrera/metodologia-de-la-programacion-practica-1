package es.uah.matcomp.mp.e1.ejerciciosclases.practica1;
// Clase para crear rectángulos y calcular su espacio y borde
public class Rectangle {

    // ATRIBUTOS
    private float lenght;
    private float width;

    // CONSTRUCTORES
    public Rectangle(){
        this.lenght =1.0f;
        this.width =1.0f;
    }
    public Rectangle(float lenght,float width){
        this.lenght=lenght;
        this.width=width;
    }

    // GETS
    public float getLength(){
        return lenght;
    }
    public float getWidth(){
        return width;
    }

    // SETS
    public void setLength(float lenght){
        this.lenght=lenght;
    }
    public void setWidth(float width){
        this.width=width;
    }

    // FUNCIONES ESPECÍFICAS

    // Calcula el área multiplicando el largo por el ancho
    public double getArea(){
        return lenght*width;
    }

    // Suma todos los lados para sacar el perímetro total
    public double getPerimeter(){
        return 2*lenght+2*width;
    }

    // TOSTRING
    public String toString(){
        return "rectangle [lenght= "+lenght+", width= "+width+"]";
    }

}