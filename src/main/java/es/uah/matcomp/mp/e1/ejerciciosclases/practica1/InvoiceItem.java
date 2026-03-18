package es.uah.matcomp.mp.e1.ejerciciosclases.practica1;

// esta clase sirve para gestionar cada uno de los articulos de una factura
public class InvoiceItem {
    // definimos los atributos privados para que los datos del producto esten seguros
    private String id;
    private String desc; // descripcion del articulo o servicio
    private int qty; // cantidad de unidades compradas
    private double unitPrice; // precio de cada unidad (dinero por unidad)

    // constructor para crear el objeto con toda la informacion del tiquet
    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    // metodos de acceso para consultar el identificador y la descripcion
    public String getId() {
        return this.id;
    }

    public String getDesc() {
        return this.desc;
    }

    // permite saber cuantas unidades se han anotado en la factura
    public int getQty() {
        return this.qty;
    }

    // por si nos hemos equivocado y tenemos que cambiar la cantidad
    public void setQty(int qty) {
        this.qty = qty;
    }

    // devuelve el dinero que cuesta una sola unidad del producto
    public double getUnitPrice() {
        return this.unitPrice;
    }

    // permite actualizar el precio unitario si cambia el coste
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // este metodo es clave: calcula el dinero total de esta linea multiplicando precio por cantidad
    public double getTotal() {
        // hacemos un cast a double para asegurar que el calculo de dinero sea preciso
        return this.unitPrice * (double)this.qty;
    }

    // saca un resumen del articulo con todos sus datos bien formateados
    public String toString() {
        return "InvoiceItem[id= " + this.id + ", desc= " + this.desc + ", qty= " + this.qty + ", unitPrice= " + this.unitPrice + "]";
    }
}