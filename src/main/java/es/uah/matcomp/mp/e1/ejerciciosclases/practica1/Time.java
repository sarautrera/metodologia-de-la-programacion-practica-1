package es.uah.matcomp.mp.e1.ejerciciosclases.practica1;
// Clase para manejar la hora (horas, minutos y segundos) y poder moverla
public class Time {

    // ATRIBUTOS
    private int hour;
    private int minute;
    private int second;

    // CONSTRUCTORES
    public Time(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    // GETS
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }

    // SETS
    public void setHour(int hour){
        this.hour=hour;
    }
    public void setMinute(int minute){
        this.minute=minute;
    }
    public void setSecond(int second){
        this.second=second;
    }

    // FUNCIONES ESPECÍFICAS

    // Cambia la hora completa de una sola vez
    public void setTime(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    // Suma un segundo y va ajustando minutos y horas si llegan al tope (60 o 24)
    public Time nextSecond(){
        this.second=second+1;
        if (second==60){
            this.minute=minute+1;
            this.second=0;
            if (minute==60){
                this.hour=hour+1;
                this.minute=0;
                if (hour==24){
                    this.hour=0;
                }
            }
        }
        return this;
    }

    // Resta un segundo y vuelve atrás las horas y minutos si bajan de cero
    public Time previousSecond(){
        this.second=second-1;
        if (second==-1){
            this.minute=minute-1;
            this.second=59;
            if (minute==-1){
                this.hour=hour-1;
                this.minute=59;
                if (hour==-1){
                    this.hour=23;
                }
            }
        }
        return this;
    }

    // TOSTRING
    public String toString(){
        return String.format("%02d:%02d:%02d",hour, minute, second);
    }
}