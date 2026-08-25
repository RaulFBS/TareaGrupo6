/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public abstract class FiguraGeometrica {

    protected String nombre;

    public FiguraGeometrica() {
        this.nombre = "";
    }

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos abstractos obligatorios
    public abstract double calcularAreaFigura();

    public abstract boolean esRegular();
}
