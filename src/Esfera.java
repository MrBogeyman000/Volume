public class Esfera {
    public static double calcularVolume(double raio){
        double volume = 0.0;
        volume = ( 4 * Math.PI * raio * raio * raio ) / 3.0 ;
        return volume;
    }
}