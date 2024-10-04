package farmtopia.salas;

import farmtopia.Player;

import java.util.Scanner;

public class Gallinero implements  Room{

    @Override
        public String getNombreSala() {
        return "Gallinero";// pide nombre de la sala y retorna Gallinero
    }

    @Override
    public void manage(Player player) {
        Scanner scan = new Scanner(System.in); // este escaner permite recibir la accion del jugador

        System.out.println("Has entrado al " + getNombreSala() + ", ¿que quieres hacer?");
        System.out.println("Puntaje: " + player.getPuntaje());
        System.out.println("1.Alimentar a las gallinas ");
        System.out.println("2.Recoger los huevos de las gallinas");
        System.out.println("3. Limpiar gallinero");
        System.out.println("4. Servir agua  a las gallinas");
        System.out.println("5. Salir del juego");

        int choice = scan.nextInt(); // esto permite que se lea la acción del jugador

        switch (choice) {
            case 1:
                player.feedAlimentoGallinas(); // este metodo permite alimentar a las gallinas.
                break;
            case 2:
                player.feedRecogerHuevos();
                break;
            case 3:
                player.feedLimpiarGallinero();
                break;
            case 4:
                player.feedAguaGallinas();
                break;
                case 5:
                    System.out.println();
            default:
                System.out.println("Opción no valida, inténtalo de nuevo");
        }
    }
}
