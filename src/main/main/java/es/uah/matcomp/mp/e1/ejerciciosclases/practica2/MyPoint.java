package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;

// esta clase define un punto en un plano de dos dimensiones (x e y)
public class MyPoint {
    // atributos privados para que nadie los cambie sin usar los metodos (encapsulamiento)
    private int x=0;
    private int y=0;

    // constructor por defecto que pone el punto en el origen (0,0)
    public MyPoint(){
        this.x= 0;
        this.y= 0;
    }

    // constructor para colocar el punto en las coordenadas que queramos al crear el objeto
    public MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }

    // metodos getter y setter para leer o cambiar las coordenadas una a una
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }

    // saca las dos coordenadas a la vez metidas en un array de enteros
    public int[] getXY(){
        return new int[]{x,y};
    }

    // permite cambiar la x y la y de golpe
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }

    // para que cuando imprimamos el punto salga con el formato tipico (x,y)
    public String toString(){
        return "("+x+","+y+")";
    }

    // calcula la distancia desde el origen hasta las coordenadas que le pasemos
    public double distance(int x, int y){
        // usa la formula de la hipotenusa (raiz cuadrada de la suma de los cuadrados)
        return Math.sqrt(x*x+y*y);
    }

    // calcula la distancia entre este punto y otro objeto mypoint que le pasemos
    public double distance(MyPoint another){
        // sacamos la diferencia entre las x y las y de los dos puntos
        int xDif=this.x -another.getX();
        int yDif=this.y- another.getY();
        return Math.sqrt(xDif*xDif+yDif*yDif);
    }

    // calcula la distancia que hay desde este punto concreto hasta el origen (0,0)
    public double distance(){
        return Math.sqrt(this.x*this.x+this.y*this.y);
    }
}





