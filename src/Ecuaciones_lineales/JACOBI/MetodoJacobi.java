package Ecuaciones_lineales.JACOBI;

public class MetodoJacobi {

    // Calcula la norma infinito (máximo error absoluto entre iteraciones)
    public static double calcularError(double[] xAnt, double[] xNuevo) {
        double maxError = 0.0;
        for (int i = 0; i < xAnt.length; i++) {
            double error = Math.abs(xNuevo[i] - xAnt[i]);
            if (error > maxError) {
                maxError = error;
            }
        }
        return maxError;
    }

    public static double[] jacobi(double[][] A, double[] b,
                                  double[] xInicial, double tol, int maxIter) {
        int n = xInicial.length;
        double[] x = xInicial.clone();
        double[] xNuevo = new double[n]; // Vector separado para la nueva iteración

        for (int iter = 0; iter < maxIter; iter++) {
            for (int i = 0; i < n; i++) {
                double suma = b[i];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        suma -= A[i][j] * x[j];
                    }
                }
                xNuevo[i] = suma / A[i][i];
            }

            double error = calcularError(x, xNuevo);
            x = xNuevo.clone();

            if (error < tol) {
                System.out.println("[Jacobi] Convergencia alcanzada en la iteración: " + (iter + 1)
                        + " | Error final: " + String.format("%.8f", error));
                return x;
            }
        }

        return x;
    }
}