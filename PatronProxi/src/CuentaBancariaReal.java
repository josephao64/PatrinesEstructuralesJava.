class CuentaBancariaReal implements CuentaBancaria {
    private double saldo;

    public CuentaBancariaReal(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }

    public void hacerTransferencia(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Transferencia realizada: " + cantidad);
        } else {
            System.out.println("Saldo insuficiente para la transferencia");
        }
    }
}