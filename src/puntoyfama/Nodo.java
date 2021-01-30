package puntoyfama;

/**
 * @author JuanCamilo
 * 
 */

public class Nodo 
{
    private int[] numero, aleatorio;
    private int puntos, famas;
    private Nodo liga;    
    
    public Nodo(int[] pNumero, int[] pAleatorio)    //Constructor clase nodo
    {
        numero = pNumero;
        aleatorio = pAleatorio;
        puntos = getPuntos();
        famas = getFamas();
        liga = null;
    }
        
    public int getNumero(int[] pNumero)  //Este método descompone el vector que
    {                                    //el número ingresado por el usuario
        int num = 1000*numero[0] + 100*numero[1] + 10*numero[2] + numero[3];
        return(num);
    }
    
    public int getPuntos()   //Obtiene los puntos del número ingresado por el 
    {                        //usuario comparando ambos arreglo
        int entero = 0;
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                if((numero[i] == aleatorio[j]) && (i != j)) //CONDICIONES PARA UN PUNTO:
                {                                           //    - Que una posicion tenga el mismo valor en ambos vectores
                    entero++;                               //    - y que dichos números estén en diferentes posiciones
                }
            }
        }
        return(entero);
    }
    
    public int getFamas()    //Obtiene los famas del número ingresado por el
    {                        //usuario comparando ambos arreglo
        int entero = 0;
        for(int i=0; i<4; i++)
        {
            if(numero[i] == aleatorio[i])  //CONDICIONES PARA UNA FAMA:
            {                              //    - Que una posición tenga el mismo valor en ambos vectores
                entero++;                  //    - y que dichos números estén en posiciones iguales
            }
        }
        return(entero);
    }
    
    public Nodo GetLiga()       
    {
        return(liga);
    }
    
    public void setLiga(Nodo pLiga)   
    {
        liga = pLiga;
    }

    public String datosNumero() //Retornar el número, sus puntos y sus famas 
    {
        return(this.getNumero(numero) + "\t" + this.getPuntos() + "\t" + this.getFamas());
    }
}

