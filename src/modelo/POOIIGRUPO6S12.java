/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modelo;

import java.util.List;

public class POOIIGRUPO6S12 {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("  PRUEBA DE CLASES - ACTIVIDAD 2");
        System.out.println("==========================================");

        // 1. Instanciación de objetos Punto
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(4, 0);
        Punto p3 = new Punto(2, 3);

        // 2. Instanciación de Triangulo (subclase de FiguraGeometrica)
        Triangulo triangulo = new Triangulo("Triángulo Alpha", p1, p2, p3);

        // 3. Ejecución de métodos
        System.out.println("\n[1] Datos del Triángulo:");
        System.out.println(triangulo.toString());
        System.out.println("Área: " + triangulo.calcularAreaFigura());
        System.out.println("¿Es regular?: " + triangulo.esRegular());

        System.out.println("\n[2] Pruebas de distancia (Sobrecarga en Punto):");
        System.out.println("Distancia de p2 al origen: " + p2.getDistancia());
        System.out.println("Distancia de p1 a p2: " + p1.getDistancia(p2));

        // 4. Uso de SuperficiePlana (Demostración de Polimorfismo)
        SuperficiePlana superficie = new SuperficiePlana();
        superficie.agregarFigura(triangulo);

        System.out.println("\n[3] Reporte polimórfico de Superficie Plana:");
        superficie.mostrarAreas();

        // 5. Método que DEVUELVE las áreas (requisito explícito del enunciado)
        List<Double> areas = superficie.calcularAreas();
        System.out.println("\n[4] Lista de áreas retornada por calcularAreas(): " + areas);

        System.out.println("==========================================");
    }
}
