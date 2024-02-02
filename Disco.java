package Pq480;

/**
 *
 * @author sergioandreu
 */
public abstract class Disco 
{
    protected String nombre;
    protected double capacidad;
    protected String contenido;
    protected String tipo;
    protected boolean insertado;

    public Disco(String pNombre, double pCapacidad, String pContenido, String pTipo) {
        this.nombre = pNombre;
        this.capacidad = pCapacidad;
        this.contenido = pContenido;
        this.tipo = pTipo;
        this.insertado = false;
    }
    
    
    public void girarDisco()
    {
        if(!this.insertado)
        {
            this.insertado = true;
            System.out.println("Disco girando");
        }
        else
        {
            System.out.println("El disco ya esta girando");
        }
    }
    
    public void escribirDatos(String datos) 
    {
        if (this.insertado) {
            if (datos.length() <= this.capacidad) 
            {
                this.contenido = datos;
                System.out.println("Escribiendo datos");
            } else if (!this.contenido.isEmpty()) 
            {
                System.out.println("No se puede sobrescribir los datos");
            } else {
                System.out.println("Los datos exceden la capacidad del disco.");
            }
        } else 
        {
            System.out.println("El disco no está insertado.");
        }
    }
    
    public void informacionDisco()
    {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Capacidad: " + this.capacidad);
        System.out.println("Contenido: " + this.contenido);
        System.out.println("Tipo de disco: " + this.tipo);
    }  
}

