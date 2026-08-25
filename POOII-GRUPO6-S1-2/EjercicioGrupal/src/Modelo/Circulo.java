/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author rs662
 */
public class Circulo {
    private double radio=12.5;
    private String color="Azul";

    public Circulo() {
    }
    public Circulo(double radio, String color){
        radio = this.radio;
        color= this.color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double getArea(double radio){
        double area= radio*radio*Math.PI;
        return  area;
    }

    @Override
    public String toString() {
        return "Circulo:" + "radio:" + radio + ", color:" + color +",Radio:" + getArea(radio);
    }
    
    
    
    
    
    
    
    
}
