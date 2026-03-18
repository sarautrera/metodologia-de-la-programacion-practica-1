package es.uah.matcomp.mp.e1.ejerciciosclases.practica1;

public class Rectangle {
    //Atributos
    private float lenght;
    private float width;
    //Contructores
    /**Constructor por defecto*/
    public Rectangle(){
        this.lenght =1.0f;
        this.width =1.0f;
    }
    /**Constructor con argumentos*/
    public Rectangle(float lenght,float width){
        this.lenght=lenght;
        this.width=width;
    }
    /**Getter para obtener lenght*/
    public float getLength(){
        return lenght;
    }
    /**Setter para establecer lenght*/
    public void setLength(float lenght){
        this.lenght=lenght;
    }
    /**Getter para obtener width*/
    public float getWidth(){
        return width;
    }
    /**Setter para establecer width*/
    public void setWidth(float width){
        this.width=width;
    }
    /**Metodo para hallar el area*/
    public double getArea(){
        return lenght*width;
    }
    /**Getter para hallar el perimetro*/
    public double getPerimeter(){
        return 2*lenght+2*width;
    }
    public String toString(){
        return "rectangle [lenght= "+lenght+", width= "+width+"]";
    }




}
