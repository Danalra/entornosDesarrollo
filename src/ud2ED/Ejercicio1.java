package ud2ED;

// Identificar el error lógico (en caso de que haya) y corregirlo para que el bucle
//funcione correctamente. Hacer una tabla.
public class Ejercicio1 {
	public static void main(String[] args) {
		int n = 5;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("La suma de los números del 1 al " + n + " es: " + sum);
	}
}

// 'Control Shift F' para colocar el código
