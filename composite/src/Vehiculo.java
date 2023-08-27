abstract class Vehiculo {
    protected Motor motor;

    protected Vehiculo(Motor motor) {
        this.motor = motor;
    }

    abstract void conducir();
}
