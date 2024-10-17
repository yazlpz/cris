public class CuentaBanco {
    private  String nroCuenta;
    private Beneficiario beneficiarios [];
    private Double Saldo;
    private FechaAP FechaAP;
    private byte nroBene;
    private int i;

    public CuentaBanco(String nroCuenta, double beneficiarios, int saldo, byte dia, byte mes, int año) {
        this.nroCuenta = nroCuenta;
        this.beneficiarios = beneficiarios;
        beneficiarios = new Beneficiario[nroBene];
        Saldo = saldo;
        FechaAP = new FechaAP(dia,mes,año);
        i = 0;//Iniciamos contador

    }

    public void AgregaBene(Beneficiario NuevoBene){
        if (i<beneficiarios.length){//si i es menor que lo que contiene beneficiario
            beneficiarios[i]= NuevoBene;//lo que contenga beneficiarios es igual a nuevo bene
            i++;//agregamos uno al contador
        }
        else
            System.out.println("ya no se puede agregar mas Beneficiarios");//impresion de error con un else
    }
    public void MostrarCuenta(){
        System.out.println("su numero de Cuenta. "+ nroCuenta);
        System.out.println("Saldo" + Saldo);
        FechaAP.MostrarFechaAP();
        for (int j=0; j<beneficiarios.length;j++){//Contador para mostrar datos de beneficiarios
            System.out.println("Beneficiario"+(j+1)+beneficiarios[j].getNombre());//
        }
    }
}
