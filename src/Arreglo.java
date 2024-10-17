import javax.swing.JOptionPane;
public class Arreglo {
    private Arreglo usu[];
    private byte j;

    public Arreglo(byte tam){
        usu=new Arreglo[tam];
        j=-1;
    }

    public boolean arrayVacio() {
        return(j==-1);
    }

    public boolean espacioArray() {
        return (j<usu.length-1);
    }

    public CuentaBanco CapCliente(){
        String numeroCuenta =JOptionPane.showInputDialog("Inserte un numro de Cuenta:");
        double Saldo= Double.parseDouble(JOptionPane.showInputDialog("ingrese el saldo:"));
        byte dia=Byte.parseByte(JOptionPane.showInputDialog("Dia de Apertura:"));
        byte mes=Byte.parseByte(JOptionPane.showInputDialog("mes de Apertura:"));
        int Año=Integer.parseInt(JOptionPane.showInputDialog("Año de apertura:"));
        int nroBene= Integer.parseInt(JOptionPane.showInputDialog("Numero de Beneficiarios:"));
        return new CuentaBanco(numeroCuenta, Saldo, nroBene, dia, mes, Año);
    }

    public

}
