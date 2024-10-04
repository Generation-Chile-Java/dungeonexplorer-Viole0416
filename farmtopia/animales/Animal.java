package farmtopia.animales;

import farmtopia.Player;

public abstract class Animal implements AccionAnimal {
    private String nombre;// definición de taributos generales que va a tener cada animal de la granja
    private  int edad;
    private  int salud;
    private int hambre;
    private int vida = 10;


    public Animal(String nombre, int edad, int salud, int hambre) {
        this.nombre = nombre;
        this.edad = edad;
        this.salud = salud;
        this.hambre = hambre;
    } // llamado al constructor para poder crear los animales.

    //Ahora se incluiran metodos
@Override

    public void alimentar (Player player) {
        if  (hambre > 0)  {
            hambre -= 1;
            vida += 1; // aumenta la vida al alimentar al animal
            player.aumentarPuntaje(10); // suma 10 puntos si lo alimenta
            System.out.println(nombre + "  ha sido alimentado.");
        }  else  {
            vida -= 1;
            System.out.println( nombre + " no tiene hambre pero esta debil" );
        }
    }

    public void morir (){
        if (vida <= 0) {
            System.out.println(nombre + "ha muerto :c");
            // si la vida llega a 0 el animal muere y no hay posibilidad de recuperarlo
        } else {
            System.out.println(nombre + " aún esta vivo c: ");
        }



    }
}
