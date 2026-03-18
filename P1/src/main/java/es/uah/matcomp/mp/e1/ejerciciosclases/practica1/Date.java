package es.uah.matcomp.mp.e1.ejerciciosclases.practica1;

public class Date {
    //Atributos
    private int day;
    private int month;
    private int year;
    //Constructores
    public Date(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    //getters y setters
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public void setDay(int day){
        this.day=day;
    }
    public void setMonth(int month){
        this.month=month;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void setDate(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public String toString() {
        // %02d -> entero, 2 dígitos, rellena con cero
        // %04d -> entero, 4 dígitos (para el año)
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
