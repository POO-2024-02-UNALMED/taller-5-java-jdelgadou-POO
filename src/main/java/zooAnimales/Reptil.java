package zooAnimales;
import java.util.ArrayList;
public class Reptil extends Animal{
    private ArrayList<Reptil> listado;
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;
    public Reptil(){
        listado.add(this);
    }

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola){
        super(nombre,edad,habitat,genero);
        this.colorEscamas=colorEscamas;
        this.largoCola=largoCola;
        listado.add(this);
    }

    public int cantidadReptiles(){
        return listado.size()-1;
    }

    public String movimiento(){
        return "reptar";
    }

    public static void crearIguana(String x, int y, String z){
        new Reptil(x,y,"humedal",z,"verde",3);
        iguanas+=1;
    }

    public static void crearSerpiente(String x, int y, String z){
        new Reptil(x,y,"jungla",z,"blanco",1);
        serpientes+=1;
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