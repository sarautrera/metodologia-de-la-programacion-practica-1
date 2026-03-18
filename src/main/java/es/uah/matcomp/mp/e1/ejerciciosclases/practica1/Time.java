package es.uah.matcomp.mp.e1.ejerciciosclases.practica1;


// clase para gestionar el tiempo en formato de horas, minutos y segundos
public class Time {
    // definimos los atributos privados para que la hora no se cambie sin control
    private int hour;
    private int minute;
    private int second;

    // constructor para dejar la hora lista nada mas crear el objeto
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // metodos de acceso para consultar que hora, minuto o segundo tenemos guardado
    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    // metodos de modificacion para cambiar los valores por separado
    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    // este metodo nos permite actualizar toda la hora de golpe
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // formatea la hora para que salga siempre con dos digitos y separada por puntos
    public String toString() {
        // el %02d es clave para que si el numero es un 5 nos lo pinte como 05
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }

    // este metodo suma un segundo y controla que los minutos y horas cambien bien
    public Time nextSecond() {
        ++this.second;
        if (this.second >= 60) {
            this.second = 0; // si pasamos de 60 segundos volvemos a cero
            ++this.minute;   // y sumamos un minuto
            if (this.minute >= 60) {
                this.minute = 0; // si pasamos de 60 minutos volvemos a cero
                ++this.hour;     // y sumamos una hora
                if (this.hour >= 24) {
                    this.hour = 0; // si pasamos de las 23:59 reiniciamos el dia
                }
            }
        }

        return this; // devolvemos el objeto para poder encadenar llamadas si queremos
    }

    // lo mismo pero para ir un segundo hacia atras
    public Time previousSecond() {
        --this.second;
        if (this.second < 0) {
            this.second = 59; // si bajamos de cero segundos volvemos al cincuenta y nueve
            --this.minute;    // y quitamos un minuto
            if (this.minute < 0) {
                this.minute = 59; // si bajamos de cero minutos volvemos al cincuenta y nueve
                --this.hour;      // y quitamos una hora
                if (this.hour < 0) {
                    this.hour = 23; // si bajamos de las doce de la noche volvemos a la hora 23
                }
            }
        }

        return this;
    }
}