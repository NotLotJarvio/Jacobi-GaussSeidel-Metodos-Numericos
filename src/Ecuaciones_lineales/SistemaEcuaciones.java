package Ecuaciones_lineales;

public class SistemaEcuaciones {

    // Matriz de coeficientes A del sistema:
    // 5x +  y +  z = 7
    //  x + 4y +  z = 6
    //  x + 2y + 5z = 8
    public static final double[][] A = {
            {5.0, 1.0, 1.0},
            {1.0, 4.0, 1.0},
            {1.0, 2.0, 5.0}
    };

    // Vector de términos independientes b
    public static final double[] b = {7.0, 6.0, 8.0};

    // Vector inicial X^(0) = [0, 0, 0]^T
    public static final double[] xInicial = {0.0, 0.0, 0.0};

    // Tolerancia de error y máximo de iteraciones
    public static final double tolerancia = 0.0001;
    public static final int maxIter = 100;
}