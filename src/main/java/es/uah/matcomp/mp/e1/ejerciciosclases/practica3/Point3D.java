package es.uah.matcomp.mp.e1.ejerciciosclases.practica3;
// Clase para representar un punto en el espacio (3D) heredando de Point2D
public class Point3D extends Point2D {

    // ATRIBUTOS
    private float z = 0.0f;

    // CONSTRUCTORES
    public Point3D(float x, float y, float z){
        // Usamos super para que Point2D gestione la X y la Y
        super(x, y);
        this.z = z;
    }

    public Point3D(){
        // Constructor vacío (X, Y y Z se quedan en 0.0 por defecto)
    }

    // GETS
    public float getZ(){
        return this.z;
    }

    // Devuelve un array con las tres coordenadas [x, y, z]
    public float[] getXYZ(){
        float[] coord = new float[3];
        coord[0] = getX();
        coord[1] = getY();
        coord[2] = z;
        return coord;
    }

    // SETS
    public void setZ(float z){
        this.z = z;
    }

    // Actualiza las tres coordenadas de golpe
    public void setXYZ(float x, float y, float z){
        this.setXY(x, y); // Aprovechamos el método de la clase padre
        this.z = z;
    }

    // TOSTRING
    @Override
    public String toString(){
        // Formato clásico de punto: (x,y,z)
        return "(" + getX() + "," + getY() + "," + z + ")";
    }
}