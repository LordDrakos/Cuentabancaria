package banco;

/**
 * Created by ADN on 18/12/2016.
 */
public class Cuentas {

    int dni;
    double saldo, límite;

     public Cuentas() {
             this.dni=0;
             this.saldo=0;
             this.límite=-100;
        }

    public double darSaldo(){
        return this.saldo;
    }
        public void obtenerDNI(int DNI){
            dni = DNI;
        }

    public int darDNI(){
        return (dni);
    }

    public double darLimite(){
        return this.límite;
    }

    public void Bienvenida(){
        System.out.println("Bienvenido al banco Ruka, vamos a crearte una cuenta bancaria:");
        System.out.println("Primero introduce tu DNI de 8 dígitos numéricos:");
    }

    public void Menu(){
        System.out.print("Usuario '"+this.dni+"', Introduzca ahora la opción que desea realizar : \n" +
                "1- Sacar dinero \n" +
                "2- Ingresar Dinero \n"  +
                "3- Mostrar Saldo \n" +
                "4- Salir \n");
    }


}








