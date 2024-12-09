package gestion;

import zooAnimales.Animal;
import java.util.ArrayList;
public class Zona {
    private String nombre;
    private Zoologico[] zoo= new Zoologico[1];
    private ArrayList<Animal> animales= new ArrayList<Animal>();
    public Zona(){

    }
    public Zona(String nombre, Zoologico zoo){
        this.nombre=nombre;
        this.zoo[0]=zoo;
    }

    public void agregarAnimales(Animal animal){
        this.animales.add(animal);
    }

    public int cantidadAnimales(){
        return animales.size();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setZoo(Zoologico zoo) {
        this.zoo[0] = zoo;
    }

    public Zoologico getZoo() {
        return zoo[0];
    }

    public void setAnimales(ArrayList<Animal> animales) {
        this.animales = animales;
    }
    
    public ArrayList<Animal> getAnimales() {
        return animales;
    }
}
