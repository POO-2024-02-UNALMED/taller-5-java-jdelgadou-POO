package zooAnimales;
import java.util.ArrayList;
public class Ave extends Animal{
    private static ArrayList<Ave> listado = new ArrayList<Ave>();
    public static int halcones=0;
    public static int aguilas=0;
    private String colorPlumas="None";
    public Ave(){
        super("nombre",3,"habitat","genero");
        listado.add(this);
    }

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){
        super(nombre,edad,habitat,genero);
        this.colorPlumas=colorPlumas;
        listado.add(this);
    }

    public static int cantidadAves(){
        return listado.size();
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
