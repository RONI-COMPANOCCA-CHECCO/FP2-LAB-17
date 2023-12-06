package Interface;
public interface ArregloInterface {
    public boolean estaVacio();
    public boolean estaLleno();
    public void insertar(int elemento, int posicion);
    public void agregar(int elemento);
    public int retirarUltimo();
    public void eliminar(int elemento);
    public int buscar(int elemento);
    public String imprimir();
}
