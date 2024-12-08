package zooAnimales;
import java.util.ArrayList;
public class Anfibio extends Animal {
    private ArrayList<Anfibio> listado;
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private Boolean venenoso;
    public Anfibio(){
        listado.add(this);
    }

    public Anfibio(String nombre, int edad,String habitat,  String genero, String colorPiel, Boolean venenoso){
        super(nombre,edad,habitat,genero);
        this.colorPiel=colorPiel;
        this.venenoso=venenoso;
        listado.add(this);
    }

    public int cantidadAnfibios(){
        return listado.size()-1;
    }

    public String movimiento(){
        return "saltar";
    }

    public static void crearRana(String x, int y, String z){
        new Anfibio(x, y, "selva", z, "rojo", true);
        ranas+=1;
    }

    public static void crearSalamandra(String x, int y, String z){
        new Anfibio(x, y, "selva", z, "negro", false);
        salamandras+=1;
    }

    public void setListado(ArrayList<Anfibio> listado){
        this.listado=listado;
    }

    public ArrayList<Anfibio> getListado() {
        return listado;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setVenenoso(Boolean venenoso) {
        this.venenoso = venenoso;
    }

    public Boolean isVenenoso() {
        return venenoso;
    }
}