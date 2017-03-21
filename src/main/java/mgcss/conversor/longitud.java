/**
 * Métodos para convertir unidades de longitud del sistema británico a kilómetros del sistema métrico
 * Esta clase implementa los métodos para convertir millas, estadios, cadenas, barras, yardas, pies y manos
 * a kilómetros.
 * @author: Equipo <indicar equipo> Proyecto colavorativo clase MGCSS-Universidad de Huelva
 */
package mgcss.conversor;


public class longitud {
    /**
     * Método que convierte millas británicas a kilómetros del sistema métrico
     * @param milla double indica las millas que deseamos convertir
     * @return double valor en kilómetros
     */
    public static double milla(double milla){
            // TODO código del conversor
           return (milla*1.61);
    }
  
    public static double estadio(double estadio)
    {
        return (estadio*0.2);
    }
    
    public static double cadenas(double cadenas){
        
        return (cadenas*0.02);
    }
    
    public static double barras(double barras)
    {
        return (barras*0.01);
    }
    
    public static double yardas(double yardas)
    {
       return (yardas * (9.14 * Math.pow(10,-4)));
    }
    
    public static double mano(double mano){
        
        return (mano*(1.02*Math.pow(10, -4)));
    }
}