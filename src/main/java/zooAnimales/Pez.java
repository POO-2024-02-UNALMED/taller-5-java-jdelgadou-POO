package zooAnimales;
import java.util.ArrayList;
public class Pez extends Animal{
    private ArrayList<Pez> listado = new ArrayList<Pez>();
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas="None";
    private int cantidadAletas=0;
    public Pez(){
        super("nombre",3,"habitat","genero");
        listado.add(this);
    }

    public Pez( String nombre, int edad, String habitat, String genero,String colorEscamas, int cantidadAletas){
        super(nombre,edad,habitat,genero);
        this.colorEscamas=colorEscamas;
        this.cantidadAletas=cantidadAletas;
        listado.add(this);
    }

    public int cantidadPeces(){
        return listado.size();
    }

    public String movimiento(){
        return "nadar";
    }

    public static Pez crearSalmon(String x, int y, String z){
        Pez p=new Pez(x, y, "oceano", z, "rojo", 6);
        salmones+=1;
        return p;
    }

    public static Pez crearBacalao(String x, int y, String z){
        Pez p=new Pez(x, y, "oceano", z, "gris", 6);
        bacalaos+=1;
        return p;
    }

    public void setListado(ArrayList<Pez> listado){
        this.listado=listado;
    }

    public ArrayList<Pez> getListado() {
        return listado;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }
}
