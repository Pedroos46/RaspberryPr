package api;

/**
 * Clase para almacenar Datos.
 * Objetos de esta clase se envian a traves de la Red
 */
import java.io.*;

public class Data implements Serializable {
    private static final long serialVersionUID = 1L;
    private int valor;

    public Data(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}