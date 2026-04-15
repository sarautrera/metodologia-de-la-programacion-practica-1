public class Ejemplo1_8 {
    public static class ContraseñaIncorrectaException extends Exception{
        public ContraseñaIncorrectaException(String message){
            super(message);
        }
    }
    public static class Ordenador{
        public static void contraseña(String palabra) throws ContraseñaIncorrectaException{
            if (palabra.equals("unicornio")){
                throw (new ContraseñaIncorrectaException("CONTRASEÑA INCORRECTA"));
            }
            System.out.println("Acceso concedido");
        }
    }
    public static void main(String[] args){
        Ordenador miPC = new Ordenador();
        try{
            miPC.contraseña("limon");
            miPC.contraseña("unicornio");
        }catch(ContraseñaIncorrectaException e){
            System.err.println(e.getMessage());
        }
    }
}
