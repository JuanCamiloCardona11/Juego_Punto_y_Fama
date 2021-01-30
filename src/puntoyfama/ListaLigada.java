package puntoyfama;

import javax.swing.JOptionPane;
/**
 * @author JuanCamilo
 * 
 */
public class ListaLigada 
{

    private Nodo cabeza, ultimo, x;

    public ListaLigada()    //Constructor de la clase ListaLigada
    {
        int[] vecNumero = {0,0,0,0};
        int[] vecAleatorio = {0,0,0,0};
        cabeza = new Nodo(vecNumero, vecAleatorio);
        ultimo = cabeza;
        x = cabeza;
    }     

    public void ingresarNumero(int[] pNumero, int[] pAleatorio)     //Este método permite ingresar un nuevo nodo el cual 
    {                                                               //contiene la info del nuevo nodo y el num aleatorio
        Nodo nodoAct = new Nodo(pNumero, pAleatorio);
        ultimo.setLiga(nodoAct);
        ultimo = nodoAct;
    }

    public String obtenerUltimoDato()  //Este método retorna una cadena con la información  
    {                                  //del último nodo
        return(ultimo.datosNumero());
    }
}
