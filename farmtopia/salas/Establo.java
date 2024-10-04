package farmtopia.salas;

import farmtopia.Player;

import java.util.Scanner;

public class Establo implements Room {

    @Override
    public String getNombreSala() { // pide nombre de la sala y retorna Establo
        return "Establo";
    }

    @Override
    public void manage(Player player) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Has entrado al " + getNombreSala() );
        System.out.println("1.Alimenta  a la vaca y al caballo");
        System.out.println("2.Limpia el establo");
        System.out.println("3.Ordeña la vaca");

        int opcion = sc.nextInt();
        procesarOpcion(opcion, player);
    }

    private void procesarOpcion(int opcion, Player player) {
        switch (opcion) {
            case 1:
                player.feedAlimentoAnimales();
            case 2:
                player.limpiarEstablo();
                break;
            case 3:
                player.ordeñaVaca();
                break;
            default:
                System.out.println("Opción no valida, intentalo de nuevo");

        }
    }
}

