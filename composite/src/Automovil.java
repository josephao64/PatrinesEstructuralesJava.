class Automovil extends Vehiculo {
    public Automovil(Motor motor) {
        super(motor);
    }

    public void conducir() {
        System.out.println("Conduciendo un automóvil.");
        motor.arrancar();
    }
}
