class Arbol {
    private String tipoHojas; // Estado intrínseco

    public Arbol(String tipoHojas) {
        this.tipoHojas = tipoHojas;
    }

    public void dibujar(int coordenadaX, int coordenadaY) {
        System.out.println("Dibujando un árbol de tipo " + tipoHojas + " en (" + coordenadaX + ", " + coordenadaY + ")");
    }
}
