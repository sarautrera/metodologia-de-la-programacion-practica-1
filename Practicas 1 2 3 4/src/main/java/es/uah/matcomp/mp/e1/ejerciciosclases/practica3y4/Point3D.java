package main.java.es.uah.matcomp.mp.e1.ejerciciosclases.practica3y4;

public class Point3D extends Point2D {
    private float z=0.0f;
    public Point3D(float x, float y , float z){
        super(x, y);
        this.z=z;
    }
    public Point3D(){
    }
    public float getZ(){
        return this.z;
    }
    public void setZ(float z){
        this.z=z;
    }
    public float[] getXYZ(){
        float[] coord =new float[3];
        coord[0]=getX();
        coord[1]=getY();
        coord[2]=z;
        return coord;
    }
    public void setXYZ(float x, float y, float z){
        this.setXY(x,y);
        this.z=z;
    }
    @Override
    public String toString(){
        return "("+getX()+","+getY()+","+z+")";
    }
}
