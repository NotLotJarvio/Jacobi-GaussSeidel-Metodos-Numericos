# Práctica de Programación en Java: Arquitectura Modular, Jacobi y Gauss-Seidel

**Asignatura:** Métodos Numéricos (Grupo A)  
**Docente:** Víctor Hugo Vásquez Herrera  
**Institución:** Instituto Tecnológico Superior de Xalapa (ITSX) — Ingeniería en Sistemas Computacionales  
**Alumno:** Lot Maximiliano Jarvio Hernández

---

## Descripción del Proyecto
Implementación modular en Java de los métodos iterativos de **Jacobi** y **Gauss-Seidel** para resolver sistemas de ecuaciones lineales $Ax = b$. El diseño separa la definición matricial del sistema, la lógica numérica de cada método y la ejecución principal, reutilizando el cálculo de error por norma infinito (`calcularError`) entre ambos módulos.

## Arquitectura del Proyecto
```text
PracticaJacobiGaussSeidel/
├── README.md
└── src/
    ├── Main.java
    └── Ecuaciones_lineales/
        ├── SistemaEcuaciones.java
        ├── JACOBI/
        │   └── MetodoJacobi.java
        └── Gauss_Seidel/
            └── GaussSeidelMetodo.java
```

## Sistema de Ecuaciones Resuelto
$$\begin{cases} 5x + y + z = 7 \\ x + 4y + z = 6 \\ x + 2y + 5z = 8 \end{cases}$$
* **Vector inicial:** $X^{(0)} = [0, 0, 0]^T$
* **Tolerancia:** $\epsilon = 0.0001$

## Instrucciones de Compilación y Ejecución

### Desde IntelliJ IDEA
1. Abrir el proyecto `PracticaJacobiGaussSeidel`.
2. Ubicarse en `src/Main.java` y presionar el botón **Run (`▶`)**.

### Desde la Terminal
```bash
javac -d out src/Ecuaciones_lineales/SistemaEcuaciones.java src/Ecuaciones_lineales/JACOBI/MetodoJacobi.java src/Ecuaciones_lineales/Gauss_Seidel/GaussSeidelMetodo.java src/Main.java
java -cp out Main
```

## Salida en Consola
```text
======================================================================
 RESOLUCIÓN DE SISTEMA DE ECUACIONES LINEALES (ARQUITECTURA MODULAR)
 Tolerancia: 1.0E-4 | Vector inicial: [0.0, 0.0, 0.0]
======================================================================
--- MÉTODO DE JACOBI ---
[Jacobi] Convergencia alcanzada en la iteración: 16 | Error final: 0.00005232
  x = 0.9999869210370103
  y = 0.9999847412109375
  z = 0.9999825613848647
----------------------------------------------------------------------
--- MÉTODO DE GAUSS-SEIDEL ---
[Gauss-Seidel] Convergencia alcanzada en la iteración: 6 | Error final: 0.00007244
  x = 0.9999938115800001
  y = 1.000000151955
  z = 1.0000011769019999
======================================================================
```