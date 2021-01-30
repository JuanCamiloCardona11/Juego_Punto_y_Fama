
package puntoyfama;

import java.util.Random;
/**
 * @author JuanCamilo
 * 
 */
public class NumAleatorio 
{
    private int[] vecNumero;    //Atributo vector para guardar el número aleatorio generado 
    
    public NumAleatorio()   //Constructor de la clase NumAleatorio
    {
        vecNumero = new int[4];        
        llenarArreglo(vecNumero);
    }  
    
    public int[] getArreglo()   //Este método retorna el arreglo con el número aleatorio dentro de él
    {
        return(vecNumero);
    }
    
    public int numAleatorio()   //Se crea el objeto necesario para generar el número aleatorio
    {
        Random aleatorio = new Random();
        int numAleatorio = aleatorio.nextInt(10);
        return(numAleatorio);
    }
    
    public boolean verificarArreglo(int[] vecNumero)    //Verifica que todos los dígitos del número
    {                                                   //aleatorio sean diferentes entre sí.
        int i = 0,j = 1;
        if(vecNumero[0] == 0)
        {
            return(false);
        }
        else
        {
            while(i < vecNumero.length - 1)
            {
                j = i + 1;
                while(j < vecNumero.length)
                {
                    if (vecNumero[i] == vecNumero[j])
                    {
                        return(false);
                    }
                    j++;
                }
                i++;
            }
        }
        return(true);
    }
    
    public void llenarArreglo(int[] vecNumero)  //Llena el arreglo con números aleatorios mientras
    {                                           //Este arreglo no contenga un número aleatorio válido.
        while(!verificarArreglo(vecNumero))
        {
            for(int i = 0 ; i < 4 ; i++)
            {
                vecNumero[i] = numAleatorio();
            }
        }
    }
}
