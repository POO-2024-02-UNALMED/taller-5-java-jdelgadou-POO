package zooAnimales;
import java.util.ArrayList;
public class Reptil extends Animal{
    private static ArrayList<Reptil> listado= new ArrayList<Reptil>();
    public static int iguanas=0;
    public static int serpientes=0;
    private String colorEscamas="none";
    private int largoCola=0;
    public Reptil(){
        super("nombre",3,"habitat","genero");
        listado.add(this);
    }

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola){
        super(nombre,edad,habitat,genero);
        this.colorEscamas=colorEscamas;
        this.largoCola=largoCola;
        listado.add(this);
    }

    public static int cantidadReptiles(){
        return listado.size();
    }

    public String movimiento(){
        return "reptar";
    }

    public static Reptil crearIguana(String x, int y, String z){
        Reptil r=new Reptil(x,y,"humedal",z,"verde",3);
        iguanas+=1;
        return r;
    }

    public static Reptil crearSerpiente(String x, int y, String z){
        Reptil r=new Reptil(x,y,"jungla",z,"blanco",1);
        serpientes+=1;
        return r;
    }

    public void setListado(ArrayList<Reptil> listado){
        this.listado=listado;
    }

    public ArrayList<Reptil> getListado() {
        return listado;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }

    public int getLargoCola() {
        return largoCola;
    }
}
