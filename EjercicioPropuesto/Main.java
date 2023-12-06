// RONI COMPANOCCA CHECCO
// CUI: 20210558
// LABORATORIO 17
// FUNDAMENTOS DE PROGRAMACION 
public class Main {
    public static void main(String[] args){
        int cant;
        String cultura[] = {"Romanos: ","Francos: ","Sajones: ","Visigodos: ","Vandalos: "};
        cant = aleatorio(1,10);
        Ejercito e1 = new Ejercito(cultura[aleatorio(0,4)], cant);
        mostrar(e1);
        cant = aleatorio(1,10);
        Ejercito e2 = new Ejercito(cultura[aleatorio(0,4)], cant);
        mostrar(e2);
        determinarGanador(e1,e2);
    }
    
    public static int aleatorio(int a, int b){
        return (int)(Math.random()*(b-a+1))+a;
    }

    public static void mostrar(Ejercito e){
        System.out.print(e);
        System.out.println("\nCantidad total de Soldados: "+Soldado.cuantos()+"\n"+"Espadachines: "+Espadachin.cuantos()+"\n"+"Arqueros: "+Arquero.cuantos()+"\n"+"Caballeros: "+Caballero.cuantos()+"\n");
        Ejercito.resetearCantidad();
    }

    public static void determinarGanador(Ejercito e1, Ejercito e2){
        System.out.println("Ejercito 1: "+e1.getCultura()+""+e1.poder());
        System.out.println("Ejercito 2: "+e2.getCultura()+""+e2.poder());
        if (e1.poder()>e2.poder()){
            System.out.println("El ganador es ejercito 1 de : "+e1.getCultura());
        } else if (e1.poder()<e2.poder()){
            System.out.println("El ganador es ejercito 2 de : "+e2.getCultura());
        } else{
            System.out.println("Sin ganador");
        }
    }
}
