package farmtopia.salas;

import farmtopia.Player;

public interface Room { // esta interfaz esta creando una sala generica para el juego.
        String getNombreSala(); // esta linea permite obtener el nombre de la sala
        void manage(Player player);// el metodod manage, sirve para gestionar la interacción entre el jugador y la sala o elntre el usuario y los distintos componentes.

    }

