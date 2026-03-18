package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;

// esta clase representa un triangulo formado por tres puntos en el plano
public class MyTriangle {
    // definimos los tres puntos que seran los vertices del triangulo
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    // constructor para crear el triangulo pasando las coordenadas x e y de cada vertice
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        // creamos objetos mypoint internos para cada vertice
        this.v1= new MyPoint(x1, y1);
        this.v2= new MyPoint(x2, y2);
        this.v3= new MyPoint(x3, y3);
    }

    // este constructor se usa si ya tenemos los tres objetos punto creados
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1=v1;
        this.v2=v2;
        this.v3=v3;
    }

    // muestra los datos de los tres vertices en una sola cadena de texto
    public String toString(){
        return "MyTriangle[v1= "+v1+", v2= "+v2+", v3= "+v3+"]";
    }

    // calcula el perimetro sumando la distancia entre cada par de puntos
    public double getPerimeter(){
        // reutilizamos el metodo distance que ya tiene la clase mypoint
        return v1.distance(v2)+v2.distance(v3)+v3.distance(v1);
    }

    // este metodo analiza los lados para decirnos que tipo de triangulo es
    public String getType(){
        // si los tres lados miden lo mismo es que es equilatero
        if(v1.distance(v2)==v2.distance(v3) && v1.distance(v2)==v3.distance(v1)&&v2.distance(v3)==v3.distance(v1)){
            return "es equilatero";
        }
        // si no hay ningun lado igual entre si entonces es escaleno
        if(v1.distance(v2)!=v2.distance(v3) && v1.distance(v2)!=v3.distance(v1) &&v2.distance(v3)!=v3.distance(v1)){
            return "es escaleno";
        }
        // en cualquier otro caso (dos lados iguales) sera isosceles
        else{
            return "es isosceles";
        }
    }
}