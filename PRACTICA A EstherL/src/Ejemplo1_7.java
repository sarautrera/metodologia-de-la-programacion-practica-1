public class Ejemplo1_7 {
    public static void main(String[] args) {
        //ArrayIndexOutOfBoundsException
        try {
            int[] caja = {1, 2, 3};
            System.out.println(caja[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error, el array al que intenta acceder esta fuera de los limites");
        }
        //NullPointerException
        try {
            String[] strs = new String[3];
            System.out.println(strs[0].length());
        } catch (NullPointerException e) {
            System.err.println("Error, el array esta vacio");
        }
        //NumberFormatException
        try {
            Integer.parseInt("abc");
        } catch(NumberFormatException e){
            System.err.println("Error, la cadena no tiene el formato apropiado");
        }
        //ClassCastException
        try{
            Object o =new Object();
            Integer i = (Integer)o;
        }catch(ClassCastException e){
            System.err.println("Error, objeto no compatible");
        }
    }
}

