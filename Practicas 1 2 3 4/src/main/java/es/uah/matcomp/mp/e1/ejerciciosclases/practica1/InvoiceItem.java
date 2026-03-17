package main.java.es.uah.matcomp.mp.e1.ejerciciosclases.practica1;

public class InvoiceItem {
    //Atributos
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    /**Constructor con argumentos*/
    public InvoiceItem(String id, String desc, int qty, double unitPrice){
        this.id=id;
        this.desc=desc;
        this.qty=qty;
        this.unitPrice=unitPrice;
    }
    /**Getter para obtener el id*/
    public String getId(){
        return id;
    }
    /**Getter para obtener el desc*/
    public String getDesc(){
        return desc;
    }
    /**Getter para obtener el qty*/
    public int getQty(){
        return qty;
    }
    /**Getter para establecer qty*/
    public void setQty(int qty){
        this.qty=qty;
    }
    /**Getter para obtener el UnitPrice*/
    public double getUnitPrice(){
        return unitPrice;
    }
    /**Getter para establecer UnitPrice*/
    public void setUnitPrice(double unitPrice){
        this.unitPrice=unitPrice;
    }
    /**Metodo para hallar el total*/
    public double getTotal(){
        return unitPrice*qty;
    }
    public String toString(){
        return "InvoiceItem[id="+id+", desc="+desc+", qty="+qty+", unitPrice="+unitPrice+"]";
    }
}
