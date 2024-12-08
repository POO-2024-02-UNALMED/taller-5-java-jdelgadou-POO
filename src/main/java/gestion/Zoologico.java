package gestion;
import java.util.ArrayList;
public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zona;
    public Zoologico(){

    }
    public Zoologico(String nombre, String ubicacion){
        this.nombre=nombre;
        this.ubicacion=ubicacion;
    }
    public void agregarZonas(Zona zona){
        this.zona.add(zona);
    }
    
    public int cantidadTotalAnimales(){
        int ani=0;
        for(Zona i:zona){
            ani=i.cantidadAnimales()+ani;
        }
        return ani;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public ArrayList<Zona> getZona() {
        return zona;
    }

    public void setZona(ArrayList<Zona> zona) {
        this.zona=zona;
    }
}
