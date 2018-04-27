

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ListaEncryptionString {

	Nodo actual;
	Nodo inicio;

	public ListaEncryptionString() {
		actual = null;
		inicio = null;

	}

	public void abrir(String direccionParcial, String nombreArchivo) throws IOException {
		// ruta del archivo en el pc
		String direccion = direccionParcial + "\\\"" + nombreArchivo + "\"";
		System.out.println(direccion);
		String file = new String(direccion);

		// definiendo la ruta en la propiedad file
		Runtime.getRuntime().exec("cmd /c start " + file);

	}

	public void insertarFinalCircular(Integer elem) {
		Nodo nuevo = new Nodo(elem);
		nuevo.setSiguiente(nuevo);

		if (actual == null) {
			actual = nuevo;

		} else {
			Nodo aux = actual;
			while (aux.getSiguiente() != actual) {
				aux = aux.getSiguiente();
				// System.out.println("--");
			}
			aux.setSiguiente(nuevo);
			nuevo.setSiguiente(actual);

		}

	}

	public Nodo obtenerArchivo(String entrada) throws IOException {
		ListaEncryptionString valores = new ListaEncryptionString();
		FileInputStream in = new FileInputStream(entrada);
		int c;
		while ((c = in.read()) != -1) {

			// valores.insertarFinal(c);
			// System.out.println((char)c);
			valores.insertarFinalSimple(c);

		}
		return valores.inicio;

	}

	public Nodo obtenerKey(String key) {
		ListaEncryptionString lista1 = new ListaEncryptionString();

		int a;
		int i = 0;
		for (i = 0; i < key.length(); i++) {
			a = key.charAt(i);
			// System.out.println(a + "--" + (char) a);
			lista1.insertarFinalCircular(a);

		}
		// System.out.println(key);
		// lista1.imprimirListaCircular();
		return lista1.actual;

	}

	public Integer encriptar(Integer dato1, Integer key) {
		Integer auxDato = 0;

		auxDato = dato1 + key;
		if (auxDato > 255) {
			auxDato = auxDato - 256;

		}

		return auxDato;
	}

	public Integer desencriptar(Integer dato1, Integer key) {
		Integer auxDato = 0;

		auxDato = dato1 - key;
		if (auxDato < 0) {

			auxDato = auxDato + 256;

		}

		return auxDato;
	}

	public void encriptarDocumento(Nodo key, String direccion) throws IOException, KeyNotFoundException {
		ListaEncryptionString l = new ListaEncryptionString();
		System.out.println(direccion);
		l.actual = key;
		if (l.actual == null) {
			throw new KeyNotFoundException();

		}

		l.inicio = obtenerArchivo(direccion);
		if (l.inicio == null) {
			throw new FileNotFoundException();

		}
		ListaEncryptionString listaEncriptada = new ListaEncryptionString();
		Integer auxDato;
		Nodo aux = l.inicio;
		Nodo auxKey = l.actual;
		while (aux != null) {
			auxDato = l.encriptar(aux.getDato(), auxKey.getDato());
			// System.out.println("Dato encriptado: " + auxDato + "dato:key" +
			// aux.getDato() + " -- " + auxKey.getDato());
			listaEncriptada.insertarFinalSimple(auxDato);

			auxKey = auxKey.getSiguiente();
			aux = aux.getSiguiente();
		}
		listaEncriptada.imprimirListaSimple();
		insertarListaObjeto(listaEncriptada.inicio, direccion);

	}

	public void desencriptarDocumento(Nodo key, String direccion) throws IOException, KeyNotFoundException {
		ListaEncryptionString l = new ListaEncryptionString();
		System.out.println(direccion);
		l.actual = key;
		if (l.actual == null) {
			throw new KeyNotFoundException();

		}

		l.inicio = obtenerArchivo(direccion);
		if (l.inicio == null) {
			throw new FileNotFoundException();

		}
		ListaEncryptionString listaDesencriptada = new ListaEncryptionString();
		Integer auxDato;
		Nodo aux = l.inicio;
		Nodo auxKey = l.actual;
		while (aux != null) {
			auxDato = l.desencriptar(aux.getDato(), auxKey.getDato());
			listaDesencriptada.insertarFinalSimple(auxDato);
			// System.out.println("Dato desncriptado: " + auxDato + "dato:key" +
			// aux.getDato() + " -- " + auxKey.getDato());
			auxKey = auxKey.getSiguiente();

			aux = aux.getSiguiente();
		}

		insertarListaObjeto(listaDesencriptada.inicio, direccion);

	}

	public void insertarListaObjeto(Nodo lista1, String salida) throws IOException {

		FileOutputStream ou = new FileOutputStream(salida, false);

		int c = 0;

		Nodo aux = lista1;

		while (aux != null) {
			// System.out.println("-------agregando");
			c = aux.getDato();

			ou.write(c);
			aux = aux.getSiguiente();

		}
		ou.close();
		// System.out.println("-------Se agrego");

	}

	public void insertarFinalSimple(Integer elemento) {

		Nodo nuevo = new Nodo(elemento);
		Nodo aux = inicio;
		if (inicio == null) {
			inicio = nuevo;
		} else {
			while (aux.getSiguiente() != null) {

				aux = aux.getSiguiente();

			}
			aux.setSiguiente(nuevo);

		}

	}

	public void imprimirListaSimple() {
		Nodo aux = inicio;

		while (aux != null) {
			System.out.println(aux.getDato());
			aux = aux.getSiguiente();

		}

	}

	public void imprimirListaCircular() {
		if (actual != null) {
			Nodo aux = actual;
			do {

				System.out.println(aux.getDato());
				aux = aux.getSiguiente();

			} while (aux != actual);

		}

	}

}
