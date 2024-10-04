package farmtopia;

public class Player { /* Aqui se crea la clase publica del jugador, esta permite que pueda ser llamada en caso de necesitarla*/
    private String nombre;   //nombre es un atributo privado, que solo pertenece a esta clase.
    private int nivel; // nivel es un atributo que se va a registrar como entero y solo pertenece a esta clase.
    private int puntaje; // puntaje es entero ya tambien pertenece a esta clase.
    private int puntos;

    public Player(String nombre) { // creación del constructor player, se utiliza para llamar la craación de un nuevo objeto.
        this.nombre = nombre; // this es la palabra clave que
        this.nivel = 1;  // Comienza en el nivel 1
        this.puntaje = 0;  // Puntuación inicial
        this.puntos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void subirNivel() {
        nivel++;
        System.out.println("¡Has subido al nivel " + nivel + "!");
    }
    public void mostrarPuntaje() {
        System.out.println("Tu puntaje actual es: " + puntaje);
    }

    public void subirPuntaje() {
        puntaje += puntos;
        System.out.println("Has ganado" + "" + puntos + "puntos.");
    }
    public void aumentarPuntaje(int puntos) {
        puntaje += puntos;
    }

    public void feedAlimentoGallinas() {
        System.out.println("Has alimentado a las gallinas.");
    }

    public void feedRecogerHuevos() {
        System.out.println("Has recogido los huevos.");
    }

    public void feedLimpiarGallinero() {
        System.out.println("Has limpiado el gallinero.");
    }

    public void feedAguaGallinas() {
        System.out.println("Has dado  agua a las gallinas.");
    }

    public void venderProductos() {
        System.out.println("Has vendido los productos.");
    }

    public void verInventario() {
        System.out.println("El inventario esta hecho");
    }

    public void feedAlimentoAnimales() {
        System.out.println("Has alimentado los  animales");
    }

    public void limpiarEstablo() {
        System.out.println("Has limpiado el establo");
    }

    public void ordeñaVaca() {
        System.out.println("Has ordeñado la vaca");
    }

}

