package Guia07.Actividad3;

public class principal {

    // Métodos para realizar operaciones
    public int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public int restar(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public int dividir(int numero1, int numero2) {
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            // Manejar la división por cero
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        }
    }

    // Método para mostrar los resultados
    public void mostrarResultado(int suma, int resta, int multiplicacion, int division) {
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: " + division);
    }
}