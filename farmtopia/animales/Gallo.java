package farmtopia.animales;

import farmtopia.Player;

public abstract class Gallo extends Animal{
    public Gallo(String nombre, int edad, int salud, int hambre) {
        super(nombre, edad, salud, hambre);
    }
    public void cantar(){
        System.out.println("El  gallo esta cantando");
    }
    @Override
    public void alimentar(Player player) {
        System.out.println("El gallo esta satisfecho");
    }
    public void morir(){
        super.morir();
        System.out.println("Elgallo ha muerto");
    }
}
