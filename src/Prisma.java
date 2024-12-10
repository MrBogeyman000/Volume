public class Prisma {
    public static double calcularVolume(double lado,double altura){
        double volume = 0.0;
        volume = ( 3 * Math.sqrt(3) * lado * lado * altura ) / 2.0 ;
        return volume;
    }
}