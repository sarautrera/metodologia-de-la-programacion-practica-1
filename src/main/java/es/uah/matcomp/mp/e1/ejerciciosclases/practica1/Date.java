package es.uah.matcomp.mp.e1.ejerciciosclases.practica1;

// clase para manejar fechas siguiendo la estructura que vimos en el uml
public class Date {
    // atributos privados para que el dia, mes y año esten bien protegidos
    private int day;
    private int month;
    private int year;

    // constructor para crear la fecha con sus tres valores de golpe
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // metodos getter para poder consultar el dia, el mes o el año desde fuera
    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    // setters individuales por si solo queremos cambiar una parte de la fecha
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // metodo para actualizar la fecha completa de una sola vez
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // devuelve la fecha formateada como un texto tipo dd/mm/aaaa
    public String toString() {
        // usamos string.format para que los numeros salgan siempre con dos digitos (rellena con ceros)
        return String.format("%02d/%02d/%4d", this.day, this.month, this.year);
    }
}