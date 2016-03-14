import java.util.ArrayList;
/**
 * Write a description of class MiHashSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashSet
{
    private int[] coleccion;
    /**
     * Constructor for objects of class MiHashSet
     */
    public MiHashSet()
    {
        coleccion = new int[0];
    }

    /**
     * Metodo que añade el elemento al conjunto si no estaba. 
     * Devuelve verdadero en caso de que el elemento no estuviera presente en el conjunto 
     * y falso en caso contrario.
     */
    public boolean add(int valor)
    {
        boolean noEncontrado = true;
        for(int i = 0; i < coleccion.length && noEncontrado; i++){
            if(valor == coleccion[1]){
                noEncontrado = false;
            }
        }
        if(noEncontrado){
            int[] coleccion1 = new int[(coleccion.length + 1)];
            for(int cont = 0; coleccion.length > cont; cont++){
                coleccion1[cont] = coleccion[cont];
            }
            coleccion1[coleccion.length] = valor;
            coleccion = coleccion1;
        }
        return noEncontrado;
    }
}
