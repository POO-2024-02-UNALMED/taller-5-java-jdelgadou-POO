package zooAnimales;

import gestion.*;
public class Animal {
    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona[] zona= new Zona[1];

    public Animal(){
        totalAnimales++;
    }
    
    public Animal( String nombre, int edad, String habitat, String genero){
        this();
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
    }

    public String movimiento(){
        return "desplazarse";
    }

    public static String totalPorTipo(){
        return "Mamiferos" + new Mamifero().cantidadMamiferos() + "\n"+
        "Aves" + new Ave().cantidadAves() + "\n"+
        "Reptiles" + new Reptil().cantidadReptiles() + "\n"+
        "Peces" + new Pez().cantidadPeces() + "\n"+
        "Anfibios" + new Anfibio().cantidadAnfibios() + "\n";
    }
    
    public String toString(){
        return "Mi nombre es "+ this.nombre +", tengo una edad de "+ this.edad+", habito en "+this.habitat+" y mi genero es "+this.genero+", la zona en la que me ubico es "+this.zona+", en el "+this.zona[0].getZoo();
    }

    public static void setTotalAnimales(int totalAnimales) {
        Animal.totalAnimales = totalAnimales;
    }

    public static int getTotalAnimales() {
        return totalAnimales;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setZona(Zona zona) {
        this.zona[0] = zona;
    }

    public Zona getZona() {
        return zona[0];
    }
    

}