package farmtopia.salas;

import farmtopia.Player;

import java.util.Scanner;

public class Mercado implements Room {

    @Override
    public String getNombreSala() { // pide nombre de la sala y retorna Mercado
        return "Mercado";
    }

    @Override
    public void manage(Player player) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Has entrado al " + getNombreSala());
                System.out.println("¿Qué deseas hacer?");
                System.out.println("1. Vender productos");
                System.out.println("2. Ver inventario");

                int opcion = scanner.nextInt();
                procesarOpcion(opcion, player);
            }

            private void procesarOpcion(int opcion, Player player) {
                switch (opcion) {
                    case 1:
                        player.venderProductos();
                        break;
                    case 2:
                        player.verInventario();
                        break;
                    default:
                        System.out.println("Opción no válida, inténtalo de nuevo");
                }
            }
        }
