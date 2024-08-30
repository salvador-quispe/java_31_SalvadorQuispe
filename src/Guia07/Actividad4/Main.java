package Guia07.Actividad4;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String [] args){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digita un número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digita un número: "));
        
        principal op = new principal();
        
        op.sumar(n1,n2);
        op.restar(n1,n2);
        op.multiplicar(n1,n2);
        op.dividir(n1,n2);
        
        op.mostrarResultador();
    }

}

