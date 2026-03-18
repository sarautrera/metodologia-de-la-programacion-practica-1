package es.uah.matcomp.mp.e1.ejerciciosclases.practica1;
// Clase para gestionar cada línea de una factura (producto, cantidad y precio)
public class InvoiceItem {

    // ATRIBUTOS
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    // CONSTRUCTORES
    public InvoiceItem(String id, String desc, int qty, double unitPrice){
        this.id=id;
        this.desc=desc;
        this.qty=qty;
        this.unitPrice=unitPrice;
    }

    // GETS
    public String getId(){
        return id;
    }
    public String getDesc(){
        return desc;
    }
    public int getQty(){
        return qty;
    }
    public double getUnitPrice(){
        return unitPrice;
    }

    // SETS
    public void setQty(int qty){
        this.qty=qty;
    }
    public void setUnitPrice(double unitPrice){
        this.unitPrice=unitPrice;
    }

    // FUNCIONES ESPECÍFICAS

    // Calcula el precio total de esta línea multiplicando cantidad por precio unitario
    public double getTotal(){
        return unitPrice*qty;
    }

    // TOSTRING
    public String toString(){
        return "InvoiceItem[id="+id+", desc="+desc+", qty="+qty+", unitPrice="+unitPrice+"]";
    }
}