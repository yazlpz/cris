public class Cliente {
    private int noCte;
    private CuentaBanco[] cuentas;
    private int numCuentas;

    public Cliente(int n) {
        this.noCte = 0;
        this.cuentas = new CuentaBanco[n];
        this.numCuentas = 0;
    }

    public void agregarCuenta(CuentaBanco cuenta) {
        if (numCuentas < cuentas.length) {
            cuentas[numCuentas++] = cuenta;
        } else {
            System.out.println("No hay cupo para más cuentas.");
        }
    }

    public void consultarCuentas() {
        for (int i = 0; i < numCuentas; i++) {
            cuentas[i].mostrarCuenta();
        }
    }

    public CuentaBanco obtenerCuenta(int index) {
        if (index >= 0 && index < numCuentas) {
            return cuentas[index];
        } else {
            System.out.println("Índice de cuenta inválido.");
            return null;
        }
    }
}

