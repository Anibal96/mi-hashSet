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
            if(valor == coleccion[i]){
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

    /**
     * Metodo que vacía el conjunto.
     */
    public void clear()
    {
        coleccion = new int[0];
    }

    /**
     *  Metodo que devuelve verdadero si el conjunto contiene el elemento, falso en caso contrario.
     */
    public boolean contains(int elemento)
    {
        boolean encontrado = false;
        for(int i = 0; i < coleccion.length && !encontrado; i++){
            if(coleccion[i] == elemento){
                encontrado = true;
            }
        }
        return encontrado;
    }

    /**
     * Metodo que devuelve verdadero si el conjunto no contiene elementos.
     */
    public boolean isEmpty()
    {
        return coleccion.length == 0;
    }

    /**
     * Metodo que elimina del conjunto el elemento dado. 
     * Si no existiera devuelve falso; 
     * si existía en el conjunto devuelve verdadero.
     */
    public boolean remove(int elemento)
    {
        boolean eliminado = false;
        int[] coleccion1;
        for(int i = 0;i < coleccion.length && !eliminado;i++){
            if(coleccion[i] == elemento){
                coleccion1 = new int[(coleccion.length - 1)];
                int cont = 0;
                while(coleccion.length > cont && cont < i){
                    coleccion1[cont] = coleccion[cont];
                    cont++;
                }
                while(coleccion.length > cont+1){
                    coleccion1[cont] = coleccion[cont+1];
                    cont++;
                }
                coleccion = coleccion1;
                eliminado = true;
            }
        }
        return eliminado;
    }

    /**
     * Metodo que devuelve el número de elementos del conjunto.
     */
    public int size()
    {
        return coleccion.length;
    }

    /**
     * Metodo que devuelve una cadena conteniendo todos los elementos del conjunto separados por comas y entre corchetes.
     */
    public String toString()
    {
        String cadena = "[";
        if(coleccion.length != 0){
            cadena = cadena + coleccion[0];
            for(int i = 1; i < coleccion.length; i++){
                cadena = cadena + ", " + coleccion[i];
            }
        }
        cadena = cadena + "]";
        return cadena;
    }

    /**
     * Metodo que devuelve verdadero si el parámetro es igual al conjunto sobre el que se invoca 
     * y falso en otro caso.
     */
    public boolean equals(MiHashSet otroConjunto)
    {
        boolean igual = true;
        if(coleccion.length == otroConjunto.size()){
            for (int i = 0;i < coleccion.length && igual;i++){
                if(!(otroConjunto.contains(coleccion[i]))){
                    igual = false;
                }
            }
        }
        return igual;
    }
}
