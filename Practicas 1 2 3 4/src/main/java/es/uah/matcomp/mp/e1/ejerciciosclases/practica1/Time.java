package main.java.es.uah.matcomp.mp.e1.ejerciciosclases.practica1;

public class Time {
    //Atributos
    private int hour;
    private int minute;
    private int second;
    /**Constructor con argumentos*/
    public Time(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    /**Getter para obtener las horas*/
    public int getHour(){
        return hour;
    }
    /**Getter para obtener los minutos*/
    public int getMinute(){
        return minute;
    }
    /**Getter para obtener los segundos*/
    public int getSecond(){
        return second;
    }
    /**Setter para establecer la hora*/
    public void setHour(int hour){
        this.hour=hour;
    }
    /**Setter para establecer los minutos*/
    public void setMinute(int minute){
        this.minute=minute;
    }
    /**Setter para establecer los segundos*/
    public void setSecond(int second){
        this.second=second;
    }
    /**Metodo para establecer el tiempo*/
    public void setTime(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public String toString(){
        return String.format("%02d:%02d:%02d",hour, minute, second);
    }
    /**Metodo para aumentar en un segundo*/
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
    }/**Metodo para restar en un segundo*/
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
}
