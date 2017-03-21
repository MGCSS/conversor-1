/**
 * Métodos para convertir unidades de masa del sistema japonés y chino a kilogramos del sistema métrico
 * Esta clase implementa los métodos para convertir koku, kann, kinn, monnme, tael y ku ping a kilogramos
 * @author: Equipo <indicar equipo> Proyecto colavorativo clase MGCSS-Universidad de Huelva
 */
package mgcss.conversor;

public class masa {
    public static double koku(double n){
        
        return n*(6*(Math.pow(10, -3)));
    }
    
    public static double kann(double n){
        
        return n*(3*(Math.pow(10, -1)));
    }
    
    public static double kinn(double n){
        
        return n*2;
    }
    
    public static double monnme(double n){
        
        return n*267;
    }
    
    public static double tael(double n){
        
        return n*26;
    }
    
    public static double kuPing(double n){
        
        return n*27;
    }
}
