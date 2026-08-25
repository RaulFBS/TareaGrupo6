/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Punto {

    private int coordenadaX;
    private int coordenadaY;

    // Constructor sin parámetros
    public Punto() {
        this.coordenadaX = 0;
        this.coordenadaY = 0;
    }

    // Constructor con parámetros
    public Punto(int coordenadaX, int coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    // Getters y Setters
    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    // Método getDistancia sin parámetros: invoca al método con parámetros
    public double getDistancia() {
        return this.getDistancia(new Punto(0, 0));
    }

    // Método getDistancia con parámetros
    public double getDistancia(Punto otroPunto) {
        int dx = this.coordenadaX - otroPunto.coordenadaX;
        int dy = this.coordenadaY - otroPunto.coordenadaY;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Método toString() requerido
    @Override
    public String toString() {
        return "El punto tiene las siguientes coordenadas: " + coordenadaX + "," + coordenadaY;
    }
}
