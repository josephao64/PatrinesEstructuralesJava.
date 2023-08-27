public class ProxyEjemplo {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancariaProxy(5000);

        cuenta.mostrarSaldo();
        cuenta.hacerTransferencia(2000);
        cuenta.hacerTransferencia(6000);
        cuenta.hacerTransferencia(500);
        cuenta.mostrarSaldo();
    }
}
