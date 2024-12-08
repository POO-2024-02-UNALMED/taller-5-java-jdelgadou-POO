package zooAnimales;
import java.util.ArrayList;
public class Mamifero extends Animal{
    private ArrayList<Mamifero> listado;
    public static int caballos;
    public static int leones;
    private Boolean pelaje;
    private int patas;

    public Mamifero(){
        listado.add(this);
    }

    public Mamifero(String nombre, int edad, String habitat, String genero,Boolean pelaje, int patas){
        super(nombre,edad,habitat,genero);
        this.pelaje=pelaje;
        this.patas=patas;
        listado.add(this);
    }

    public int cantidadMamiferos(){
        return listado.size()-1;
    }

    public static void crearCaballo(String x, int y, String z){
        new Mamifero(x, y, "pradera", z, true, 4);
        caballos+=1;
    }

    public static void crearLeon(String x, int y, String z){
        new Mamifero(x, y, "selva", z, true, 4);
        leones+=1;
    }

    public void setListado(ArrayList<Mamifero> listado) {
        this.listado = listado;
    }

    public ArrayList<Mamifero> getListado() {
        return listado;
    }

    public void setPelaje(Boolean pelaje) {
        this.pelaje = pelaje;
    }

    public Boolean isPelaje() {
        return pelaje;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public int getPatas() {
        return patas;
    }
}
