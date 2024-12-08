package zooAnimales;
import java.util.ArrayList;
public class Pez extends Animal{
    private ArrayList<Pez> listado;
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;
    public Pez(){
        listado.add(this);
    }

    public Pez( String nombre, int edad, String habitat, String genero,String colorEscamas, int cantidadAletas){
        super(nombre,edad,habitat,genero);
        this.colorEscamas=colorEscamas;
        this.cantidadAletas=cantidadAletas;
        listado.add(this);
    }

    public int cantidadPeces(){
        return listado.size()-1;
    }

    public String movimiento(){
        return "nadar";
    }

    public static void crearSalmon(String x, int y, String z){
        new Pez(x, y, "°ceano", z, "rojo", 6);
        salmones+=1;
    }

    public static void crearBacalao(String x, int y, String z){
        new Pez(x, y, "°ceano", z, "gris", 6);
        bacalaos+=1;
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
