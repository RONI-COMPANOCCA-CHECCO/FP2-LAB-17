package Impl;
import Interface.ArregloInterface;
public class ArregloImpl implements ArregloInterface{
    int Arreglo []; 
    int puntero=0;
    
    //CONSTRUCTOR
    public ArregloImpl(int tamaño){
        Arreglo = new int [tamaño];        
    }

    public boolean estaVacio(){
        return (puntero == 0 ? true : false);
    }

    public boolean estaLleno(){
        return (puntero >= Arreglo.length ? true : false);
    }

    public void insertar(int elemento, int posicion){
        int aux=0;
        if(!estaLleno()){
            for(int i=Arreglo.length-1; i>posicion; i--){
                Arreglo[i-1] = Arreglo[i];
            }
            Arreglo[posicion]=elemento;
            puntero++;
        }else{
            System.out.println("ARREGLO LLENO!!!");
        }
    }

    public void agregar(int elemento){
        if(!estaLleno()){
            Arreglo[puntero]=elemento;
            puntero++;
        }else{
            System.out.println("ARREGLO LLENO!!!");
        }
    }

    public int retirarUltimo(){
        int elemento = -1;
        if(!estaVacio()){
            elemento = Arreglo[puntero-1];
            Arreglo[puntero-1]=0;
            puntero--;
        }else
            System.out.println("ARREGLO VACIO!!!");
        return elemento;
    }

    public void eliminar(int posicion){
        int aux =0;
        if (!estaVacio()){
            for(int i=posicion; i<Arreglo.length-1; i++){
                Arreglo[i]=Arreglo[i+1];
            }
            puntero--;
        }else{
            System.out.println("ARREGLO VACIO!!!");
        }
    }

    public int buscar(int elemento){
        int arregloBusqueda[] = Arreglo.clone();
        Ordenamiento_SelectionSort(arregloBusqueda, 1);
        return metodoBinario(arregloBusqueda, elemento);
    }

    public String imprimir(){
        StringBuilder cadena = new StringBuilder("LISTA\n---------------------------\n");
        for(int x : Arreglo)
            cadena.append(x+" - ");
        return cadena.toString();
    }

    private int metodoBinario(int [] arreglo, int datoBuscado){
        int n = arreglo.length;
        int centro, inferior=0 , superior=n-1;
        while(inferior <= superior){
            centro = (superior+inferior)/2;
            if(arreglo[centro]==datoBuscado)
                return centro;
            else
                if (datoBuscado<arreglo[centro])
                    superior=centro-1;
                else 
                    inferior = centro+1;
            
        }
        return -1;
    }

    private void Ordenamiento_SelectionSort(int [] arreglo, int tipo){
        for (int i=0; i<arreglo.length -1; i++){
            int min = i;
            for (int j=i+1; j<arreglo.length; j++){
                if(tipo==1){
                    if(arreglo[j]<arreglo[min]){
                        min = j;
                    }
                }else{
                    if(arreglo[j]>arreglo[min]){
                        min = j;
                    }
                }
            }
            if ((i!=min)) {
                int aux = arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min] = aux;
            }
        }
    }
}
