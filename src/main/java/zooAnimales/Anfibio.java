package zooAnimales;
import java.util.ArrayList;
public class Anfibio extends Animal {
    private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
    public static int ranas=0;
    public static int salamandras=0;
    private String colorPiel="None";
    private Boolean venenoso=false;
    public Anfibio(){
        super("nombre",0,"habitat","genero");
        listado.add(this);
    }

    public Anfibio(String nombre, int edad,String habitat,  String genero, String colorPiel, Boolean venenoso){
        super(nombre,edad,habitat,genero);
        this.colorPiel=colorPiel;
        this.venenoso=venenoso;
        listado.add(this);
    }

    public static int cantidadAnfibios(){
        return listado.size();
    }

    public String movimiento(){
        return "saltar";
    }

    public static Anfibio crearRana(String x, int y, String z){
        Anfibio a=new Anfibio(x, y, "selva", z, "rojo", true);
        ranas+=1;
        return a;
    }

    public static Anfibio crearSalamandra(String x, int y, String z){
        Anfibio a=new Anfibio(x, y, "selva", z, "negro", false);
        salamandras+=1;
        return a;
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
