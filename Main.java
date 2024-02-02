package Pq480;

public class Main 
{
    public static void main(String[] args) 
    {
        Cd cd = new Cd("CD de Sergio", 10, "", "CD-R");
        System.out.println("---- CD ----");
        //Disco no insertado
        cd.escribirDatos("Disco no insertado");
        System.out.println("");
        //Disco insertado
        cd.girarDisco();
        System.out.println("");
        //Excede el tamaño
        cd.escribirDatos("1234567891011");
        System.out.println("");
        //Normal
        cd.escribirDatos("Hola");
        cd.leerDatos();
        
        DiscoDuro discoDuro = new DiscoDuro("Disco duro de Sergio", 5, "", "Disco Duro");
        System.out.println("\n---- Disco Duro ----");
        //Disco no insertado
        discoDuro.escribirDatos("Disco no conectado");
        System.out.println("");
        //Disco insertado
        discoDuro.girarDisco();
        System.out.println("");
        //Excede el tamaño
        discoDuro.escribirDatos("123456");
        System.out.println("");
        //Normal
        discoDuro.escribirDatos("Hello");
        discoDuro.leerDatos();
        
        discoDuro.informacionDisco();
    }
}
