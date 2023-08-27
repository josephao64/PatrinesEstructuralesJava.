public class Main {
    public static void main(String[] args) {
        Motor motorGasolina = new MotorGasolina();
        Motor motorElectricidad = new MotorElectricidad();

        Vehiculo automovilGasolina = new Automovil(motorGasolina);
        Vehiculo automovilElectricidad = new Automovil(motorElectricidad);

        automovilGasolina.conducir();
        automovilElectricidad.conducir();
}
}