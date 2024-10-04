package farmtopia.animales;

import farmtopia.Player;

public class Caballos extends Animal {

    public Caballos(String nombre, int edad, int salud, int hambre) {
        super(nombre, edad, salud, hambre);
    }
    public void galopar(){
        System.out.println("EL caballo esta galopando ");
    }
    @Override
    public void alimentar(Player player) {
        System.out.println("El caballo esta satisfecho.");
    }
    public void morir (){
        super.morir();
        System.out.println("El caballo ha muerto");
    }
}
