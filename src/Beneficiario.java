public class Beneficiario {
    private String nombre;
    private int AñoNac;
    private String sexo;

    public Beneficiario(String nombre, int AñoNac , String sexo) {
        this.nombre = nombre;
        this.AñoNac = AñoNac;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñoNac() {
        return AñoNac;
    }

    public void setAñoNac(int añoNac) {
        AñoNac = añoNac;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Beneficiario{" +
                "AñoNac=" + AñoNac +
                ", nombre='" + nombre + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
