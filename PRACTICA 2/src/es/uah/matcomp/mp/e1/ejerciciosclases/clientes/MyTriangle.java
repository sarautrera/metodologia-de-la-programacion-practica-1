package es.uah.matcomp.mp.e1.ejerciciosclases.clientes;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        this.v1= new MyPoint(x1, y1);
        this.v2= new MyPoint(x2, y2);
        this.v3= new MyPoint(x3, y3);
    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1=v1;
        this.v2=v2;
        this.v3=v3;
    }
    public double getPerimeter(){
        double diff1= v1.distance(v2);
        double diff2= v2.distance(v3);
        double diff3= v3.distance(v1);
        return diff1+diff2+diff3;
    }
    public String getType() {
        double diff1 = v1.distance(v2);
        double diff2 = v2.distance(v3);
        double diff3 = v3.distance(v1);
        if (diff1 == diff2 && diff2 == diff3) {
            return "Equilateral";
        }
        else if (diff1 == diff2 || diff2 == diff3 || diff3 == diff1) {
            return "Isosceles";
        }
        else {
            return "Scalene";
            }
        }

    public String toString(){
        return "MyTriangle[v1="+v1+",v2="+v2+",v3"+v3+"]";
    }
}

