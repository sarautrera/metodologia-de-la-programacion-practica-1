package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;

// esta clase sirve para representar un punto en un plano de dos dimensiones
public class MyPoint {
    // atributos privados para guardar las coordenadas x e y (encapsulamiento)
    private int x=0;
    private int y=0;

    // constructor por defecto que situa el punto en el origen (0,0)
    public MyPoint(){
        this.x= 0;
        this.y= 0;
    }

    // constructor para colocar el punto en las coordenadas que queramos al crearlo
    public MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }

    // metodos getter y setter para leer o cambiar el valor de x
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }

    // lo mismo que antes pero para manejar la coordenada y
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }

    // devuelve un array con las dos coordenadas juntas [x, y]
    public int[] getXY(){
        return new int[]{x,y};
    }

    // permite actualizar la x y la y a la vez de forma rapida
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }

    // saca el punto por pantalla con el formato tipico de coordenadas (x,y)
    public String toString(){
        return "("+x+","+y+")";
    }

    // calcula la distancia desde el origen hasta las coordenadas que le pasemos
    public double distance(int x, int y){
        // usa la formula de pitagoras para sacar la hipotenusa
        return Math.sqrt(x*x+y*y);
    }

    // calcula la distancia entre este punto y otro objeto mypoint que reciba
    public double distance(MyPoint another){
        // sacamos la diferencia que hay entre las x y las y de ambos puntos
        int xDif=this.x -another.getX();
        int yDif=this.y- another.getY();
        // aplicamos la raiz cuadrada a la suma de los cuadrados de las diferencias
        return Math.sqrt(xDif*xDif+yDif*yDif);
    }

    // este metodo sin parametros saca la distancia desde el punto actual al origen (0,0)
    public double distance(){
        return Math.sqrt(this.x*this.x+this.y*this.y);
    }
}




