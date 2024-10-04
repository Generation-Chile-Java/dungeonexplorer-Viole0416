package farmtopia;
import farmtopia.salas.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Farm {
    public void iniciarJuego() {
        Scanner in = new Scanner(System.in); // se llama a scanner para poder ingresar el nombre del granjero

        System.out.println("¡Hola!");
        System.out.println("Bienvenido a Farmtopia, la vida en el campo, pero sin mosquitos" ); // mensajes de bienvenida
        System.out.println("Granjero, por favor ingresa tu nombre");  // mensaje para solicitar nombre del granjero
        String playerNombre = in.nextLine(); // permite que se solicite el nombre del granjero

        Player player = new Player(playerNombre); // crea al granjero con el nombre ingresado

        System.out.println("Hola" + " " + player.getNombre() + " "+ " , bienvenido a tu Granja, esperamos que te diviertas" ); // este mensaje le indica al jugador que ya ibgreso a la granja.

        while (true) {
            System.out.println("¿A que sala quieres ir?: ");
            System.out.println("Puntaje inicial: " + player.getPuntaje());
            System.out.println("1. Ir al Gallinero");
            System.out.println("2. Ir al Establo");
            System.out.println("3. Ir al Mercado");
            System.out.println("4. Salir del juego");

            int opcion = in.nextInt();
            switch (opcion) {
                case 1:
                    Gallinero gallinero = new Gallinero();
                    gallinero.manage(player);
                    break;
                    case 2:
                        Establo establo = new Establo();
                        establo.manage(player);
                        break;
                        case 3:
                            Mercado mercado = new Mercado();
                            mercado.manage(player);
                            break;
                            case 4:
                                System.out.println("Adiós, " + player.getNombre());
                                return;
                                default:
                                    System.out.println("Opción no válida");

            }
        }
    }
        }





