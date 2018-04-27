
public class Nodo {
	private Integer dato;
	private Nodo siguiente;

	public Nodo(Integer dato) {

		this.dato = dato;
		siguiente = null;

	}

	public Integer getDato() {
		return dato;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setDato(Integer dato) {
		this.dato = dato;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

}
