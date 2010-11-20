public interface InterfazGrafo<E> 
{
  	public void nuevoNodo(int indice, String informacion);
    public void nuevoArco(int inicio, int fin, int costo);
}
