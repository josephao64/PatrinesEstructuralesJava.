class CuentaBancariaProxy implements CuentaBancaria {
    private CuentaBancariaReal cuentaReal;

    public CuentaBancariaProxy(double saldoInicial) {
        this.cuentaReal = new CuentaBancariaReal(saldoInicial);
    }

    public void mostrarSaldo() {
        cuentaReal.mostrarSaldo();
    }

    public void hacerTransferencia(double cantidad) {
        if (cantidad > 1000) {
            System.out.println("Se requiere autorización adicional para transferencias grandes");
        } else {
            cuentaReal.hacerTransferencia(cantidad);
        }
    }
}