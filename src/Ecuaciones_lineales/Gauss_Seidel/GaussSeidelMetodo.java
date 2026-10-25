// Declara el paquete correspondiente a esta clase
package Ecuaciones_lineales.Gauss_Seidel;

// Importa la función calcularError reutilizando el método de Jacobi
import static Ecuaciones_lineales.JACOBI.MetodoJacobi.calcularError;

public class GaussSeidelMetodo {

    public static double[] gaussSeidel(double[][] A, double[] b,
                                       double[] xInicial, double tol, int maxIter) {
        int n = xInicial.length;
        double[] x = xInicial.clone(); // Un solo vector que evoluciona al instante

        for (int iter = 0; iter < maxIter; iter++) {
            double[] xAnt = x.clone(); // Respaldamos el estado anterior para el error
            for (int i = 0; i < n; i++) {
                double suma = b[i]; // Arranca con el término independiente b_i
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        // TODO: Completa el código
                        suma -= A[i][j] * x[j];
                    }
                }
                // TODO: Completa el código
                x[i] = suma / A[i][i];
            }
            // TODO: Completa el código
            double error = calcularError(xAnt, x);
            if (error < tol) {
                System.out.println("[Gauss-Seidel] Convergencia alcanzada en la iteración: " + (iter + 1)
                        + " | Error final: " + String.format("%.8f", error));
                return x;
            }
        }
        return x;
    }
}