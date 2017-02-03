package banco; /**
 * Created by ADN on 18/12/2016.
 */
import java.util.Scanner;

public class main {

    public static void main(String args[]) {


        Cuentas cuenta;
        cuenta = new Cuentas();

        int opcion = 0;
        double extraer;
        double limite = cuenta.darLimite();

        Scanner teclado = new Scanner(System.in);

        cuenta.Bienvenida();

        cuenta.obtenerDNI(teclado.nextInt());
        int DNI = cuenta.darDNI();


        while (DNI < 9999999 || DNI > 99999999) {
                System.out.println("ERROR, introduzca un número de 8 dígitos");
                cuenta.obtenerDNI(teclado.nextInt());
                DNI = cuenta.darDNI();}

        double saldo = cuenta.darSaldo();

        while (opcion == 0){
             cuenta.Menu();
            opcion = teclado.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Indique cuanto dinero desea sacar:");
                extraer = teclado.nextDouble();
                double extraerhold = saldo;
                saldo = saldo - extraer;
                if (saldo < limite) {
                    System.out.println("Error, no puede extraer esa cantidad de dinero, o tendrá 100 euros en números rojos");
                    saldo = extraerhold;
                }
                opcion = 0;
                break;
            case 2:
                System.out.println("Introduzca la cantidad que va a introducir");
                double ingreso;
                ingreso = teclado.nextDouble();
                saldo = saldo + ingreso;
                System.out.println("Ha ingresado su dinero correctamente ("+ingreso+") y su saldo ahora es de:  "+saldo+" euros");
                opcion = 0;
                break;
            case 3:
                System.out.println("Su saldo actual es de : "+saldo+" euros");
                opcion = 0;
                break;
            case 4:
                System.out.print("Saliendo del programa");
                opcion = 4;
                break;
        }
        }
    }


}
