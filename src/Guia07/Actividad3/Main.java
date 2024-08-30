package Guia07.Actividad3;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));

        principal op = new principal();

        int suma = op.sumar(n1, n2);
        int resta = op.restar(n1, n2);
        int multiplicacion = op.multiplicar(n1, n2);
        int division = op.dividir(n1, n2);

        op.mostrarResultado(suma, resta, multiplicacion, division);
    }
}