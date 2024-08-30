
package Guia07.Actividad4;

import javax.swing.JOptionPane;

public class principal {
    //atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //metodos
    public void leerNumeros(){
       
    } 
    
    public void sumar(int numero1, int numero2){
        suma = numero1+numero2;
    }
    public void restar(int numero1, int numero2){
        resta = numero1-numero2;
    }    
    
    public void multiplicar(int numero1, int numero2){
      multiplicacion = numero1*numero2;
    }
       
    public void dividir(int numero1, int numero2){
        division = numero1/numero2;
    }
    
    public void mostrarResultador(){
        System.out.println("La suma es: "+suma );
        System.out.println("La resta es: "+resta );
        System.out.println("La multiplicacion es: "+multiplicacion );
        System.out.println("La divicion es: "+division );
    }
}
 