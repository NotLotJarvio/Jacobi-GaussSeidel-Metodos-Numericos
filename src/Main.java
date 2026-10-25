import Ecuaciones_lineales.SistemaEcuaciones;
import Ecuaciones_lineales.JACOBI.MetodoJacobi;
import Ecuaciones_lineales.Gauss_Seidel.GaussSeidelMetodo;

public class Main {

    public static void main(String[] args) {
        System.out.println("======================================================================");
        System.out.println(" RESOLUCIÓN DE SISTEMA DE ECUACIONES LINEALES (ARQUITECTURA MODULAR)");
        System.out.println(" Tolerancia: " + SistemaEcuaciones.tolerancia + " | Vector inicial: [0.0, 0.0, 0.0]");
        System.out.println("======================================================================");

        System.out.println("--- MÉTODO DE JACOBI ---");
        double[] solJacobi = MetodoJacobi.jacobi(
                SistemaEcuaciones.A,
                SistemaEcuaciones.b,
                SistemaEcuaciones.xInicial,
                SistemaEcuaciones.tolerancia,
                SistemaEcuaciones.maxIter
        );
        imprimirSolucion(solJacobi);

        System.out.println("----------------------------------------------------------------------");
        System.out.println("--- MÉTODO DE GAUSS-SEIDEL ---");
        double[] solGaussSeidel = GaussSeidelMetodo.gaussSeidel(
                SistemaEcuaciones.A,
                SistemaEcuaciones.b,
                SistemaEcuaciones.xInicial,
                SistemaEcuaciones.tolerancia,
                SistemaEcuaciones.maxIter
        );
        imprimirSolucion(solGaussSeidel);
        System.out.println("======================================================================");
    }

    private static void imprimirSolucion(double[] sol) {
        System.out.println("  x = " + sol[0]);
        System.out.println("  y = " + sol[1]);
        System.out.println("  z = " + sol[2]);
    }
}