package es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4;

public class Point3D extends Point2D{
    private float z;
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z=z;
    }
    public Point3D(){
        super(0.0f,0.0f);
        z=0.0f;
    }
    public float getZ(){
        return z;
    }
    public void setZ(float z){
        this.z=z;
    }
    public void setXYZ(float x, float y, float z) {
        setX(x); // or super.setX(x), use setter in superclass
        setY(y);
        this.z = z;
    }
    public float[] getXYZ() {
        float[] result = new float[3]; // construct an array of 2 elements
        result[0] = getX();
        result[1] = getY();
        result[2] = z;
        return result; // return the array
    }
    @Override
    public String toString(){
        return "("+getX()+","+getY()+","+z+")";
    }
}
