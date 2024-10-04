package farmtopia.animales;

import farmtopia.Player;

public class Cerdos extends Animal {
    public Cerdos(String nombre, int edad, int salud, int hambre) {
        super(nombre, edad, salud, hambre);
    }

    public void bañar (){
        System.out.println("El cerdito esta bañandose en lodo");
    }
    @Override
    public void alimentar(Player player) {
        System.out.println("El cerdo esta alimentando");
    }
    public void morir (){
        super.morir();
        System.out.println("El cerdo ha muerto");
    }
}
