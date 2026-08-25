package modelo;

public class Triangulo extends FiguraGeometrica {

    private Punto punto1;
    private Punto punto2;
    private Punto punto3;

    public Triangulo() {
        super();
        this.punto1 = new Punto();
        this.punto2 = new Punto();
        this.punto3 = new Punto();
    }

    public Triangulo(String nombre, Punto punto1, Punto punto2, Punto punto3) {
        super(nombre);
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }

    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    public Punto getPunto3() {
        return punto3;
    }

    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }

    @Override
    public double calcularAreaFigura() {
        double x1 = punto1.getCoordenadaX(), y1 = punto1.getCoordenadaY();
        double x2 = punto2.getCoordenadaX(), y2 = punto2.getCoordenadaY();
        double x3 = punto3.getCoordenadaX(), y3 = punto3.getCoordenadaY();
        return Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);
    }

    @Override
    public boolean esRegular() {
        double l1 = punto1.getDistancia(punto2);
        double l2 = punto2.getDistancia(punto3);
        double l3 = punto3.getDistancia(punto1);
        return Math.abs(l1 - l2) < 0.0001 && Math.abs(l2 - l3) < 0.0001;
    }

    @Override
    public String toString() {
        return "Triángulo: " + getNombre() + " tiene 3 Puntos: " + punto1.toString() + "," + punto2.toString() + "," + punto3.toString();
    }
}
