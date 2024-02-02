package Pq480;

/**
 *
 * @author sergioandreu
 */
public class DiscoDuro extends Disco
{
   public DiscoDuro(String pNombre, double pCapacidad, String pContenido, String pTipo) {
        super(pNombre, pCapacidad, pContenido, pTipo);
    }

    public void leerDatos() {
        System.out.println("Los datos del disco duro son: " + this.contenido);
    }
    
    @Override
    public void informacionDisco()
    {
        System.out.println("\n---- Información del DiscoDuro ----");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Capacidad: " + this.capacidad);
        System.out.println("Contenido: " + this.contenido);
        System.out.println("Tipo de disco: " + this.tipo);
    }
}
