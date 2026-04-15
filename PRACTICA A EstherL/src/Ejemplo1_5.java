public class Ejemplo1_5 {
    static class UnidadesInsuficientesException extends Exception{
        public UnidadesInsuficientesException(String mensaje){
            super(mensaje);
        }
    }
    public static void main(String[] args){
        try{
            comprarUnidades(10,20);
            //3. ATRAPAR la excepcion(catch)
        }catch (UnidadesInsuficientesException e){
            System.err.println("OPERACIÓN DENEGADA: " + e.getMessage());
        }finally{
            System.out.println("Operacion finalizada");
        }
    }
    //1. DECLARAR Expcepcion con throws
    public static void comprarUnidades(int uDisponibles, int uPedidas) throws UnidadesInsuficientesException{
    //2.LANZAR la excepion
        if (uPedidas>uDisponibles){
            throw new UnidadesInsuficientesException("No hay suficientes unidades");
        }
        uDisponibles-=uPedidas;
        System.out.println("Unidades concedidas");

    }

}
