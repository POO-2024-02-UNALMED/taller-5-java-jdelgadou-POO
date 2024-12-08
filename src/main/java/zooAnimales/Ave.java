package zooAnimales;
import java.util.ArrayList;
public class Ave extends Animal{
    private ArrayList<Ave> listado;
    public static int halcones;
    public static int aguilas;
    private String colorPlumas="None";
    public Ave(){
        listado.add(this);
    }

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){
        super(nombre,edad,habitat,genero);
        this.colorPlumas=colorPlumas;
        listado.add(this);
    }

    public int cantidadAves(){
        return listado.size()-1;
    }

    public String movimiento(){
        return "volar";
    }

    public static Ave crearHalcon(String x, int y, String z){
        Ave a=new Ave(x,y,"montanas",z,"cafe glorioso");
        halcones+=1;
        return a;
    }

    public static Ave crearAguila(String x, int y, String z){
        Ave a= new Ave(x,y,"montanas",z,"blanco y amarrillo");
        aguilas+=1;
        return a;
    }

    public void setListado(ArrayList<Ave> listado){
        this.listado=listado;
    }

    public ArrayList<Ave> getListado() {
        return listado;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }
}
