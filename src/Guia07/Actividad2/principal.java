
package Guia07.Actividad2;

import javax.swing.JOptionPane;

public class principal {
    //atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int divicion;
    
    //metodos
    public void leerNumeros(){
    
        numero1 =Integer.parseInt(JOptionPane.showInputDialog("Digita un número: "));
        numero2 =Integer.parseInt(JOptionPane.showInputDialog("Digita un número: "));    
    } 
    
    public void sumar(){
        suma = numero1+numero2;
    }
    public void restar(){
        resta = numero1-numero2;
    }    
    
    public void multiplicar(){
      multiplicacion = numero1*numero2;
    }
       
    public void dividir(){
        divicion = numero1/numero2;
    }
    
    public void mostrarResultador(){
        System.out.println("La suma es: "+suma );
        System.out.println("La resta es: "+resta );
        System.out.println("La multiplicacion es: "+multiplicacion );
        System.out.println("La divicion es: "+divicion );
    }
}
