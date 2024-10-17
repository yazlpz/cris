public class FechaAp {
    private int dia;
    private int mes;
    private int año;

    public FechaAp(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + año;
    }
}
