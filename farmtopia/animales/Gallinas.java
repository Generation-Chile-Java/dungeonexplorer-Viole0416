package farmtopia.animales;

import farmtopia.Player;

public class Gallinas extends Animal {
    public Gallinas(String nombre, int edad, int salud, int hambre) {
        super(nombre, edad, salud, hambre);
    }
    public void ponerHuevos (){
        System.out.println("La gallina esta poniendo huevos");
    }

    @Override
    public void alimentar(Player player) {
        System.out.println("Las gallinas estan satisfechas.");
    }

    public void  morir(){
        super.morir();
        System.out.println("Las gallinas han muerto");
    }
}
