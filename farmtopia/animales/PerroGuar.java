package farmtopia.animales;

import farmtopia.Player;

public class PerroGuar extends Animal {

    public PerroGuar(String nombre, int edad, int salud, int hambre) {
        super(nombre, edad, salud, hambre);
    }

    public void cuidar (){
        System.out.println("El perro guardian esta cuidando la granja");
    }

    @Override
    public void alimentar(Player player) {
        System.out.println("El perro guardián esta satisfecho");
    }
    public void morir(){
        super.morir();
        System.out.println("El perro murio");
    }
}
