package tadarreglo.tad_arreglo;
import java.util.Scanner;
import Impl.ArregloImpl;
public class Main {
    static Scanner consola = new Scanner(System.in);
    private int menu(){
        int opcion;
        System.out.println(
            "---------------------------------------------\n"+
            "1. Agregar en TAD Arreglo\n"+
            "2. Retirar de TAD Arreglo\n"+
            "3. Insertar en TAD Arreglo\n"+
            "4. Buscar en TAD Arreglo\n"+
            "5. Eliminar del TAD Arreglo\n"+
            "6. Imprimir TAD Arreglo\n"+
            "0. FIN\n"+
            "---------------------------------------------\n"+
            "Ingrese la ocion [1-7]");
        opcion = consola.nextInt();
        return opcion;
    }

    public static void main(String[] args){
        int num = 1;
        System.out.println("Ingrese la Cantidad de Elementos: ");
        int cantidad = consola.nextInt();
        ArregloImpl TadArreglo = new ArregloImpl(cantidad);

        int opcion;
        Main objPrincipal = new Main();
        do{
            opcion = objPrincipal.menu();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un Numero: ");
                    num = consola.nextInt();
                    TadArreglo.agregar(num);
                    break;

                case 2:
                    num = TadArreglo.retirarUltimo();
                    System.out.println("Eliminado: "+num);
                    System.out.println(TadArreglo.imprimir());
                    break;

                case 3:
                    System.out.println("Ingrese un numero: ");
                    num = consola.nextInt();
                    System.out.println("Ingrese la posicion: ");
                    int pos = consola.nextInt();
                    TadArreglo.insertar(num, pos);
                    break;
                    
                case 4:
                    System.out.println("Ingrese un Numero a Buscar: ");
                    int numero = consola.nextInt();
                    int posicion = TadArreglo.buscar(numero);
                    if(posicion != -1)
                        System.out.println("Numero Encontrado");
                    else
                        System.out.println("Numero no ENcontrado! ");
                    break;
                    
                case 5:
                    System.out.println("Ingrese la Posicion a Eliminar: ");
                    num = consola.nextInt();
                    TadArreglo.eliminar(num);
                    break;

                case 6:
                    System.out.println(TadArreglo.imprimir());
                    break;

                case 0:
                    System.exit(0);
                    break;
            }
        }while(true);
    }
}
