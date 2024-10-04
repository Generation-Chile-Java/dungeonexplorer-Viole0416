package farmtopia.animales;

import farmtopia.Player;

public class Vacas extends Animal {

    public Vacas(String nombre, int edad, int salud, int hambre) {
        super(nombre, edad, salud, hambre);
    }

    public void mugir(){
        System.out.println("La vaca esta mugiendo");
    }
    @Override
    public void alimentar(Player player) {
        System.out.println("La vaca estan satisfecha");
    }
    public void morir (){
        super.morir();
        System.out.println("La vaca ha muerto");
    }
}
