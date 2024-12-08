package zooAnimales;
import java.util.ArrayList;
public class Mamifero extends Animal{
    private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
    public static int caballos=0;
    public static int leones=0;
    private Boolean pelaje=false;
    private int patas=0;

    public Mamifero(){
        super("nombre",3,"habitat","genero");
        listado.add(this);
    }

    public Mamifero(String nombre, int edad, String habitat, String genero,Boolean pelaje, int patas){
        super(nombre,edad,habitat,genero);
        this.pelaje=pelaje;
        this.patas=patas;
        listado.add(this);
    }

    public static int cantidadMamiferos(){
        return listado.size();
    }

    public static Mamifero crearCaballo(String x, int y, String z){
        Mamifero m=new Mamifero(x, y, "pradera", z, true, 4);
        caballos+=1;
        return m;
    }

    public static Mamifero crearLeon(String x, int y, String z){
        Mamifero m=new Mamifero(x, y, "selva", z, true, 4);
        leones+=1;
        return m;
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
