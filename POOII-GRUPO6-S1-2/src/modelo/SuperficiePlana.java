package modelo;

import java.util.ArrayList;
import java.util.List;

public class SuperficiePlana {

    private List<FiguraGeometrica> figurasGeometricas;

    public SuperficiePlana() {
        this.figurasGeometricas = new ArrayList<>();
    }

    public void agregarFigura(FiguraGeometrica figura) {
        figurasGeometricas.add(figura);
    }

    public void mostrarAreas() {
        for (FiguraGeometrica fig : figurasGeometricas) {
            System.out.println("Figura: " + fig.getNombre() + " | Área calculada: " + fig.calcularAreaFigura());
        }
    }

    public List<Double> calcularAreas() {
        List<Double> areas = new ArrayList<>();
        for (FiguraGeometrica fig : figurasGeometricas) {
            areas.add(fig.calcularAreaFigura());
        }
        return areas;
    }
}
