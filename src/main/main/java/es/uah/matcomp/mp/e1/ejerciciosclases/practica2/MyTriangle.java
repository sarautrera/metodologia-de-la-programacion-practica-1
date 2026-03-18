package es.uah.matcomp.mp.e1.ejerciciosclases.practica2;

// esta clase sirve para montar un triangulo a partir de tres vertices (puntos)
public class MyTriangle {
    // definimos los tres puntos que forman las esquinas del triangulo
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    // este constructor crea los tres puntos desde cero pasandole las coordenadas x e y
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        this.v1= new MyPoint(x1, y1);
        this.v2= new MyPoint(x2, y2);
        this.v3= new MyPoint(x3, y3);
    }

    // este otro constructor usa puntos que ya tengamos creados de antes
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1=v1;
        this.v2=v2;
        this.v3=v3;
    }

    // para que al imprimir el triangulo nos salgan las coordenadas de sus tres esquinas
    public String toString(){
        return "MyTriangle[v1= "+v1+", v2= "+v2+", v3= "+v3+"]";
    }

    // calcula el perimetro sumando la distancia que hay entre cada uno de los puntos
    public double getPerimeter(){
        // aprovechamos el metodo distance que ya hicimos en la clase mypoint
        return v1.distance(v2)+v2.distance(v3)+v3.distance(v1);
    }

    // este metodo nos dice que tipo de triangulo es comparando lo que miden sus lados
    public String getType(){
        // si todos los lados miden lo mismo, es que es equilatero
        if(v1.distance(v2)==v2.distance(v3) && v1.distance(v2)==v3.distance(v1)&&v2.distance(v3)==v3.distance(v1)){
            return "es equilatero";
        }
        // si no hay ni un solo lado igual, entonces es escaleno
        if(v1.distance(v2)!=v2.distance(v3) && v1.distance(v2)!=v3.distance(v1) &&v2.distance(v3)!=v3.distance(v1)){
            return "es escaleno";
        }
        // y si no es ninguno de los anteriores, es que tiene dos lados iguales (isosceles)
        else{
            return "es isosceles";
        }
    }
}
